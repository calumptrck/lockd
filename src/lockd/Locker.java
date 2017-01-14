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
            //TODO: Make this not terribly insecure.
            if(this.hash.isEmpty()){
                this.hash = Crypto.sha256hash(this.secretKey);
            }
        } catch(Exception e){
            System.out.println("Error while reading file: " + e.toString());
        }
        System.out.println(hashesEqual());
    }
    
    /*
     * @purpose: Unlocks the contents of the locker.
     * @see: Crypto.sha256hash for the implementation.
     */
    public final void unlock() {
        try {
            if(hashesEqual() && unlocked == false) {
                this.data = Crypto.decrypt(this.data, this.secretKey);
                unlocked = true;
                //TODO: Passing to FileIO.
            }
        } catch(Exception e) {
            System.out.println("Error while unlocking: " + e.toString());
        }
    }
    
    /*
     * @purpose: Locks the locker.
     * @see: Crypto.encrypt for the implementation.
     */
    public final void lock(){
        try{
            if(unlocked){
                this.data = Crypto.encrypt(this.data, this.secretKey);
                unlocked = false;
                byte[] d = this.data.getBytes(Charset.forName("UTF-8"));
                Files.write(Paths.get("data.csv"), d, StandardOpenOption.TRUNCATE_EXISTING);
                //Most likely will be moved.
                byte[] h = this.hash.getBytes(Charset.forName("UTF-8"));
                Files.write(Paths.get("hash.txt"), h, StandardOpenOption.TRUNCATE_EXISTING);
            }
        } catch(Exception e){
           System.out.println("Error while locking: " + e.toString());
        }
    }
    
    /*
     * @purpose: Sets the current locker's secretKey
     * @param: String secretKey: the secretKey to be assigned to this. 
     */
    public final void setCryptoKey(String secretKey){
        this.secretKey = secretKey;
    }
    
    /*
     * @purpose: Checks to see if the hash equals the saved hash.
     * @see: Crypto.encrypt for the implementation.
     */
    private final boolean hashesEqual(){
        return Crypto.sha256hash(this.secretKey).equals(this.hash);
    }
    
    /*
     * @purpose: For classes outside Locker.java to see if the Locker is unlocked.
     */
    public final boolean isUnlocked(){
        return unlocked;
    }    
}
