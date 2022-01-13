/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
/**
 *
 * @author Carlos Rangel
 */
public class Determinante extends JFrame {
public JPanel panel0;
    public Determinante(){
    super("DETERMINANTE");
        this.setSize(600, 400);
        this.setLocation(380, 150);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         panel();
         label();
         text();
         boton();
    }      
private void panel(){
        
        panel0 = new JPanel();
        panel0.setSize(550, 335);
        panel0.setLocation(17, 15);
        panel0.setLayout(null);
        this.getContentPane().add(panel0);
        
}
private void label(){
    JLabel L1 = new JLabel("Ingrese la proporcion de la Matriz");
    L1.setLocation(180, 10);
    L1.setSize(220, 30);
    panel0.add(L1);
            
    
    
}
private void text(){
    JTextField text1 = new JTextField();
    text1.setLocation(220, 70);
    text1.setSize(120, 55);
    panel0.add(text1);
    
    
    
    
}
private void boton(){
    JButton b1 = new JButton("Construir Matriz");
    b1.setLocation(220, 150);
    b1.setSize(150, 60);
    panel0.add(b1);
    
    
ActionListener a1 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             MDeterminante ven1Nueva = new MDeterminante();
            ven1Nueva.setVisible(true);
        }
           
       };
       b1.addActionListener(a1);
    
}
}