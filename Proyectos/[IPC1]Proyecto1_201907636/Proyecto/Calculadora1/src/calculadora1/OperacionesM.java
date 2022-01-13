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
public class OperacionesM extends JFrame{
     public JPanel panel1;
     public JPanel panel0;
    public OperacionesM(){
    super("OPERACIONES ENTRE MATRICES");
 
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
        
        
        JButton b1 = new JButton("Hallar Resultado");
        b1.setLocation(10, 570);
        b1.setSize(170, 40);
        panel0.add(b1);
        
        JButton b3 = new JButton("Suma");
        b3.setLocation(250, 570);
        b3.setSize(100, 40);
        panel0.add(b3);
        
        JButton b4 = new JButton("Resta");
        b4.setLocation(400, 570);
        b4.setSize(100, 40);
        panel0.add(b4);
        
        
        JButton b5 = new JButton("Multiplicacion");
        b5.setLocation(550, 570);
        b5.setSize(150, 40);
        panel0.add(b5);
        
        
        
        
        
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
    
    
    
    }
}
