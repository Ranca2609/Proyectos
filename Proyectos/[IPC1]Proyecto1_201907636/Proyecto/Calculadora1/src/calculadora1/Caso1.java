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
public class Caso1 extends JFrame{
    public JPanel panel0;
    public Caso1(){
        super("CASO 1");
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
        JLabel L1 = new JLabel("DERIVADA DE UNA FUNCION DE GRADO N");
        L1.setFont(new Font("arial black", Font.BOLD,20));
        L1.setSize(800, 50);
        L1.setLocation(60, 30);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("Una funcion de grado n, donde n es un esponente real, se representa por f(x)=x^n y su derivada se denota");
        L2.setSize(630, 25);
        L2.setLocation(10, 90);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("como f'(x)=nx^n-1. Algunos tipos de este tipo de funciones son: cuadratica, cubica, etc.");
        L3.setSize(630, 25);
        L3.setLocation(10, 110);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("Por ejemplo la funcion:");
        L4.setSize(630, 25);
        L4.setLocation(10, 150);
        panel0.add(L4);
        
        JLabel L5 = new JLabel("f(x)=X^3");
        L5.setFont(new Font("Lucida Sans", Font.BOLD,20));
        L5.setForeground(Color.WHITE);
        L5.setSize(630, 45);
        L5.setLocation(190, 145);
        panel0.add(L5);
        
        JLabel L6 = new JLabel("Lo primero que se hace es bajar el exponente de tal forma que este multiplique a la variable con respecto");
        L6.setSize(630, 25);
        L6.setLocation(10, 210);
        panel0.add(L6);
        
        JLabel L7 = new JLabel("a la cual estamos derivando, luego al mismo exponente se le resta la unidad formando uno nuevo asi:");
        L7.setSize(630, 25);
        L7.setLocation(10, 230);
        panel0.add(L7);
        
        JLabel L8 = new JLabel("f'(x)=3X^3-1");
        L8.setFont(new Font("Lucida Sans", Font.BOLD,20));
        L8.setForeground(Color.WHITE);
        L8.setSize(630, 45);
        L8.setLocation(190, 250);
        panel0.add(L8);
        
        JLabel L9 = new JLabel("Quedando finalmente asi:");
        L9.setSize(630, 25);
        L9.setLocation(10, 300);
        panel0.add(L9);
        
        JLabel L10 = new JLabel("f'(x)=3X^2");
        L10.setFont(new Font("Lucida Sans", Font.BOLD,20));
        L10.setForeground(Color.WHITE);
        L10.setSize(630, 45);
        L10.setLocation(190, 350);
        panel0.add(L10);
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