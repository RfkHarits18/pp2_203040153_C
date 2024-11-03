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

public class InputFormPanel extends JPanel {

    private JTextField nameField;
    private JTextArea addressArea;
    private JRadioButton maleRadio, femaleRadio;
    private JCheckBox isPermanentCheckBox;
    private JComboBox<String> divisionComboBox;
    private JSlider ageSlider;
    private JSpinner salarySpinner;
    private JButton saveButton;
    private SaveListener saveListener;

    public InputFormPanel() {
        setLayout(new GridLayout(8, 2, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Komponen Form
        nameField = new JTextField();
        addressArea = new JTextArea(3, 20);
        maleRadio = new JRadioButton("Laki-laki");
        femaleRadio = new JRadioButton("Perempuan");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        isPermanentCheckBox = new JCheckBox("Tetap");
        divisionComboBox = new JComboBox<>(new String[]{"IT", "HR", "Marketing", "Finance"});
        ageSlider = new JSlider(18, 60, 25);
        ageSlider.setMajorTickSpacing(10);
        ageSlider.setPaintTicks(true);
        ageSlider.setPaintLabels(true);
        salarySpinner = new JSpinner(new SpinnerNumberModel(5000000, 1000000, 50000000, 500000));
        saveButton = new JButton("Simpan");

        // Layout untuk Form
        add(new JLabel("Nama:")); add(nameField);
        add(new JLabel("Alamat:")); add(new JScrollPane(addressArea));
        add(new JLabel("Jenis Kelamin:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadio); genderPanel.add(femaleRadio);
        add(genderPanel);
        add(new JLabel("Status Pegawai:")); add(isPermanentCheckBox);
        add(new JLabel("Divisi:")); add(divisionComboBox);
        add(new JLabel("Usia:")); add(ageSlider);
        add(new JLabel("Gaji:")); add(salarySpinner);
        add(saveButton);
        add(new JLabel()); // filler untuk layout

        // Event pada Tombol Simpan
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveData();
            }
        });
    }

    private void saveData() {
        if (saveListener != null) {
            Employee employee = new Employee(
                nameField.getText(),
                addressArea.getText(),
                maleRadio.isSelected() ? "Laki-laki" : "Perempuan",
                isPermanentCheckBox.isSelected() ? "Tetap" : "Kontrak",
                (String) divisionComboBox.getSelectedItem(),
                ageSlider.getValue(),
                (int) salarySpinner.getValue()
            );
            saveListener.onSave(employee);
        }
    }

    public void setSaveListener(SaveListener listener) {
        this.saveListener = listener;
    }

    public void clearForm() {
        nameField.setText("");
        addressArea.setText("");
        maleRadio.setSelected(false);
        femaleRadio.setSelected(false);
        isPermanentCheckBox.setSelected(false);
        divisionComboBox.setSelectedIndex(0);
        ageSlider.setValue(25);
        salarySpinner.setValue(5000000);
    }

    // Interface untuk SaveListener
    public interface SaveListener {
        void onSave(Employee employee);
    }
}


