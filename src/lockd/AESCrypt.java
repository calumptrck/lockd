package lockd;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESCrypt {

    private static SecretKeySpec secretKey;
    private static byte[] key;

    /*
     * @purpose: Sets the key for the AES algorithm implementation.
     * @param: String mykey: The key to be set.
     */
    
    public static void setKey(String myKey) {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    /*
     * @purpose: Encrypts the given string.
     * @param: String plaintext: the desired string to be encrypted.
               String secret: the secretKey to encrypt the String with.
     * @returns: The encrypted string
     */
    
    public static String encrypt(String plaintext, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(plaintext.getBytes("UTF-8")));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }
    
    /*
     * @purpose: Decrypts the given string.
     * @param: String ciphertext: the desired string to be decrypted.
               String secret: the secretKey to decrypted the String with.
     * @returns: The decrypted string
     */
    
    public static String decrypt(String ciphertext, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(ciphertext)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
}
