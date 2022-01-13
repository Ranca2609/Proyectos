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
public class DefinicionDeri extends JFrame {
    public JPanel panel0;
    public DefinicionDeri(){
        super("DEFINICION");
        this.setSize(800, 600);
        this.setLocation(270, 100);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        JLabel L1 = new JLabel("¿Que es una Derivada en el calculo?");
        L1.setFont(new Font("arial black", Font.BOLD,20));
        L1.setSize(800, 50);
        L1.setLocation(60, 30);
        panel0.add(L1);
        
        JLabel L2 = new JLabel("Es la nocion matematica que nombra al valor limite del vinculo entre el aumento del valor de una funcion");
        L2.setSize(630, 25);
        L2.setLocation(10, 90);
        panel0.add(L2);
        
        JLabel L3 = new JLabel("y el aunmento de la variable independiente. Por lo tanto es el limite hacia el tiende una razon entre el");
        L3.setSize(630, 25);
        L3.setLocation(10, 110);
        panel0.add(L3);
        
        JLabel L4 = new JLabel("incremento de la funcion y el que corresponde a la variable, cuando este ultimo tiende a 0.");
        L4.setSize(630, 25);
        L4.setLocation(10, 130);
        panel0.add(L4);
        
        JLabel L5 = new JLabel(new ImageIcon("cur.jpg"));
        L5.setSize(630, 400);
        L5.setLocation(-90, 150);
        panel0.add(L5);
        
       
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
