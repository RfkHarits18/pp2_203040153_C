/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Rifqi Harits Pratama
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BiodataTemanApp extends JFrame {

    public BiodataTemanApp() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Membuat Panel utama
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Margin untuk tiap komponen
        
        JLabel labelNama = new JLabel("Nama:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(labelNama, gbc);
        
        JTextField textNama = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(textNama, gbc);
        
        JLabel labelHP = new JLabel("Nomor HP:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(labelHP, gbc);
        
        JTextField textHP = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(textHP, gbc);
        
        JLabel labelGender = new JLabel("Jenis Kelamin:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(labelGender, gbc);
        
        JRadioButton radioLaki = new JRadioButton("Laki-Laki");
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(radioLaki, gbc);
        
        JRadioButton radioPerempuan = new JRadioButton("Perempuan");
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(radioPerempuan, gbc);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radioLaki);
        genderGroup.add(radioPerempuan);
        
        JCheckBox checkWNA = new JCheckBox("Warga Negara Asing");
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(checkWNA, gbc);
        
        JButton buttonSimpan = new JButton("Simpan");
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(buttonSimpan, gbc);
        
        JTextArea outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        panel.add(scrollPane, gbc);
        
        // Action Listener untuk button simpan
        buttonSimpan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String hp = textHP.getText();
                String gender = radioLaki.isSelected() ? "Laki-Laki" : "Perempuan";
                String wna = checkWNA.isSelected() ? "Ya" : "Bukan";
                
                outputArea.append("Nama: " + nama + "\n");
                outputArea.append("Nomor HP: " + hp + "\n");
                outputArea.append("Jenis Kelamin: " + gender + "\n");
                outputArea.append("WNA: " + wna + "\n");
                outputArea.append("===================================\n\n");
            }
        });
        
        this.add(panel);
        this.setSize(400, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BiodataTemanApp();
    }
}