/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Carlos Rangel
 */
public class DefinicionInte extends JFrame {
      public JPanel panel0;
    public DefinicionInte(){
        super("DEFINICION");
        this.setSize(800, 600);
        this.setLocation(270, 100);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel();
        label();
        boton();
    }
    private void panel(){
        panel0 =new JPanel();
        panel0.setSize(650, 535);
        panel0.setLocation(70, 10);
        panel0.setBackground(new Color(0,255,102));
        panel0.setLayout(null);
        this.getContentPane().add(panel0);
}
     private void label(){
        JLabel L1 = new JLabel("¿Que es una Integral en el calculo?");
        L1.setFont(new Font("arial black", Font.BOLD,20));
        L1.setSize(800, 50);
        L1.setLocation(60, 30);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("La integral definida es el la antiderivada de una funcion esto quiere decir que al integrar esa funcion");
        L2.setSize(630, 25);
        L2.setLocation(10, 90);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("encontraremos la funcion original. Ahora la integral definida es el area bajo la curva que se encuentra");
        L3.setSize(630, 25);
        L3.setLocation(10, 110);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("encerrado en un intervalo [a,b].");
        L4.setSize(630, 25);
        L4.setLocation(10, 130);
        panel0.add(L4);
        
        JLabel L5 = new JLabel(new ImageIcon("inte.png"));
        L5.setSize(630, 400);
        L5.setLocation(-120, 150);
        panel0.add(L5);
        
        JLabel L6 = new JLabel(new ImageIcon("defi.png"));
        L6.setSize(630, 400);
        L6.setLocation(150, 170);
        panel0.add(L6);
        
       
     } 
     private void boton(){
         JButton b1 = new JButton("Volver a Menu Integrales");
          b1.setBackground(new Color(255,102,0));
         b1.setForeground(Color.WHITE);
         b1.setLocation(410, 470);
         b1.setSize(200, 35);
         panel0.add(b1);
         
         ActionListener a1 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Integrales ven1Nueva = new Integrales();
            ven1Nueva.setVisible(true);
        }
           
       };
       b1.addActionListener(a1);
    
    
    
}
}
