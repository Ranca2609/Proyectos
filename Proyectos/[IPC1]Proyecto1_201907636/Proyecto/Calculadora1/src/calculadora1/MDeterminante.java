/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
/**
 *
 * @author Carlos Rangel
 */
public class MDeterminante extends JFrame {
    public JPanel panel1;
     public JPanel panel0;
    public MDeterminante(){
    super("DETERMINANTE");
 
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
     panel1.setLocation(30, 60);
      panel1.setBackground(Color.BLACK);
     panel1.setLayout(null);
     panel0.add(panel1);
        
        
        JButton b1 = new JButton("Hallar la Matriz");
        b1.setLocation(10, 570);
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
       
       
         ActionListener a1 = new ActionListener(){
           public void actionPerformed(){
              
                 panel1.setLayout(new GridLayout(Integer.parseInt(text1.getText()), Integer.parseInt(text1.getText())));
           }

        @Override
        public void actionPerformed(ActionEvent e) {
           
           for(int i=0;i<Integer.parseInt(text1.getText())*Integer.getInteger(text1.getText());i++){
               JTextField text0 = new JTextField();
               text0.setSize(40, 40);
               text0.setLocation(20+5*i, 10+5*i);
               panel1.add(text0);
           }
            
 
        }
           
       };
       b2.addActionListener(a1);
       
        
        
    }
}
