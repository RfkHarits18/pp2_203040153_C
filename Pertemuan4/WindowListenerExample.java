/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Rifqi Harits Pratama
 */
public class WindowListenerExample {
  
    public static void main(String[] args){
    
        //Mebuat frame
        JFrame frame = new JFrame("WindowListener Example");
    
        //Membuat label untuk menampilkan pesan 
        JLabel label = new JLabel("Lakukan operasi pada jendela.");
        label.setBounds(50, 50, 300, 30);
    
        //Menambahkan WindowListenerke frame
        frame.addWindowListener(new WindowListener(){
            //Dijalankan ketika jendela dibuka
            public void WindowOpened(WindowEvent e) {
                label.setText("Window Opened.");
        }
        
            //Dijadikan ketika jendela sedang dalam proses penutupan
            public void WindowClosing(WindowEvent e) {
                label.setText("Window Closing.");
            //Bisa menambahkan Sytem.exit(0); jika ingin mengghentikan program
        }
        
            //Dijalankan ketika jendela benar - benar ditutup
            public void WindowClosed(WindowEvent e) {
                System.out.println("Window Closed.");
        }
        
            //Dijalankan ketika jendela diminimalkan
            public void WindowIconified(WindowEvent e) {
                label.setText("Window Minimized.");
        }
        
            //Dijalankan ketika jendela dipulihkan dari minimalkan
            public void windowDeiconified(WindowEvent e) {
                label.setText("Window Restored.");
        }
        
            //Dijalankan ketika jendela menjadi aktif (berfokus)
            public void windowActivated(WindowEvent e) {
                label.setText("Window Activated.");
        }
        
            //Dijalankan ketika jendela menjadi aktif (berfokus)
        public void windowDeactivated(WindowEvent e) {
            label.setText("Window Deactivated.");
        }

            @Override
            public void windowOpened(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowClosing(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowClosed(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowIconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
    });
    
    //Menambahhkan label ke frame    
    frame.add(label);

    //Setting frame
    frame.setSize(400, 200);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}            

