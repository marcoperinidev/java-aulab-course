import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.JOptionPane;



public class EncryptionGUI extends JFrame {

    private File inputFile;
    private int outputFile;

    public EncryptionGUI() {
        super("Encryption App");

        // Create the file selection buttons
        JButton inputButton = new JButton("Select input file");
        JButton outputButton = new JButton("Select output file");

        // Create the encryption button
        JButton encryptButton = new JButton("Encrypt");

        // Set up the input/output file labels
        JLabel inputLabel = new JLabel("Input file:");
        JLabel outputLabel = new JLabel("Output file:");

        // Create the text fields for the file paths
        JTextField inputField = new JTextField(20);
        JTextField outputField = new JTextField(20);

        // Set the text fields to be read-only
        inputField.setEditable(false);
        outputField.setEditable(false);

        // Set up the file selection handlers
        inputFile = new JFileChooser().showOpenDialog(null);
        inputButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
                fileChooser.setFileFilter(filter);
                int returnVal = fileChooser.showOpenDialog(EncryptionGUI.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    inputFile = fileChooser.getSelectedFile();
                    inputField.setText(inputFile.getAbsolutePath());
                }
            }
        });

        outputFile = new JFileChooser().showSaveDialog(null);
        outputButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
                fileChooser.setFileFilter(filter);
                int returnVal = fileChooser.showSaveDialog(EncryptionGUI.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    outputFile = fileChooser.getSelectedFile();
                    outputField.setText(outputFile.getAbsolutePath());
                }
            }
        });

        // Set up the encryption button handler
        encryptButton.addActionListener(this::actionPerformed);

        // Create the layout for the GUI
        JPanel panel1 = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        // Add the components to the layout
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel1.add(inputLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        panel1.add(inputField, constraints);

        constraints.gridx = 2;
        constraints.gridy = 0;
        panel1.add(inputButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel1.add(outputLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        panel1.add(outputField, constraints);

        constraints.gridx = 2;
        constraints.gridy = 1;
        panel1.add(outputButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel1.add(encryptButton, constraints);

        // Show the GUI
        JFrame frame = new JFrame("File Transfer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel fileLabel = new JLabel("File:");
        JTextField fileTextField = new JTextField(20);
        fileTextField.setEditable(false);
        JButton fileButton = new JButton("Choose File");
        fileButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                fileTextField.setText(selectedFile.getAbsolutePath());
            }
        });
        panel.add(fileLabel);
        panel.add(fileTextField);
        panel.add(fileButton);

        JLabel destLabel = new JLabel("Destination:");
        JTextField destTextField = new JTextField(20);
        destTextField.setEditable(false);
        JButton destButton = new JButton("Choose Destination");
        destButton.addActionListener(e -> {
            JFileChooser dirChooser = new JFileChooser();
            dirChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int result = dirChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedDir = dirChooser.getSelectedFile();
                destTextField.setText(selectedDir.getAbsolutePath());
            }
        });
        panel.add(destLabel);
        panel.add(destTextField);
        panel.add(destButton);
        


        JButton transferButton = new JButton("Transfer");
        transferButton.addActionListener(e -> {
            String sourcePath = fileTextField.getText();
            String destPath = destTextField.getText();
            transferFile(sourcePath, destPath);
            showSuccess("File transferred successfully!");

            class FileTransfer {
                private void transferFile() throws IOException {
                    File sourceFile = new File("source_path");
                    File destFile = new File("dest_path", sourceFile.getName());
                    if (destFile.exists()) {
                        int result = JOptionPane.showConfirmDialog(null, "Destination file already exists. Overwrite?",
                                "Confirm Overwrite", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (result != JOptionPane.YES_OPTION) {
                            return;
                        }
                    }
                    try {
                        Files.copy(sourceFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }

                public static void FileTransfere(String[] args) {
                    FileTransfer transfer = new FileTransfer();
                    try {
                        transfer.transferFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        });
        panel.add(new JLabel());
        panel.add(transferButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        JButton browseButton = new JButton("Browse");
        browseButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(null);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                fileTextField.setText(file.getPath());

            }
        });


        panel.add(browseButton);


        panel.add(destButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void transferFile(String sourcePath, String destPath) {
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void showSuccess(String message) {
        JOptionPane.showMessageDialog(null, message, "Success", JOptionPane.INFORMATION_MESSAGE);
    }


    private void actionPerformed(ActionEvent e) {
        if (inputFile == null || outputFile == null) {
            showError("Please select input and output files");
            return;
        }

        Object EncryptionUtils = null;
        EncryptionUtils.notify();
        showSuccess("Encryption successful!");
    }
}