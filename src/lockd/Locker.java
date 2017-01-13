package lockd;

/**
 * @author johnandrewoss
 * @date 01/11/2017
 * @title Locker.java
 * @purpose Container for all of the passwords.
 *
 */

public class Locker {
    
    protected boolean isUnlocked = false;
    protected String secretKey = "";
    
    public Locker(String secretkey) {
        setCryptoKey(secretkey);
    }
    
    /*
     * @purpose: Tests to see if the key unlocks the locker by comparing hashes.
     * @see: Crypto.sha256hash for the implementation.
     */
    public final void unlock() {
        try {
            //TODO test for unlocking;
            if(Crypto.sha256hash(this.secretKey).equals("SAVED HASH")) {
                isUnlocked = true;
                //TODO unlocking
                //Crypto.decrypt(UTF-8_file,this.secretKey);
            }
        } catch(Exception e) {
            System.out.println("Error while unlocking" + e.toString());
        }
    }
        
    /*
     * @purpose: Sets the current locker's secretKey
     * @param: String secretKey: the secretKey to be assigned to this. 
     */
    public final void setCryptoKey(String secretKey){
        this.secretKey = secretKey;
    }
    
}
