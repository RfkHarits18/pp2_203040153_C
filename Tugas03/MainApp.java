/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas03;

/**
 *
 * @author Rifqi Harits Pratama
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp extends JFrame {
    
    private CardLayout cardLayout;
    private InputFormPanel inputFormPanel;
    private EmployeeTablePanel employeeTablePanel;

    public MainApp() {
        setTitle("Aplikasi Data Karyawan");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        JMenuItem formMenuItem = new JMenuItem("Form Input Karyawan");
        JMenuItem tableMenuItem = new JMenuItem("Tabel Data Karyawan");

        menu.add(formMenuItem);
        menu.add(tableMenuItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        
        // Panel Input Form dan Table
        cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);
        
        inputFormPanel = new InputFormPanel();
        employeeTablePanel = new EmployeeTablePanel();
        
        // Menambahkan ActionListener untuk tombol "Simpan" di InputFormPanel
        inputFormPanel.setSaveListener(employee -> {
            employeeTablePanel.addEmployeeToTable(employee);
            inputFormPanel.clearForm();
        });

        // Menambahkan Panel ke CardLayout
        mainPanel.add(inputFormPanel, "Form Input");
        mainPanel.add(employeeTablePanel, "Data Karyawan");
        
        // Menambahkan Panel utama ke Frame
        add(mainPanel, BorderLayout.CENTER);
        
        // Event untuk Menu Item
        formMenuItem.addActionListener(e -> cardLayout.show(mainPanel, "Form Input"));
        tableMenuItem.addActionListener(e -> cardLayout.show(mainPanel, "Data Karyawan"));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainApp app = new MainApp();
            app.setVisible(true);
        });
    }
}

