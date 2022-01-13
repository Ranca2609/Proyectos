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
public class CambioVariables extends JFrame {
        public JPanel panel0;
public CambioVariables(){
        super("INTEGRALES POR CAMBIO DE VARIABLES");
        this.setSize(800, 600);
        this.setLocation(270, 100);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     panel();
     label();
     boton();
}
private void panel(){
        panel0 =new JPanel();
        panel0.setSize(650, 535);
        panel0.setLocation(70, 10);
        panel0.setBackground(new Color(51,0,204));
        panel0.setLayout(null);
        this.getContentPane().add(panel0);
}
private void label(){
        JLabel L1 = new JLabel("INTEGRACION POR CAMBIO DE VARIABLES");
        L1.setFont(new Font("arial black", Font.BOLD,18));
        L1.setForeground(Color.WHITE);
        L1.setSize(600, 50);
        L1.setLocation(110, 20);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("Como lo indica su nombre, este metodo de integracion consiste en la aplicacion de un cambio de variable para");
        L2.setSize(630, 25);
        L2.setLocation(10, 90);
        L2.setForeground(Color.WHITE);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("simplificar el integrando.");
        L3.setSize(680, 25);
        L3.setLocation(10, 110);
        L3.setForeground(Color.WHITE);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("1. Escoger un cambio de variable z= funcion de x");
        L4.setSize(630, 25);
        L4.setLocation(10, 130);
        L4.setForeground(Color.WHITE);
        panel0.add(L4);
        
        JLabel L7 = new JLabel("2. Despejar x para calcular dx.");
        L7.setSize(630, 25);
        L7.setLocation(10, 150);
        L7.setForeground(Color.WHITE);
        panel0.add(L7);
        
        JLabel L8 = new JLabel("3. Sustituir en la integral, resolverla y deshacer el cambio de variable.");
        L8.setSize(630, 25);
        L8.setLocation(10, 170);
        L8.setForeground(Color.WHITE);
        panel0.add(L8);
        
        JLabel L9 = new JLabel("En la siguiente tabla se recogen los cambios de variable que tienen alta probabilidad de funcionar.");
        L9.setSize(700, 25);
        L9.setLocation(10, 200);
        L9.setForeground(Color.WHITE);
        panel0.add(L9);
        
        JLabel L5 = new JLabel(new ImageIcon("tabla.jpeg"));
        L5.setLocation(25, 5);
        L5.setSize(350, 750);
        panel0.add(L5);
        
       
        
        
        
}
private void boton(){
   
 
    JButton b3 = new JButton("Ir al  Ejemplo");
    b3.setBackground(new Color(4,176,129));
    b3.setForeground(Color.WHITE);
    b3.setSize(150, 40);
    b3.setLocation(430, 300);
    panel0.add(b3);
    
   
    
    JButton b5 = new JButton("Volver a Menu Integrales");
    b5.setBackground(new Color(4,176,129));
    b5.setForeground(Color.WHITE);
    b5.setLocation(410, 470);
    b5.setSize(200, 35);
    panel0.add(b5);
       
       ActionListener a4 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             EjemploCambio ven1Nueva = new EjemploCambio();
            ven1Nueva.setVisible(true);
        }
           
       };
       b3.addActionListener(a4);
       
   
       
       
       ActionListener a2 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Integrales ven2Nueva = new Integrales();
            ven2Nueva.setVisible(true);
        }
           
       };
       b5.addActionListener(a2);
}
    
}
