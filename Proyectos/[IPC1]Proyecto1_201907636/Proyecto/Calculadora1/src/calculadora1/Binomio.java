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
public class Binomio extends JFrame {
       public JPanel panel0;
public Binomio () {
      super("BINOMIO CUADRADO");
        this.setSize(500, 500);
        this.setLocation(380, 100);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        

    panel0 = new JPanel();
    panel0.setSize(450, 435);
    panel0.setLocation(17, 15);
    panel0.setBackground(new Color(102,0,0));
    panel0.setLayout(null);
    this.getContentPane().add(panel0);
    

    JLabel L1 = new JLabel("Binomio al cuadrado");
    L1.setFont(new Font("Lucida Sans", Font.BOLD,25));
    L1.setLocation(100, 10);
    L1.setForeground(Color.WHITE);
    L1.setSize(300, 35);
    panel0.add(L1);
    
    JLabel L2 = new JLabel("(");
    L2.setForeground(Color.WHITE);
    L2.setLocation(90, 70);
    L2.setSize(200, 35);
    panel0.add(L2);
    
    JLabel L3 = new JLabel("A^2 ");
    L3.setForeground(Color.WHITE);
    L3.setLocation(140, 70);
    L3.setSize(200, 35);
    panel0.add(L3);
    
    JLabel L4 = new JLabel("AB "+"+");
    L4.setForeground(Color.WHITE);
    L4.setLocation(250, 70);
    L4.setSize(200, 35);
    panel0.add(L4);
    
    JLabel L5 = new JLabel("B^2 "+")");
    L5.setForeground(Color.WHITE);
    L5.setLocation(330, 70);
    L5.setSize(200, 35);
    panel0.add(L5);
    
    JLabel L6 = new JLabel("Resultado:");
    L6.setForeground(Color.WHITE);
    L6.setLocation(90, 120);
    L6.setSize(200, 35);
    panel0.add(L6);
    
    JLabel L7 = new JLabel("(");
    L7.setForeground(Color.WHITE);
    L7.setLocation(90, 160);
    L7.setSize(200, 35);
    panel0.add(L7);
    
    JLabel L8 = new JLabel("A");
    L8.setForeground(Color.WHITE);
    L8.setLocation(140, 160);
    L8.setSize(200, 35);
    panel0.add(L8);
    
    JLabel L9 = new JLabel("B"+")^2");
    L9.setForeground(Color.WHITE);
    L9.setLocation(290, 160);
    L9.setSize(200, 35);
    panel0.add(L9);
    
    JLabel L10 = new JLabel("Signo");
    L10.setForeground(Color.WHITE);
    L10.setLocation(170, 100);
    L10.setSize(200, 35);
    panel0.add(L10);
    

    JTextField text1 = new JTextField();
    text1.setLocation(100, 70);
    text1.setSize(35, 35);
    panel0.add(text1);
    
    JTextField text2 = new JTextField();
    text2.setLocation(210, 70);
    text2.setSize(35, 35);
    panel0.add(text2);
    
    JTextField text3 = new JTextField();
    text3.setLocation(280, 70);
    text3.setSize(35, 35);
    panel0.add(text3);
    
    JTextField text4 = new JTextField();
    text4.setLocation(100, 160);
    text4.setSize(35, 35);
    panel0.add(text4);
    
    JTextField text5 = new JTextField();
    text5.setLocation(180, 160);
    text5.setSize(35, 35);
    panel0.add(text5);
    
    JTextField text6 = new JTextField();
    text6.setLocation(250, 160);
    text6.setSize(35, 35);
    panel0.add(text6);
    
     JTextField text7 = new JTextField();
    text7.setLocation(170, 70);
    text7.setSize(35, 35);
    panel0.add(text7);

      JButton b1 = new JButton("Guardar Resultado");
      b1.setSize(150, 35);
      b1.setForeground(Color.WHITE);
      b1.setBackground(new Color(102,102,0));
      b1.setLocation(30, 280);
      panel0.add(b1);
      
      JButton b2 = new JButton("Calcular");
      b2.setSize(120, 30);
      b2.setForeground(Color.WHITE);
      b2.setBackground(new Color(102,102,0));
      b2.setLocation(230, 280);
      panel0.add(b2);
      
         ActionListener a1 = new ActionListener(){
        public void actionPerformed(){
            
        }
            @Override
        public void actionPerformed(ActionEvent e) {
         Double a,b,c,a1,b1,c1;
          a= Double.parseDouble(text1.getText());
          b= Double.parseDouble(text3.getText());
          
          a1= CALCULOSMATH.raiz(a);
          b1 = CALCULOSMATH.raiz(b);
          
          
            text4.setText(String.valueOf(a1));
                text6.setText(String.valueOf(b1));
                text5.setText(text7.getText());
           
        
        }
        
            
        };b2.addActionListener(a1);
      
      
      
      
  }  
}
