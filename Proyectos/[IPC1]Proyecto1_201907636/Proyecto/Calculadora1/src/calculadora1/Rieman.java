/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JButton;
/**
 *
 * @author Carlos Rangel
 */
public class Rieman extends JFrame {
public JPanel panel0;
    public  Rieman(){
        super("SUMA DE RIEMANN");
        this.setLocation(100, 20);
        this.setSize(1000, 700);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  

    panel0 = new JPanel();
    panel0.setBackground(Color.YELLOW);
    panel0.setLocation(30, 30);
    panel0.setSize(925, 625);
    panel0.setLayout(null);
    this.getContentPane().add(panel0);
   
        JLabel L1 = new JLabel("Suma de Riemann");
        L1.setFont(new Font("Lucida Sans", Font.BOLD,40));
        L1.setSize(500, 40);
        L1.setLocation(300, 30);
        panel0.add(L1);
        
        
        
        
        JLabel L5 = new JLabel("Diferencial:");
        L5.setSize(150, 20);
        L5.setLocation(730, 380);
        panel0.add(L5);
        
        
        JLabel L6 = new JLabel("Resultado:");
        L6.setSize(150, 20);
        L6.setLocation(730, 430);
        panel0.add(L6);
        
        JLabel L7 = new JLabel(new ImageIcon("integral.jpeg"));
        L7.setLocation(70, 70);
        L7.setSize(500, 500);
        panel0.add(L7);
                
        
    
        JTextField text1 = new  JTextField("");
        text1.setLocation(420, 150);
        text1.setSize(90, 30);
        panel0.add(text1);
        
        JTextField text2 = new  JTextField("");
        text2.setLocation(250, 500);
        text2.setSize(90, 30);
        panel0.add(text2);
        
         
        JTextField text3 = new  JTextField("");
        text3.setLocation(800, 370);
        text3.setSize(90, 30);
        panel0.add(text3);
        
       
        
        
        JTextField text5 = new  JTextField("");
        text5.setLocation(800, 420);
        text5.setSize(90, 30);
        panel0.add(text5);
        
        JButton b1 = new JButton("Calcular");
        b1.setLocation(770, 470);
        b1.setBackground(new Color(255,102,0));
        b1.setForeground(Color.WHITE);
        b1.setSize(150, 30);
        panel0.add(b1);
        
        
 
        JButton b2 = new JButton("Guardar Resultado");
        b2.setLocation(770, 510);
         b2.setBackground(new Color(255,102,0));
         b2.setForeground(Color.WHITE);
        b2.setSize(150, 30);
        panel0.add(b2);
        
        
         String [] opciones = {"Cuadratica", "Cubica","Exponencial"};
    JComboBox box1 = new JComboBox(opciones);
    box1.setLocation(430, 300);
    box1.setSize(120, 35);
    panel0.add(box1);
        
   
        
          ActionListener a2 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
         
        }
           
       };
       b1.addActionListener(a2);
        
        
    }
}
