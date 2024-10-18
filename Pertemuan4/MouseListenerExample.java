/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Rifqi Harits Pratama
 */
public class MouseListenerExample {
    public static void main(String[] args) {
        //membuat frame
        JFrame frame = new JFrame("MouseListener Example");
        
        //Membuat frame
        JLabel label = new JLabel("Arahkan dan klik mouse pada area ini.");
        label.setBounds(50, 50, 300, 30);
        
        //Menambahkan MouseListener ke label
        label.addMouseListener(new MouseListener(){
            //Dijalankan ketika mouse diklik (klik kiri, kanan atau tengah)
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at: ("+e.getX()+","+e.getY()+")");
            }
            
            //Dijalankan ketika mouse ditekan (tanpa dilepasan)
            public void mousePressed(MouseEvent e) {
                label.setText("Mouse pressed at: ("+e.getX()+","+e.getY()+")");
            }
            
            //Diijalankan ketika mouse dilepaskan setelah ditekan
            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse released at: ("+e.getX()+","+e.getY()+")");
            }
            //Dijalankan ketika mouse masuk ke area komponen
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse entered the area.");
            }
            
            //Dijalankan ketika mouse keluar dari area komponen
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited the area.");
            }
        });
        
        //Menambahkan label ke frame
        frame.add(label);
        
        //Setting frame
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
