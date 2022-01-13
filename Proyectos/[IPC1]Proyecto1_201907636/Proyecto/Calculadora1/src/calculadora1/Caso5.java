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
public class Caso5 extends JFrame{
    public JPanel panel0;
public Caso5(){
        super("CASO 5");
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
        JLabel L1 = new JLabel("DERIVADA DE UN COCIENTE");
        L1.setFont(new Font("arial black", Font.BOLD,30));
        L1.setForeground(Color.WHITE);
        L1.setSize(600, 50);
        L1.setLocation(60, 20);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("La derivada de un cociente de dos funciones es la funcion ubicada en el denominador por la derivada del");
        L2.setSize(630, 25);
        L2.setLocation(10, 90);
        L2.setForeground(Color.WHITE);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("numerador menos la derivada de la funcion en el denominador por la funcion del numerador sin derivar");
        L3.setSize(630, 25);
        L3.setLocation(10, 110);
        L3.setForeground(Color.WHITE);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("todo sobre la funcion del denominador al cuadrado y se denota de la siguiente manera:");
        L4.setSize(630, 25);
        L4.setLocation(10, 130);
        L4.setForeground(Color.WHITE);
        panel0.add(L4);
        
        JLabel L5 = new JLabel("(f/g)'=f'(x)*g(x)+"+"g'(x)*f(x)");
        L5.setFont(new Font("Lucida Sans", Font.BOLD,30));
        L5.setForeground(new Color(255,204,0));
        L5.setSize(630, 45);
        L5.setLocation(140, 165);
        panel0.add(L5);
        
        JLabel L16 = new JLabel("----------------");
        L16.setFont(new Font("Lucida Sans", Font.BOLD,30));
        L16.setForeground(new Color(255,204,0));
        L16.setSize(630, 45);
        L16.setLocation(240, 185);
        panel0.add(L16);
        
        JLabel L17 = new JLabel("[g(x)]^2");
        L17.setFont(new Font("Lucida Sans", Font.BOLD,30));
        L17.setForeground(new Color(255,204,0));
        L17.setSize(630, 45);
        L17.setLocation(340, 210);
        panel0.add(L17);
        
        JLabel L9 = new JLabel("Ejemplo: Hallar la derivada de (5x^2/x^5)");
        L9.setSize(630, 25);
        L9.setLocation(10, 240);
        L9.setForeground(Color.WHITE);
        panel0.add(L9);
        
        JLabel L10 = new JLabel("f'(x)=10x y g'(x)=5x^4");
        L10.setSize(630, 45);
        L10.setLocation(10, 245);
        L10.setForeground(Color.WHITE);
        panel0.add(L10);
        
        JLabel L13 = new JLabel("Por lo tanto nos quedaria ordenada de la siguiente manera.");
        L13.setSize(630, 45);
        L13.setLocation(10, 260);
        L13.setForeground(Color.WHITE);
        panel0.add(L13);
        
         
        JLabel L12 = new JLabel("(f/g)'= (10x)(x^5)-(5x^4)(5x^2)/x^10");
        L12.setFont(new Font("Lucida Sans", Font.BOLD,25));
        L12.setForeground(new Color(255,204,0));
        L12.setSize(630, 45);
        L12.setLocation(40, 290);
        panel0.add(L12);
        
        JLabel L14 = new JLabel("(f/g)'=10x^6-25x^6/x^10");
        L14.setFont(new Font("Lucida Sans", Font.BOLD,25));
        L14.setForeground(new Color(255,204,0));
        L14.setSize(630, 45);
        L14.setLocation(40, 320);
        panel0.add(L14);
        
        JLabel L15 = new JLabel("(f/g)'= -15x^6/x^10");
        L15.setFont(new Font("Lucida Sans", Font.BOLD,25));
        L15.setForeground(new Color(255,204,0));
        L15.setSize(630, 45);
        L15.setLocation(40, 350);
        panel0.add(L15);
        
        JLabel L18 = new JLabel("(f/g)'= -15x^-4");
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
