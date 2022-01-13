/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JTextField;
/**
 *
 * @author Carlos Rangel
 */
public final class Tangente extends JFrame {
    public JPanel panel0;
    public Tangente(){
    
    super("TANGENTE");
        this.setSize(600, 400);
        this.setLocation(380, 150);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel();
        label();
        text();
        box();
        boton();
    }
    private void panel(){
         panel0 = new JPanel();
        panel0 = new JPanel();
        panel0.setSize(550, 335);
        panel0.setBackground(new Color(0,102,0));
        panel0.setLocation(17, 15);
        panel0.setLayout(null);
        this.getContentPane().add(panel0);
        
    }
    private void label() {
        JLabel L1 = new JLabel("Tangente");
         L1.setFont(new Font("arial black", Font.BOLD,25));
        L1.setForeground(Color.WHITE);
        L1.setLocation(40, 10);
        L1.setSize(250, 30);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("Tan "+"(");
           L2.setForeground(Color.WHITE);
        L2.setFont(new Font("arial black", Font.BOLD,15));
        L2.setLocation(25, 60);
        L2.setSize(50, 30);
        panel0.add(L2);
        
        JLabel L3 = new JLabel(")");
         L3.setForeground(Color.WHITE);
        L3.setFont(new Font("arial black", Font.BOLD,15));
        L3.setLocation(115, 60);
        L3.setSize(50, 30);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("Resultado:");
         L4.setForeground(Color.WHITE);
        L4.setFont(new Font("arial black", Font.BOLD,15));
        L4.setLocation(50, 150);
        L4.setSize(100, 30);
        panel0.add(L4);
    }
    private void text(){
        JTextField text5 = new JTextField();
        text5.setLocation(80, 60);
        text5.setSize(30, 30);
        panel0.add(text5);
        
        JTextField text6 = new JTextField();
        text6.setLocation(115, 180);
        text6.setSize(150, 35);
        panel0.add(text6);
    }
    private void box(){
         String [] signos = {"Grados", "Radianes"};
        JComboBox box1 = new JComboBox(signos);
        box1.setBackground(new Color(255,102,0));
        box1.setForeground(Color.WHITE);
        box1.setSize(100, 25);
        box1.setLocation(230, 60);
        panel0.add(box1);
    }
    public void boton(){
        JButton b1 = new JButton("Calcular");
         b1.setBackground(new Color(255,102,0));
        b1.setForeground(Color.WHITE);
        b1.setSize(90, 35);
        b1.setLocation(300, 180);
        panel0.add(b1);
        
        JButton b2 = new JButton("Guardar Resultado");
          b2.setBackground(new Color(255,102,0));
        b2.setForeground(Color.WHITE);
        b2.setSize(150, 35);
        b2.setLocation(200, 260);
        panel0.add(b2);
            
        
        
    }
    
}
