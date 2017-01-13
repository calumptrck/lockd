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
    
    public Locker(String secretkey){
        this.secretKey = secretkey;
    }
    
    /*
     * @purpose: Tests to see if the key unlocks the locker.
     */
    public void unlock(){
        try{
            //TODO test for unlocking;
            if(this.secretKey.equals("anObject")){
                isUnlocked = true;
                //DOSOMETHING;
            }
        }catch(Exception e){
            System.out.println("An exception has occured when unlocking: "
                    + this.getClass());
        }
    }
    
}
