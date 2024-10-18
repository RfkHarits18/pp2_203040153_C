/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas02;

/**
 *
 * @author Rifqi Harits Pratama
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PendaftaranNasabahBank extends JFrame {

    public PendaftaranNasabahBank() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label dan input untuk nama
        JLabel labelNama = new JLabel("Nama:");
        labelNama.setBounds(20, 20, 150, 30);
        JTextField textNama = new JTextField();
        textNama.setBounds(150, 20, 200, 30);

        // Label dan input untuk nomor HP
        JLabel labelHP = new JLabel("Nomor HP:");
        labelHP.setBounds(20, 60, 150, 30);
        JTextField textHP = new JTextField();
        textHP.setBounds(150, 60, 200, 30);

        // Label dan input untuk jenis tabungan
        JLabel labelTabungan = new JLabel("Jenis Tabungan:");
        labelTabungan.setBounds(20, 100, 150, 30);
        String[] tabunganOptions = {"Tabungan Umum", "Tabungan Pendidikan", "Tabungan Haji", "Tabungan Berjangka"};
        JList<String> listTabungan = new JList<>(tabunganOptions);
        listTabungan.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollTabungan = new JScrollPane(listTabungan);
        scrollTabungan.setBounds(150, 100, 200, 60);

        // Label dan input untuk frekuensi transaksi
        JLabel labelFrekuensi = new JLabel("Frekuensi Transaksi/Bulan:");
        labelFrekuensi.setBounds(20, 170, 200, 30);
        JSpinner spinnerFrekuensi = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        spinnerFrekuensi.setBounds(220, 170, 130, 30);

        // Label dan input untuk tanggal lahir
        JLabel labelTglLahir = new JLabel("Tanggal Lahir:");
        labelTglLahir.setBounds(20, 210, 150, 30);
        JSpinner spinnerTglLahir = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinnerTglLahir, "dd-MM-yyyy");
        spinnerTglLahir.setEditor(dateEditor);
        spinnerTglLahir.setBounds(150, 210, 200, 30);

        // Label dan input untuk password
        JLabel labelPassword = new JLabel("Password:");
        labelPassword.setBounds(20, 250, 150, 30);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 250, 200, 30);

        // Label dan input untuk confirm password
        JLabel labelConfirmPassword = new JLabel("Confirm Password:");
        labelConfirmPassword.setBounds(20, 290, 150, 30);
        JPasswordField confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(150, 290, 200, 30);

        // Area output untuk menampilkan data
        JTextArea outputArea = new JTextArea();
        outputArea.setBounds(20, 330, 350, 150);
        outputArea.setEditable(false);

        // Tombol Simpan
        JButton buttonSimpan = new JButton("Simpan");
        buttonSimpan.setBounds(150, 490, 100, 30);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem menuReset = new JMenuItem("Reset");
        JMenuItem menuExit = new JMenuItem("Exit");

        menuReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm(textNama, textHP, listTabungan, spinnerFrekuensi, spinnerTglLahir, passwordField, confirmPasswordField, outputArea);
            }
        });

        menuExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuFile.add(menuReset);
        menuFile.add(menuExit);
        menuBar.add(menuFile);
        this.setJMenuBar(menuBar);

        // Action listener untuk tombol simpan
        buttonSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String hp = textHP.getText();
                String tabungan = listTabungan.getSelectedValue();
                int frekuensi = (int) spinnerFrekuensi.getValue();
                Date tanggalLahir = (Date) spinnerTglLahir.getValue();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                if (password.equals(confirmPassword)) {
                    outputArea.append("Nama: " + nama + "\n");
                    outputArea.append("Nomor HP: " + hp + "\n");
                    outputArea.append("Jenis Tabungan: " + tabungan + "\n");
                    outputArea.append("Frekuensi Transaksi: " + frekuensi + " kali/bulan\n");
                    outputArea.append("Tanggal Lahir: " + tanggalLahir + "\n");
                    outputArea.append("Password cocok!\n");
                    outputArea.append("===================================\n");
                } else {
                    outputArea.append("Password dan Confirm Password tidak cocok!\n");
                }
            }
        });

        // Menambahkan komponen ke jendela
        this.add(labelNama);
        this.add(textNama);
        this.add(labelHP);
        this.add(textHP);
        this.add(labelTabungan);
        this.add(scrollTabungan);
        this.add(labelFrekuensi);
        this.add(spinnerFrekuensi);
        this.add(labelTglLahir);
        this.add(spinnerTglLahir);
        this.add(labelPassword);
        this.add(passwordField);
        this.add(labelConfirmPassword);
        this.add(confirmPasswordField);
        this.add(buttonSimpan);
        this.add(outputArea);

        // Mengatur ukuran dan layout jendela
        this.setSize(400, 570);
        this.setLayout(null);
        this.setVisible(true);
    }

    private void resetForm(JTextField textNama, JTextField textHP, JList<String> listTabungan,
                           JSpinner spinnerFrekuensi, JSpinner spinnerTglLahir, JPasswordField passwordField,
                           JPasswordField confirmPasswordField, JTextArea outputArea) {
        textNama.setText("");
        textHP.setText("");
        listTabungan.clearSelection();
        spinnerFrekuensi.setValue(1);
        spinnerTglLahir.setValue(new Date());
        passwordField.setText("");
        confirmPasswordField.setText("");
        outputArea.setText("");
    }

    public static void main(String[] args) {
        new PendaftaranNasabahBank();
    }
}

