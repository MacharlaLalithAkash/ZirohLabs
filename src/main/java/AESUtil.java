import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.Serializable;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Base64;

public class AESUtil {
    private final int n;
    private final String algorithm;

    public AESUtil(int n, String algorithm) {
        this.n = n;
        this.algorithm = algorithm;
    }

    public SecretKey generateKey() throws Exception {
        //n (128, 192, and 256) bits
        javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance("AES");
        keyGenerator.init(n);
        return keyGenerator.generateKey();
    }

    // Generating Key from given password
    public SecretKey getKeyFromPassword(String password, String salt)
            throws Exception {

        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), 65536, n);
        return new SecretKeySpec(factory.generateSecret(spec)
                .getEncoded(), "AES");
    }

    public IvParameterSpec generateIv() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }

    public String encrypt(String input, SecretKey key,
                          IvParameterSpec iv) throws Exception {

        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
        byte[] cipherText = cipher.doFinal(input.getBytes());
        return Base64.getEncoder()
                .encodeToString(cipherText);
    }

    public String decrypt(String cipherText, SecretKey key,
                          IvParameterSpec iv) throws Exception {

        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE, key, iv);
        byte[] plainText = cipher.doFinal(Base64.getDecoder()
                .decode(cipherText));
        return new String(plainText);
    }

    public static SealedObject encryptObject(String algorithm, Serializable object,
                                             SecretKey key, IvParameterSpec iv) throws Exception {

        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
        return new SealedObject(object, cipher);
    }

    public static Serializable decryptObject(String algorithm, SealedObject sealedObject,
                                             SecretKey key, IvParameterSpec iv) throws Exception {

        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE, key, iv);
        return (Serializable) sealedObject.getObject(cipher);
    }
}
