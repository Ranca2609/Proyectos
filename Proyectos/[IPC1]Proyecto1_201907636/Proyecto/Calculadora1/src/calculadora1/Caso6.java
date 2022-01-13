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
public class Caso6 extends JFrame {
    public JPanel panel0;
public Caso6(){
        super("CASO 6");
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
        JLabel L1 = new JLabel("REGLA DE LA CADENA");
        L1.setFont(new Font("arial black", Font.BOLD,30));
        L1.setForeground(Color.WHITE);
        L1.setSize(600, 50);
        L1.setLocation(110, 20);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("La regla de la cadena es una formula para calcular la derivada de la composicion de dos o mas funciones");
        L2.setSize(630, 25);
        L2.setLocation(10, 90);
        L2.setForeground(Color.WHITE);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("Esto, es si f y g son dos funciones, entonces la regla se expresa la derivada de la funcion compues fog");
        L3.setSize(630, 25);
        L3.setLocation(10, 110);
        L3.setForeground(Color.WHITE);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("en terminos de las derivadas f y g, se denota de la siguiente forma: ");
        L4.setSize(630, 25);
        L4.setLocation(10, 130);
        L4.setForeground(Color.WHITE);
        panel0.add(L4);
        
        JLabel L5 = new JLabel("(f(g(x)))'=f'(g(x))*g'(x)");
        L5.setFont(new Font("Lucida Sans", Font.BOLD,30));
        L5.setForeground(new Color(255,204,0));
        L5.setSize(630, 45);
        L5.setLocation(140, 165);
        panel0.add(L5);
        
       
        
        JLabel L9 = new JLabel("Ejemplo: Hallar la derivada de sin(x^2)");
        L9.setSize(630, 25);
        L9.setLocation(10, 240);
        L9.setForeground(Color.WHITE);
        panel0.add(L9);
        
        JLabel L10 = new JLabel("Esto se trata de la composicion de la funcion seno y la funcion x al cuadrado.");
        L10.setSize(630, 45);
        L10.setLocation(10, 245);
        L10.setForeground(Color.WHITE);
        panel0.add(L10);
        
        JLabel L13 = new JLabel("Su derivada es la derivada del seno por la derivada de x al cuadrado.");
        L13.setSize(630, 45);
        L13.setLocation(10, 260);
        L13.setForeground(Color.WHITE);
        panel0.add(L13);
        
         
        JLabel L12 = new JLabel("(f(g(x)))'=cos(x^2)(2x)");
        L12.setFont(new Font("Lucida Sans", Font.BOLD,25));
        L12.setForeground(new Color(255,204,0));
        L12.setSize(630, 45);
        L12.setLocation(40, 320);
        panel0.add(L12);
        
        
        JLabel L18 = new JLabel("(f(g(x)))'=2xcos(x^2)");
        L18.setFont(new Font("Lucida Sans", Font.BOLD,25));
        L18.setForeground(new Color(255,204,0));
        L18.setSize(630, 45);
        L18.setLocation(40, 380);
        panel0.add(L18);
     } 
     private void boton(){
         JButton b1 = new JButton("Volver a Menu Derivadas");
         b1.setBackground(new Color(4,176,129));
         b1.setForeground(Color.WHITE);
         b1.setLocation(410, 470);
         b1.setSize(200, 35);
         panel0.add(b1);
         
         ActionListener a1 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Derivadas ven1Nueva = new Derivadas();
            ven1Nueva.setVisible(true);
        }
           
       };
       b1.addActionListener(a1);
     }

}
