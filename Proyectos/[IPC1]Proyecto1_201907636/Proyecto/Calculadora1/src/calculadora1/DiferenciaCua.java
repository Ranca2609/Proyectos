/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JTextField;
/**
 *
 * @author Carlos Rangel
 */
public class DiferenciaCua extends JFrame{
    public JPanel panel0;
public DiferenciaCua(){
    super("DIREFENCIA DE CUADRADOS");
        this.setSize(500, 500);
        this.setLocation(380, 100);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 
        panel0 = new JPanel();
        panel0 = new JPanel();
        panel0.setSize(450, 435);
        panel0.setLocation(17, 15);
        panel0.setBackground(new Color(102,0,0));
        panel0.setLayout(null);
        this.getContentPane().add(panel0);
        
  
        JLabel L1 = new JLabel("Diferencia de Cuadrados");
        L1.setSize(400, 35);
        L1.setForeground(Color.WHITE);
        L1.setFont(new Font("Lucida Sans", Font.BOLD,25));
        L1.setLocation(80, 20);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("(");
        L2.setSize(150, 35);
        L2.setForeground(Color.WHITE);
        L2.setLocation(80, 80);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("A^2 "+") "+"- "+" (");
        L3.setSize(150, 35);
        L3.setForeground(Color.WHITE);
        L3.setLocation(130, 80);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("B^2 "+")");
        L4.setSize(150, 35);
        L4.setLocation(220, 80);
        L4.setForeground(Color.WHITE);
        panel0.add(L4);
        
        
        JLabel L5 = new JLabel("Resultado:");
        L5.setSize(150, 35);
        L5.setForeground(Color.WHITE);
        L5.setLocation(100, 130);
        panel0.add(L5);
        
        JLabel L6 = new JLabel("(");
        L6.setForeground(Color.WHITE);
        L6.setSize(150, 35);
        L6.setLocation(80, 170);
        panel0.add(L6);
        
        JLabel L7 = new JLabel("A "+"+");
        L7.setSize(150, 35);
        L7.setForeground(Color.WHITE);
        L7.setLocation(130, 170);
        panel0.add(L7);
        
        JLabel L8 = new JLabel("B "+") "+"(");
        L8.setSize(150, 35);
        L8.setForeground(Color.WHITE);
        L8.setLocation(200, 170);
        panel0.add(L8);
        
        JLabel L9 = new JLabel("A "+"-");
        L9.setSize(150, 35);
        L9.setForeground(Color.WHITE);
        L9.setLocation(265, 170);
        panel0.add(L9);
        
        JLabel L10 = new JLabel("B "+")");
        L10.setSize(150, 35);
        L10.setForeground(Color.WHITE);
        L10.setLocation(325, 170);
        panel0.add(L10);
        
  
        JTextField text1 = new JTextField();
        text1.setLocation(90, 80);
        text1.setSize(35, 35);
        panel0.add(text1);
        
        
        JTextField text2 = new JTextField();
        text2.setLocation(180, 80);
        text2.setSize(35, 35);
        panel0.add(text2);
        
        JTextField text3 = new JTextField();
        text3.setLocation(90, 170);
        text3.setSize(35, 35);
        panel0.add(text3);
        
        
        JTextField text4 = new JTextField();
        text4.setLocation(160, 170);
        text4.setSize(35, 35);
        panel0.add(text4);
        
        JTextField text5 = new JTextField();
        text5.setLocation(225, 170);
        text5.setSize(35, 35);
        panel0.add(text5);
        
        JTextField text6 = new JTextField();
        text6.setLocation(285, 170);
        text6.setSize(35, 35);
        panel0.add(text6);
    
        JButton b1 = new JButton("Guardar Resultado");
        b1.setLocation(50, 300);
        b1.setBackground(new Color(102,102,0));
        b1.setForeground(Color.WHITE);
        b1.setSize(150, 35);
        panel0.add(b1);
        
        JButton b2 = new JButton("Calcular");
        b2.setLocation(250, 300);
        b2.setBackground(new Color(102,102,0));
        b2.setForeground(Color.WHITE);
        b2.setSize(150, 35);
        panel0.add(b2);
    
        ActionListener a1 = new ActionListener(){
        public void actionPerformed(){
            
        }
            @Override
        public void actionPerformed(ActionEvent e) {
         Double a,b,a1,b1;
          a= Double.parseDouble(text1.getText());
          b= Double.parseDouble(text2.getText());
          
          a1= CALCULOSMATH.raiz(a);
          b1 = CALCULOSMATH.raiz(b);
          
            text3.setText(String.valueOf(a1));
                text4.setText(String.valueOf(b1));
          text5.setText(String.valueOf(a1));
                text6.setText(String.valueOf(b1));
        
        }
        
            
        };b2.addActionListener(a1);
        
}
}
