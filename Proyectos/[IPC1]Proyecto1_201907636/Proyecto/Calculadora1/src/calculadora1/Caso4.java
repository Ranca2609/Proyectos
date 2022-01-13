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
public class Caso4 extends JFrame{
public JPanel panel0;
public Caso4(){
        super("CASO 4");
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
        JLabel L1 = new JLabel("DERIVADA DE UN PRODUCTO");
        L1.setFont(new Font("arial black", Font.BOLD,30));
        L1.setForeground(Color.WHITE);
        L1.setSize(600, 50);
        L1.setLocation(60, 20);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("La derivada de un producto de dos funciones es equivalente a la suma entre el producto de la primera");
        L2.setSize(630, 25);
        L2.setLocation(10, 90);
        L2.setForeground(Color.WHITE);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("funcion sin derivar y la derivada de la segunda funcion y el producto de la derivada de la primera funcion");
        L3.setSize(630, 25);
        L3.setLocation(10, 110);
        L3.setForeground(Color.WHITE);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("por la segunda funcion sin derivar. Se denota de la siguiente forma:");
        L4.setSize(630, 25);
        L4.setLocation(10, 130);
        L4.setForeground(Color.WHITE);
        panel0.add(L4);
        
        JLabel L5 = new JLabel("(f*g)'=f(x)*g'(x)+"+"g(x)*f'(x)");
        L5.setFont(new Font("Lucida Sans", Font.BOLD,30));
        L5.setForeground(new Color(255,204,0));
        L5.setSize(630, 45);
        L5.setLocation(140, 165);
        panel0.add(L5);
        
        JLabel L9 = new JLabel("Ejemplo: Si sabemos que f(x)=3x^2 y g(x)= 12x^4. Nos piden hallar la derivada pero ambas funciones");
        L9.setSize(630, 25);
        L9.setLocation(10, 210);
        L9.setForeground(Color.WHITE);
        panel0.add(L9);
        
        JLabel L10 = new JLabel("se estan multiplicando por lo tanto aplicamos la regla del producto derivando cada una por aparte ");
        L10.setSize(630, 45);
        L10.setLocation(10, 220);
        L10.setForeground(Color.WHITE);
        panel0.add(L10);
        
        JLabel L13 = new JLabel("y la derivada de cada una la multiplicaremos por la otra funcion sin derivar.");
        L13.setSize(630, 45);
        L13.setLocation(10, 240);
        L13.setForeground(Color.WHITE);
        panel0.add(L13);
        
        
        JLabel L11 = new JLabel("En este caso nos quedaria de la siguiente forma:");
        L11.setSize(630, 45);
        L11.setLocation(10, 270);
        L11.setForeground(Color.WHITE);
        panel0.add(L11);
        
         
        JLabel L12 = new JLabel("(f*g)'= (3x^2)(48x^3) + (12x^4)(6x)");
        L12.setFont(new Font("Lucida Sans", Font.BOLD,25));
        L12.setForeground(new Color(255,204,0));
        L12.setSize(630, 45);
        L12.setLocation(40, 320);
        panel0.add(L12);
        
        JLabel L14 = new JLabel("(f*g)'= (144x^5)+(72x^5)");
        L14.setFont(new Font("Lucida Sans", Font.BOLD,25));
        L14.setForeground(new Color(255,204,0));
        L14.setSize(630, 45);
        L14.setLocation(40, 350);
        panel0.add(L14);
        
        JLabel L15 = new JLabel("(f*g)'= 216x^5");
        L15.setFont(new Font("Lucida Sans", Font.BOLD,25));
        L15.setForeground(new Color(255,204,0));
        L15.setSize(630, 45);
        L15.setLocation(40, 380);
        panel0.add(L15);
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
