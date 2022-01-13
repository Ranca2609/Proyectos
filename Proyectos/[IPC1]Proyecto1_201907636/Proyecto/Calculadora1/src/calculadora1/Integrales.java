/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Carlos Rangel
 */
public class Integrales extends JFrame {
    public JPanel panel0;
    public Integrales(){
        super("CASOS DE INTEGRACION");
        this.setSize(800, 600);
        this.setLocation(270, 100);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel();
        boton();
        label();
    
}
     private void panel(){
        panel0 =new JPanel();
        panel0.setSize(650, 535);
        panel0.setLocation(70, 10);
        panel0.setBackground(new Color(255,102,0));
        panel0.setLayout(null);
        this.getContentPane().add(panel0);
}
    private void boton(){
        JButton b1 = new JButton("1");
         b1.setBackground(new Color(4,176,129));
         b1.setForeground(Color.WHITE);
        b1.setLocation(500, 90);
        b1.setSize(60, 20);
        panel0.add(b1);
        
        
        JButton b2 = new JButton("2");
         b2.setBackground(new Color(4,176,129));
         b2.setForeground(Color.WHITE);
        b2.setLocation(500, 150);
        b2.setSize(60, 20);
        panel0.add(b2);
        
        
        JButton b3 = new JButton("3");
         b3.setBackground(new Color(4,176,129));
         b3.setForeground(Color.WHITE);
        b3.setLocation(500, 210);
        b3.setSize(60, 20);
        panel0.add(b3);
        
        JButton b4 = new JButton("4");
         b4.setBackground(new Color(4,176,129));
         b4.setForeground(Color.WHITE);
        b4.setLocation(500, 270);
        b4.setSize(60, 20);
        panel0.add(b4);
        
        
        JButton b7 = new JButton("Volver al Menu Principal");
         b7.setBackground(new Color(4,176,129));
         b7.setForeground(Color.WHITE);
        b7.setLocation(420, 460);
        b7.setSize(170, 30);
        panel0.add(b7);
        
          ActionListener a1 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Sustitucion venNueva = new Sustitucion();
            venNueva.setVisible(true);
        }
           
       };
       b1.addActionListener(a1);
       
       ActionListener a2 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Cuadro ven1Nueva = new Cuadro();
            ven1Nueva.setVisible(true);
        }
           
       };
       b7.addActionListener(a2);
       
       ActionListener a3 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             PorPartes ven3Nueva = new PorPartes();
            ven3Nueva.setVisible(true);
        }
           
       };
       b2.addActionListener(a3);
       
         ActionListener a4 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             CambioVariables ven3Nueva = new CambioVariables();
            ven3Nueva.setVisible(true);
        }
           
       };
       b3.addActionListener(a4);
       
       
           ActionListener a5 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             DefinicionInte ven3Nueva = new DefinicionInte();
            ven3Nueva.setVisible(true);
        }
           
       };
       b4.addActionListener(a5);
       
       
       
            }
    private void label(){
        JLabel L1 = new JLabel("Tecnicas de Integracion");
        L1.setFont(new Font("arial black", Font.BOLD,25));
        L1.setSize(500, 25);
        L1.setLocation(180, 30);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("1. Integracion por Sustitucion Trigonometrica");
        L2.setSize(300, 30);
        L2.setLocation(10, 90);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("2. Integracion por partes");
        L3.setSize(350, 30);
        L3.setLocation(10, 150);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("3. Integracion por cambio de variables");
        L4.setSize(350, 30);
        L4.setLocation(10, 210);
        panel0.add(L4);
        
        JLabel L5 = new JLabel("4. Definicion Integrales");
        L5.setSize(350, 30);
        L5.setLocation(10, 270);
        panel0.add(L5);
        
        
    }
}