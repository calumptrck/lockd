package lockd;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author johnandrewoss
 * @date 01/11/2017
 * @title Locker.java
 * @purpose Handles locking and unlocking of lockers.
 *
 */

public class Locker {

    private boolean unlocked = false;
    private String secretKey = "";
    private String data;
    private String hash;

    public Locker(String secretkey) {
        setCryptoKey(secretkey);
        try {
            this.data = new String(Files.readAllBytes(Paths.get("data.csv")));
            this.hash = new String(Files.readAllBytes(Paths.get("hash.txt")));     
        } catch (Exception e) {
            System.out.println("Error while reading file: " + e.toString());
            wipeLocker();
        }
    }

    /*
     * @purpose: Unlocks the contents of the locker.
     * @returns: The decrypted contents of the locker.
     * @see: Crypto for the implementation of decryption.
     */
    public final String unlock() {
        try {
            if(this.hash == null || "".equals(this.hash)){
                wipeLocker();
                return null;
            }
            if (hashesEqual() && unlocked == false) {
                this.data = Crypto.decrypt(this.data, this.secretKey);
                unlocked = true;
                return this.data;
            }
        } catch (Exception e) {
            System.out.println("Error while unlocking: " + e.toString());
        }
        return null;
    }

    /*
     * @purpose: Locks the locker.
     * @see: Crypto.encrypt for the implementation.
     */
    public final void lock() {
        try {
            if (unlocked) {
                this.data = Crypto.encrypt(this.data, this.secretKey);
                unlocked = false;
                byte[] d = this.data.getBytes(Charset.forName("UTF-8"));
                Files.write(Paths.get("data.csv"), d, StandardOpenOption.TRUNCATE_EXISTING);
                //Most likely will be moved.
                byte[] h = this.hash.getBytes(Charset.forName("UTF-8"));
                Files.write(Paths.get("hash.txt"), h, StandardOpenOption.TRUNCATE_EXISTING);
            }
        } catch (Exception e) {
            System.out.println("Error while locking: " + e.toString());
        }
    }

    /*
     * @purpose: Sets the current locker's secretKey
     * @param: String secretKey: the secretKey to be assigned to this. 
     */
    public final void setCryptoKey(String secretKey) {
        this.secretKey = secretKey;
    }
    
    //Temporary until something better is found.
    public final void saveFile(String data){
        this.data = data;
        this.lock();
    }

    /*
     * @purpose: Wipes the locker if the hash was deleted.
     * @see: Makes deleting the hash actually bad.
     */
    public final void wipeLocker(){
        try{
            System.out.println("Wiping Locker");
            byte[] d = Crypto.sha256hash(this.secretKey).getBytes("UTF-8");
            byte[] s = "".getBytes("UTF-8");
            Files.write(Paths.get("hash.txt"), d, StandardOpenOption.TRUNCATE_EXISTING);
            Files.write(Paths.get("data.csv"), s, StandardOpenOption.TRUNCATE_EXISTING);   
        }catch(Exception e){
            System.out.println("Error during wiping: " + e.toString());
        }
    }
    
    /*
     * @purpose: Checks to see if the hash equals the saved hash.
     * @see: Crypto.encrypt for the implementation.
     */
    private boolean hashesEqual() {
        return Crypto.sha256hash(this.secretKey).equals(this.hash);
    }

    /*
     * @purpose: For classes outside Locker.java to see if the Locker is unlocked.
     */
    public final boolean isUnlocked() {
        return unlocked;
    }
}
