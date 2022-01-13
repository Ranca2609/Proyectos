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
public class Sustitucion extends JFrame {
    public JPanel panel0;
public Sustitucion(){
        super("INTEGRALES POR SUSTITUCION");
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
        JLabel L1 = new JLabel("INTEGRACION POR SUSTITUCION TRIGONOMETRICA");
        L1.setFont(new Font("arial black", Font.BOLD,18));
        L1.setForeground(Color.WHITE);
        L1.setSize(600, 50);
        L1.setLocation(30, 20);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("La sustitucion trigonometrica sirve para integrar funciones que tienen la forma como la del formulario.");
        L2.setSize(630, 25);
        L2.setLocation(10, 90);
        L2.setForeground(Color.WHITE);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("Este metodo se basa en el uso de triangulos rectangulos, el teorema de Pitagoras e identidades");
        L3.setSize(630, 25);
        L3.setLocation(10, 110);
        L3.setForeground(Color.WHITE);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("trigonometricas. Ejemplo:");
        L4.setSize(630, 25);
        L4.setLocation(10, 130);
        L4.setForeground(Color.WHITE);
        panel0.add(L4);
        
        JLabel L5 = new JLabel("Ejemplo 1");
        L5.setFont(new Font("Lucida Sans", Font.BOLD,30));
        L5.setForeground(new Color(255,204,0));
        L5.setSize(630, 45);
        L5.setLocation(10, 165);
        panel0.add(L5);
        
        JLabel L6 = new JLabel("Ejemplo 2");
        L6.setFont(new Font("Lucida Sans", Font.BOLD,30));
        L6.setForeground(new Color(255,204,0));
        L6.setSize(630, 45);
        L6.setLocation(250, 165);
        panel0.add(L6);
        
        JLabel L7 = new JLabel("Ejemplo 3");
        L7.setFont(new Font("Lucida Sans", Font.BOLD,30));
        L7.setForeground(new Color(255,204,0));
        L7.setSize(630, 45);
        L7.setLocation(470, 165);
        panel0.add(L7);
        
}
private void boton(){
    JButton b1 = new JButton("FORMULARIO");
    b1.setBackground(new Color(4,176,129));
    b1.setForeground(Color.WHITE);
    b1.setSize(150, 30);
    b1.setLocation(250, 400);
    panel0.add(b1);
    
    JButton b2 = new JButton("Ir a Ejemplo 1");
    b2.setBackground(new Color(4,176,129));
    b2.setForeground(Color.WHITE);
    b2.setSize(150, 40);
    b2.setLocation(10, 250);
    panel0.add(b2);
    
    JButton b3 = new JButton("Ir a  Ejemplo 2");
    b3.setBackground(new Color(4,176,129));
    b3.setForeground(Color.WHITE);
    b3.setSize(150, 40);
    b3.setLocation(250, 250);
    panel0.add(b3);
    
    JButton b4 = new JButton("Ir a  Ejemplo 3");
    b4.setBackground(new Color(4,176,129));
    b4.setForeground(Color.WHITE);
    b4.setSize(150, 40);
    b4.setLocation(470, 250);
    panel0.add(b4);
    
    JButton b5 = new JButton("Volver a Menu Integrales");
    b5.setBackground(new Color(4,176,129));
    b5.setForeground(Color.WHITE);
    b5.setLocation(410, 470);
    b5.setSize(200, 35);
    panel0.add(b5);
    
    ActionListener a1 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Formulario ven1Nueva = new Formulario();
            ven1Nueva.setVisible(true);
        }
           
       };
       b1.addActionListener(a1);
       
       ActionListener a3 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Ejemplo1 ven3Nueva = new Ejemplo1();
            ven3Nueva.setVisible(true);
        }
           
       };
       b2.addActionListener(a3);
       
       ActionListener a4 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Ejemplo2 ven1Nueva = new Ejemplo2();
            ven1Nueva.setVisible(true);
        }
           
       };
       b3.addActionListener(a4);
       
       ActionListener a5 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Ejemplo3 ven3Nueva = new Ejemplo3();
            ven3Nueva.setVisible(true);
        }
           
       };
       b4.addActionListener(a5);
       
       
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