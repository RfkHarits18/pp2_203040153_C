/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Rifqi Harits Pratama
 */
public class KeyListenerExample { 
     public static void main (String[] args) { 
         //Membuat frame 
         JFrame frame = new JFrame("KeyListener Example");
         
         //Membuat label untuk menámpilkan pesan 
         JLabel label = new JLabel("Tekan tombol pada keyboard.");
         label. setBounds (50, 50, 300, 30); 
         
         // Membuat text field untuk fokus keyboard 
         JTextField textField = new JTextField();
         textField. setBounds(50, 100, 200, 30); 

         // Menambahkan KeyListener ke text field 
         textField.addKeyListener(new KeyListener() {
             // Dijalankan ketika tombol ditekan 
             public void keyPressed(KeyEvent e) {
                 label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
             }
             //Dijadikan ketika tombol dilepaskan
             public void KeyReleased(KeyEvent e) {
                 label.setText("Key released: " + KeyEvent.getKeyText(e.getKeyCode()));
             }
             //Dijadikan ketika tombol ditekan dan dilepaskan (sama dengan mengetik krakter)
             public void KeyTyped(KeyEvent e) {
                 label.setText("Key Typed: " +e.getKeyChar());
             }

             @Override
             public void keyTyped(KeyEvent e) {
                 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
             }

             @Override
             public void keyReleased(KeyEvent e) {
                 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
             }
         });
         
         //Menambakan komponen ke frame
         frame.add(label);
         frame.add(textField);
         
         //Setting frame
         frame.setSize(400, 200);
         frame.setLayout(null);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}