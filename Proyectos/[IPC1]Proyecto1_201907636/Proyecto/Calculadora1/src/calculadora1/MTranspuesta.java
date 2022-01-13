/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;
import javax.swing.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

import java.awt.GridLayout;

/**
 *
 * @author Carlos Rangel
 */
public class MTranspuesta extends JFrame {
public JPanel panel0;
public JPanel panel1;
    public MTranspuesta(){
    super("TRANSPUESTA");
 
          this.setSize(1330, 700);
        this.setLocation(15, 20);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        
      panel0 =new JPanel();
        panel0.setSize(1280, 625);
       panel0.setLocation(20, 10);
      panel0.setBackground(new Color(51,0,204));
       panel0.setLayout(null);
       this.getContentPane().add(panel0);
        
      panel1 = new JPanel();
    panel1.setSize(1200, 500);
     panel1.setLocation(30, 70);
      panel1.setBackground(Color.BLACK);
     panel1.setLayout(null);
     panel0.add(panel1);
     
         
        JButton b1 = new JButton("Hallar la Matriz");
        b1.setLocation(10, 580);
        b1.setSize(170, 40);
        panel0.add(b1);
        
        JButton b2 = new JButton("Construir Matriz");
        b2.setLocation(340, 20);
        b2.setSize(170, 30);
        panel0.add(b2);
        
        
       JTextField text1 = new JTextField();
       text1.setLocation(270, 25);
       text1.setSize(60, 25);
       panel0.add(text1);
       
       JLabel L1 = new JLabel("Escriba la proporcion");
         L1.setFont(new Font("arial black", Font.BOLD,15));
        L1.setForeground(Color.WHITE);
       L1.setSize(250, 30);
       L1.setLocation(50, 25);
       panel0.add(L1);
       
       JTextField text00 = new JTextField();
       text00.setSize(50, 50);
       text00.setLocation(50, 50);
       panel1.add(text00);
       
       
       JTextField text01 = new JTextField();
       text01.setSize(50, 50);
       text01.setLocation(150, 50);
       panel1.add(text01);
       
       JTextField text02 = new JTextField();
       text02.setSize(50, 50);
       text02.setLocation(250, 50);
       panel1.add(text02);
       
       
       JTextField text03 = new JTextField();
       text03.setSize(50, 50);
       text03.setLocation(50, 150);
       panel1.add(text03);
       
       
       JTextField text04 = new JTextField();
       text04.setSize(50, 50);
       text04.setLocation(150, 150);
       panel1.add(text04);
       
       JTextField text05 = new JTextField();
       text05.setSize(50, 50);
       text05.setLocation(250, 150);
       panel1.add(text05);
       
       JTextField text06 = new JTextField();
       text06.setSize(50, 50);
       text06.setLocation(50, 250);
       panel1.add(text06);
       
       
       JTextField text07 = new JTextField();
       text07.setSize(50, 50);
       text07.setLocation(150, 250);
       panel1.add(text07);
       
       JTextField text08 = new JTextField();
       text08.setSize(50, 50);
       text08.setLocation(250, 250);
       panel1.add(text08);
       
       
       
           
        
       ActionListener a1 = new ActionListener(){
           public void actionPerformed(){
              
           }

        @Override
        public void actionPerformed(ActionEvent e) {
        
         text03.setText(text01.getText());
       
      
 
        }
           
       };
       b2.addActionListener(a1);
       
            ActionListener a2 = new ActionListener(){
           public void actionPerformed(){
              
           }

        @Override
        public void actionPerformed(ActionEvent e) {
        
         text01.setText(text03.getText());
       
      
 
        }
           
       };
       b2.addActionListener(a2);
       
     
       
        
        
        
    
        
    }
}
    


