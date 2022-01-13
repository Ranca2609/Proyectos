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
public class Derivadas extends JFrame {
    public JPanel panel0;
    public Derivadas(){
        super("CASOS DE DERIVACION");
        this.setSize(800, 600);
        this.setLocation(270, 100);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        
        JButton b5 = new JButton("5");
         b5.setBackground(new Color(4,176,129));
         b5.setForeground(Color.WHITE);
        b5.setLocation(500, 330);
        b5.setSize(60, 20);
        panel0.add(b5);
        
        JButton b6 = new JButton("6");
         b6.setBackground(new Color(4,176,129));
         b6.setForeground(Color.WHITE);
        b6.setLocation(500, 390);
        b6.setSize(60, 20);
        panel0.add(b6);
        
        JButton b7 = new JButton("Volver al Menu Principal");
         b7.setBackground(new Color(4,176,129));
         b7.setForeground(Color.WHITE);
        b7.setLocation(420, 500);
        b7.setSize(170, 30);
        panel0.add(b7);
        
         JButton b8 = new JButton("7");
         b8.setBackground(new Color(4,176,129));
         b8.setForeground(Color.WHITE);
        b8.setLocation(500, 450);
        b8.setSize(60, 20);
        panel0.add(b8);
        
        
          ActionListener a1 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Caso1 venNueva = new Caso1();
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
            
             Caso2 ven2Nueva = new Caso2();
            ven2Nueva.setVisible(true);
        }
           
       };
       b2.addActionListener(a3);
       
         ActionListener a4 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Caso3 ven3Nueva = new Caso3();
            ven3Nueva.setVisible(true);
        }
           
       };
       b3.addActionListener(a4);
       
       
        ActionListener a5 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Caso4 ven4Nueva = new Caso4();
            ven4Nueva.setVisible(true);
        }
           
       };
       b4.addActionListener(a5);
       
        ActionListener a6 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Caso5 ven5Nueva = new Caso5();
            ven5Nueva.setVisible(true);
        }
           
       };
       b5.addActionListener(a6);
       
       ActionListener a7 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Caso6 ven5Nueva = new Caso6();
            ven5Nueva.setVisible(true);
        }
           
       };
       b6.addActionListener(a7);
       
         ActionListener a8 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             DefinicionDeri ven6Nueva = new DefinicionDeri();
            ven6Nueva.setVisible(true);
        }
           
       };
       b8.addActionListener(a8);
       
        
    }
    private void label(){
        JLabel L1 = new JLabel("Casos de Derivacion");
        L1.setFont(new Font("arial black", Font.BOLD,25));
        L1.setSize(500, 25);
        L1.setLocation(180, 30);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("1. Derivada de una funcion de grado n");
        L2.setSize(250, 30);
        L2.setLocation(10, 90);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("2. Derivada del producto de una constante por una funcion");
        L3.setSize(350, 30);
        L3.setLocation(10, 150);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("3. Derivada de una Suma");
        L4.setSize(350, 30);
        L4.setLocation(10, 210);
        panel0.add(L4);
        
        JLabel L5 = new JLabel("4. Derivada de un Producto");
        L5.setSize(350, 30);
        L5.setLocation(10, 270);
        panel0.add(L5);
        
        JLabel L6 = new JLabel("5. Derivada de un Cociente");
        L6.setSize(350, 30);
        L6.setLocation(10, 330);
        panel0.add(L6);
        
        JLabel L7 = new JLabel("6. Regla de la Cadena");
        L7.setSize(350, 30);
        L7.setLocation(10, 390);
        panel0.add(L7);
        
        JLabel L8 = new JLabel("7. Definicion de Derivada");
        L8.setSize(350, 30);
        L8.setLocation(10, 450);
        panel0.add(L8);
        
      
      
        
        
    }
}
