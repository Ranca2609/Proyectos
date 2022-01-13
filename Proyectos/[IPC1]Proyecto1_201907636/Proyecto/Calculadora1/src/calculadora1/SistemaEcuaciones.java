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
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
/**
 *
 * @author Carlos Rangel
 */
public class SistemaEcuaciones extends JFrame {
    public JPanel panel0;
public JPanel panel1;
    public 
SistemaEcuaciones(){
    super("SISTEMA DE ECUACIONES");
 
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
     
         
        JButton b1 = new JButton("Hallar los valores");
        b1.setLocation(10, 580);
        b1.setSize(200, 40);
        panel0.add(b1);
        
        JButton b2 = new JButton("Construir Sistema");
        b2.setLocation(450, 20);
        b2.setSize(170, 30);
        panel0.add(b2);
        
        
       JTextField text1 = new JTextField();
       text1.setLocation(350, 25);
       text1.setSize(60, 25);
       panel0.add(text1);
       
       JLabel L1 = new JLabel("Escriba el numero de incognitas");
         L1.setFont(new Font("arial black", Font.BOLD,15));
        L1.setForeground(Color.WHITE);
       L1.setSize(300, 30);
       L1.setLocation(50, 25);
       panel0.add(L1);
       
           
        
       ActionListener a1 = new ActionListener(){
           public void actionPerformed(){
              
             panel1.setLayout(new GridLayout(Integer.parseInt(text1.getText()), Integer.parseInt(text1.getText()),50,50));     
                 
           }

        @Override
        public void actionPerformed(ActionEvent e) {
           JTextField[] text0 = new JTextField[Integer.parseInt(text1.getText())];
            for(int i=0;i<Integer.parseInt(text1.getText())*Integer.parseInt(text1.getText());i++){
             
            text0[i] = new JTextField();
              
              
               panel0.add(text0[i]);
            }
 
        }
           
       };
       b2.addActionListener(a1);
     
    
}
}