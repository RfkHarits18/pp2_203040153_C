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
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class EmployeeTablePanel extends JPanel {

    private JTable dataTable;
    private DefaultTableModel tableModel;

    public EmployeeTablePanel() {
        setLayout(new BorderLayout());
        tableModel = new DefaultTableModel(new Object[]{"Nama", "Alamat", "Jenis Kelamin", "Status", "Divisi", "Usia", "Gaji"}, 0);
        dataTable = new JTable(tableModel);
        add(new JScrollPane(dataTable), BorderLayout.CENTER);
    }

    public void addEmployeeToTable(Employee employee) {
        tableModel.addRow(new Object[]{
            employee.getName(),
            employee.getAddress(),
            employee.getGender(),
            employee.getStatus(),
            employee.getDivision(),
            employee.getAge(),
            employee.getSalary()
        });
    }
}

