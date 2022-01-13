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
public class SumaYDife extends JFrame {
    public JPanel panel0;
    public SumaYDife(){
        super("SUMA Y DIFERENCIA DE CUBOS");
        this.setSize(600, 400);
        this.setLocation(380, 150);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel();
        label();
        text();
        box0();
        boton();
    }
    private void panel(){
         panel0 = new JPanel();
        panel0 = new JPanel();
        panel0.setSize(550, 335);
        panel0.setLocation(17, 15);
        panel0.setBackground(new Color(102,0,0));
        panel0.setLayout(null);
        this.getContentPane().add(panel0);
    }
    private void label(){
        JLabel L1 = new JLabel("Suma y Diferencia de Cubos");
        L1.setLocation(50, 30);
        L1.setFont(new Font("Lucida Sans", Font.BOLD,25));
        L1.setForeground(Color.WHITE);
        L1.setSize(500, 25);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("(");
        L2.setForeground(Color.WHITE);
        L2.setLocation(110, 90);
        L2.setSize(160, 35);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("A^3 "+")");
        L3.setLocation(160, 90);
        L3.setForeground(Color.WHITE);
        L3.setSize(160, 35);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("(");
        L4.setLocation(280, 90);
        L4.setForeground(Color.WHITE);
        L4.setSize(160, 35);
        panel0.add(L4);
        
        JLabel L5 = new JLabel("B^3 "+")");
        L5.setLocation(330, 90);
        L5.setForeground(Color.WHITE);
        L5.setSize(160, 35);
        panel0.add(L5);
        
        JLabel L6 = new JLabel("Resultado:");
        L6.setLocation(200, 130);
        L6.setForeground(Color.WHITE);
        L6.setSize(160, 35);
        panel0.add(L6);
        
        JLabel L7 = new JLabel("(");
        L7.setLocation(50, 170);
        L7.setForeground(Color.WHITE);
        L7.setSize(160, 35);
        panel0.add(L7);
        
        JLabel L8 = new JLabel("A");
        L8.setLocation(100, 170);
        L8.setForeground(Color.WHITE);
        L8.setSize(160, 35);
        panel0.add(L8);
        
        JLabel L9 = new JLabel("B "+") "+" (");
        L9.setLocation(220, 170);
        L9.setForeground(Color.WHITE);
        L9.setSize(160, 35);
        panel0.add(L9);
        
        JLabel L10 = new JLabel("A^2 "+" -");
        L10.setLocation(290, 170);
        L10.setForeground(Color.WHITE);
        L10.setSize(160, 35);
        panel0.add(L10);
        
        JLabel L11 = new JLabel("AB "+" +" );
        L11.setLocation(370, 170);
        L11.setForeground(Color.WHITE);
        L11.setSize(160, 35);
        panel0.add(L11);
        
        JLabel L12 = new JLabel("B^2 "+" )" );
        L12.setLocation(450, 170);
        L12.setForeground(Color.WHITE);
        L12.setSize(160, 35);
        panel0.add(L12);
    }
    private void text(){
        JTextField text1 = new JTextField();
        text1.setLocation(120, 90);
        text1.setSize(40, 40);
        panel0.add(text1);
        
        JTextField text2 = new JTextField();
        text2.setLocation(290, 90);
        text2.setSize(40, 40);
        panel0.add(text2);
        
        JTextField text3 = new JTextField();
        text3.setLocation(60, 170);
        text3.setSize(40, 40);
        panel0.add(text3);
        
        JTextField text4 = new JTextField();
        text4.setLocation(120, 170);
        text4.setSize(40, 40);
        panel0.add(text4);
        
        JTextField text5 = new JTextField();
        text5.setLocation(180, 170);
        text5.setSize(40, 40);
        panel0.add(text5);
        
        JTextField text6 = new JTextField();
        text6.setLocation(250, 170);
        text6.setSize(40, 40);
        panel0.add(text6);
        
        JTextField text7 = new JTextField();
        text7.setLocation(330, 170);
        text7.setSize(40, 40);
        panel0.add(text7);
        
        JTextField text8 = new JTextField();
        text8.setLocation(405, 170);
        text8.setSize(40, 40);
        panel0.add(text8);
    }
    private void box0(){
        String [] signos = {"+", "-"};
        JComboBox box1 = new JComboBox(signos);
        box1.setSize(60, 25);
        box1.setBackground(new Color(102,102,0));
        box1.setForeground(Color.WHITE);
        box1.setLocation(200, 95);
        panel0.add(box1);
        
        
    }
    private void boton(){
        JButton b1 = new JButton("Guardar Resultado");
        b1.setLocation(100, 250);
        b1.setBackground(new Color(102,102,0));
        b1.setForeground(Color.WHITE);
        b1.setSize(150, 30);
        panel0.add(b1);
        
        JButton b2 = new JButton("Calcular");
        b2.setLocation(300, 250);
        b2.setBackground(new Color(102,102,0));
        b2.setForeground(Color.WHITE);
        b2.setSize(150, 30);
        panel0.add(b2);
    }
}
