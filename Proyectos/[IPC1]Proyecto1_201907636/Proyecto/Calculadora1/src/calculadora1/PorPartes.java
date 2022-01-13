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
public class PorPartes extends JFrame {
    public JPanel panel0;
public PorPartes(){
        super("INTEGRALES POR PARTES");
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
        JLabel L1 = new JLabel("INTEGRACION POR PARTES");
        L1.setFont(new Font("arial black", Font.BOLD,18));
        L1.setForeground(Color.WHITE);
        L1.setSize(600, 50);
        L1.setLocation(170, 20);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("El primer paso de la integracion por partes es la eleccion e integracion de dv en la integral dada.");
        L2.setSize(630, 25);
        L2.setLocation(10, 90);
        L2.setForeground(Color.WHITE);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("La funcion dv suele ser el factor mas complicado en el producto que puede integrarse usando formulas basicas.");
        L3.setSize(680, 25);
        L3.setLocation(10, 110);
        L3.setForeground(Color.WHITE);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("El segundo paso es la diferenciacion del factor restante u en la integral dada. Luego se forma");
        L4.setSize(630, 25);
        L4.setLocation(10, 130);
        L4.setForeground(Color.WHITE);
        panel0.add(L4);
        
        JLabel L5 = new JLabel(new ImageIcon("formula.jpeg"));
        L5.setLocation(75, 5);
        L5.setSize(500, 400);
        panel0.add(L5);
        
        JLabel L6 = new JLabel("El tercer paso, por supuesto, es la evaluacion de la integral de v por el diferencial du.");
        L6.setSize(630, 25);
        L6.setLocation(10, 250);
        L6.setForeground(Color.WHITE);
        panel0.add(L6);
        
        
        
}
private void boton(){
   
 
    JButton b3 = new JButton("Ir al  Ejemplo");
    b3.setBackground(new Color(4,176,129));
    b3.setForeground(Color.WHITE);
    b3.setSize(150, 40);
    b3.setLocation(250, 350);
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
            
             EjemploPartes ven1Nueva = new EjemploPartes();
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
