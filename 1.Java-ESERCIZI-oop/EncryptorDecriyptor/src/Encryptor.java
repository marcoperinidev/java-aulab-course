import javax.crypto.*;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Encryptor {

    private static final String ALGORITHM = "AES";
    private static final int KEY_SIZE = 256;
    private static final int BUFFER_SIZE = 4096;

    public static void encrypt(File inputFile, File outputFile) throws CryptoException {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
            keyGen.init(KEY_SIZE);
            SecretKey key = keyGen.generateKey();

            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);

            FileInputStream inputStream = new FileInputStream(inputFile);
            FileOutputStream outputStream = new FileOutputStream(outputFile);
            CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher);

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                cipherOutputStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            cipherOutputStream.flush();
            cipherOutputStream.close();

            // Write the key to a separate file for safe-keeping
            ObjectOutputStream keyOutputStream = new ObjectOutputStream(new FileOutputStream(outputFile.getAbsolutePath() + ".key"));
            keyOutputStream.writeObject(key);
            keyOutputStream.close();
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IOException ex) {
            throw new CryptoException("Error encrypting file", ex);
        }
    }

    public static void decrypt(File inputFile, File outputFile, File keyFile) throws CryptoException {
        try {
            ObjectInputStream keyInputStream = new ObjectInputStream(new FileInputStream(keyFile));
            SecretKey key = (SecretKey) keyInputStream.readObject();
            keyInputStream.close();

            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);

            FileInputStream inputStream = new FileInputStream(inputFile);
            CipherInputStream cipherInputStream = new CipherInputStream(inputStream, cipher);
            FileOutputStream outputStream = new FileOutputStream(outputFile);

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = cipherInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            cipherInputStream.close();
            inputStream.close();
            outputStream.flush();
            outputStream.close();
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IOException | ClassNotFoundException ex) {
            throw new CryptoException("Error decrypting file", ex);
        }
    }
}

class CryptoException extends Exception {
    public CryptoException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
