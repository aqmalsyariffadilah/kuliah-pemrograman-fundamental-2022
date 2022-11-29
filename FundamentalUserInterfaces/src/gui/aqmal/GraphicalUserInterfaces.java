package gui.aqmal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GraphicalUserInterfaces {
    private JTextField textKartu;
    private JComboBox comboJenisATM;
    private JComboBox comboBank;
    private JTextField textPemilik;
    private JButton saveButton;
    private JTextArea output;

    private JButton browseFileButton;
    private JPanel rootPanel;
    private JLabel Pict;

    public String pictName;

    public void insertingDataToFile(String inputtedData) throws IOException {
        try {
            FileWriter myFile = new FileWriter("UserFile.txt", true);
            myFile.write(inputtedData);
            myFile.close();
            System.out.println("Succesfully wrote to the file");
        } catch (IOException ex) {
            System.out.println("An error occured");
            ex.printStackTrace();
        }
    }

    public GraphicalUserInterfaces() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomorkartu = textKartu.getText();
                String jenisatm = (String) comboJenisATM.getSelectedItem();
                String bank = (String) comboBank.getSelectedItem();
                String namapemilik = textPemilik.getText();

                Variabel dataorang = new Variabel();
                dataorang.setNomorkartu(nomorkartu);
                dataorang.setJenisatm(jenisatm);
                dataorang.setBank(bank);
                dataorang.setNamapemilik(namapemilik);

                String hasil = "Tersimpan" + "\nNo Kartu = " + nomorkartu + "\nJenis ATM = " + jenisatm + "\nBank = " + bank +
                        "\nNama Pemilik = " + namapemilik + "\nNama File Gambar = " + pictName;

                output.append(hasil);

                try {
                    insertingDataToFile(hasil + "\n\n");
                    pictName = null;
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        browseFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser browseImage = new JFileChooser();

                int showOpenDialogue = browseImage.showOpenDialog(null);

                if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
                    pictName = browseImage.getSelectedFile().getName();

                    File selectedImage = browseImage.getSelectedFile();
                    String selectedImagePath = selectedImage.getAbsolutePath();

                    ImageIcon ii = new ImageIcon(selectedImagePath);
                    Image image = ii.getImage().getScaledInstance(Pict.getWidth(), Pict.getHeight(), Image.SCALE_SMOOTH);

                    Pict.setIcon(new ImageIcon(image));
                }
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
