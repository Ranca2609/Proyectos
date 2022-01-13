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
public class Caso3 extends JFrame {
    public JPanel panel0;
    public Caso3(){
        super("CASO 3");
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
        panel0.setBackground(new Color(0,255,102));
        panel0.setLayout(null);
        this.getContentPane().add(panel0);
}
     private void label(){
        JLabel L1 = new JLabel("DERIVADA DE UNA SUMA");
        L1.setFont(new Font("arial black", Font.BOLD,30));
        L1.setForeground(Color.BLACK);
        L1.setSize(600, 50);
        L1.setLocation(100, 30);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("La derivada del producto de una constante por una funcion es igual al producto de la");
        L2.setSize(630, 25);
        L2.setLocation(10, 90);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("de la constante por la derivada de la funcion");
        L3.setSize(630, 25);
        L3.setLocation(10, 110);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("Esto quiere decir que si tenemos:");
        L4.setSize(630, 25);
        L4.setLocation(10, 150);
        panel0.add(L4);
        
        JLabel L5 = new JLabel("f(x)+"+"g(x)");
        L5.setFont(new Font("Lucida Sans", Font.BOLD,30));
        L5.setForeground(Color.WHITE);
        L5.setSize(630, 45);
        L5.setLocation(190, 165);
        panel0.add(L5);
        
        JLabel L6 = new JLabel("Derivamos ambas respecto a la variable x y las sumamos como lo hariamos normalmente");
        L6.setSize(630, 25);
        L6.setLocation(10, 210);
        panel0.add(L6);
        
  
        JLabel L8 = new JLabel("f'(x)+g'(x)");
        L8.setFont(new Font("Lucida Sans", Font.BOLD,30));
        L8.setForeground(Color.WHITE);
        L8.setSize(630, 45);
        L8.setLocation(190, 250);
        panel0.add(L8);
        
        JLabel L9 = new JLabel("Ejemplo:");
        L9.setSize(630, 25);
        L9.setLocation(10, 300);
        panel0.add(L9);
        
        JLabel L10 = new JLabel("Sabiendo que f(x)=x^4 "+"y que g(x)=3x^5 sus derivadas serian f(x)=4x^3 y g(x)=15x^4");
        L10.setSize(630, 45);
        L10.setLocation(70, 290);
        panel0.add(L10);
        
        JLabel L11 = new JLabel("Por lo tanto la suma de ambas funciones ya derivadas quedaria asi:");
        L11.setSize(630, 45);
        L11.setLocation(10, 320);
        panel0.add(L11);
        
         
        JLabel L12 = new JLabel("4x^3 "+"+15x^4");
        L12.setFont(new Font("Lucida Sans", Font.BOLD,30));
        L12.setForeground(Color.WHITE);
        L12.setSize(630, 45);
        L12.setLocation(190, 360);
        panel0.add(L12);
     } 
     private void boton(){
         JButton b1 = new JButton("Volver a Menu Derivadas");
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
            
             Derivadas ven1Nueva = new Derivadas();
            ven1Nueva.setVisible(true);
        }
           
       };
       b1.addActionListener(a1);
     }
    
}
