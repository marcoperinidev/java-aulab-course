import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;

public class Decryptor {

    public static void main(String[] args) throws Exception {

        // Carica la chiave segreta da un file
        FileInputStream keyfis = new FileInputStream("secret.key");
        byte[] encodedKey = new byte[keyfis.available()];
        keyfis.read(encodedKey);
        keyfis.close();
        SecretKey originalKey = new SecretKeySpec(encodedKey, "AES");

        // Inizializza il cifrario con la chiave segreta
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, originalKey);

        // Carica il file criptato da decifrare
        FileInputStream fis = new FileInputStream("file_criptato.enc");
        byte[] encryptedFile = new byte[fis.available()];
        fis.read(encryptedFile);
        fis.close();

        // Decifra il file utilizzando il cifrario e la chiave di decifratura
        byte[] decryptedFile = cipher.doFinal(encryptedFile);

        // Salva il file decifrato su disco
        FileOutputStream fos = new FileOutputStream("file_decifrato.txt");
        fos.write(decryptedFile);
        fos.close();

        System.out.println("File decifrato con successo!");

    }
}
