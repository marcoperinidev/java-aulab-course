import javax.crypto.*;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;


public class FileEncryptorDecryptor extends JFrame implements ActionListener {

    @Serial
    private static final long serialVersionUID = 1L;
    private static final int ITERATIONS = 65536;
    private static final int KEY_LENGTH = 256;
    private static final String ENCRYPT = "Encrypt";
    private static final String DECRYPT = "Decrypt";
    private static final String SALT = "randomsalt";

    private final JFileChooser fileChooser;
    private final JButton encryptButton;
    private final JButton decryptButton;
    private final JTextArea logArea;

    private SecretKey secretKey;
    private Cipher cipher;
    private File encryptedFile = null; // Declare encryptedFile as a class variable and initialize it to null

    public FileEncryptorDecryptor() {
        super("File Encryptor/Decryptor");

        setLayout(new BorderLayout());

        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("All Files", "*.*"));

        encryptButton = new JButton(ENCRYPT);
        encryptButton.addActionListener(this);

        decryptButton = new JButton(DECRYPT);
        decryptButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(encryptButton);
        buttonPanel.add(decryptButton);

        logArea = new JTextArea();
        logArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(logArea);

        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == encryptButton) {
            int returnValue = fileChooser.showOpenDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String password = JOptionPane.showInputDialog(null, "Enter password:");
                try {
                    byte[] salt = SALT.getBytes();
                    secretKey = generateKey(password, salt);
                    cipher = Cipher.getInstance("AES");
                    cipher.init(Cipher.ENCRYPT_MODE, secretKey);
                    encryptedFile = new File(selectedFile.getPath() + ".encrypted"); // Update encryptedFile with the new encrypted file
                    encryptFile(selectedFile, encryptedFile);
                    JOptionPane.showMessageDialog(null, "Encryption complete");
                } catch (IOException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException
                         | IllegalBlockSizeException | BadPaddingException | InvalidKeySpecException ex) {
                    ex.printStackTrace();
                }
            } else if (returnValue == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "No file selected");
            }
        } else if (e.getSource() == decryptButton) {
            int returnValue = fileChooser.showOpenDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String password = JOptionPane.showInputDialog(null, "Enter password:");
                try {
                    byte[] salt = SALT.getBytes();
                    secretKey = generateKey(password, salt);
                    cipher = Cipher.getInstance("AES");
                    cipher.init(Cipher.DECRYPT_MODE, secretKey);
                    File decryptedFile = new File(selectedFile.getPath().replaceAll(".encrypted", ""));
                    decryptFile(selectedFile, decryptedFile);
                    logArea.append("Decryption complete: " + decryptedFile.getAbsolutePath() + "\n");
                } catch (IOException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException
                         | IllegalBlockSizeException | BadPaddingException | InvalidKeySpecException ex) {
                    ex.printStackTrace();
                }
            } else if (returnValue == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "No file selected");
            }
        }
    }


    private static SecretKey generateKey(String password, byte[] salt)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 256);
        SecretKey secretKey = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");
        return secretKey;
    }

    private void encryptFile(File inputFile, File outputFile)
            throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException {
        FileInputStream inputStream = new FileInputStream(inputFile);
        byte[] inputBytes = new byte[(int) inputFile.length()];
        inputStream.read(inputBytes);
        byte[] outputBytes = cipher.doFinal(inputBytes);
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        outputStream.write(outputBytes);
        inputStream.close();
        outputStream.close();
    }

    private void decryptFile(File inputFile, File outputFile)
            throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException {
        FileInputStream inputStream = new FileInputStream(inputFile);
        byte[] inputBytes = new byte[(int) inputFile.length()];
        inputStream.read(inputBytes);
        byte[] outputBytes = cipher.doFinal(inputBytes);
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        outputStream.write(outputBytes);
        inputStream.close();
        outputStream.close();
    }
}
