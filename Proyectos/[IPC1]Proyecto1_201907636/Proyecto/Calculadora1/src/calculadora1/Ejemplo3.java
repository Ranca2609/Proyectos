/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Carlos Rangel
 */
public class Ejemplo3 extends JFrame {
    public JPanel panel0;
public Ejemplo3(){
        super("TERCER EJEMPLO");
        this.setSize(1000, 750);
        this.setLocation(200, 0);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel();
        label();
        boton();
}
private void panel(){
        panel0 =new JPanel();
        panel0.setSize(900, 675);
        panel0.setLocation(40, 10);
        panel0.setBackground(new Color(51,0,204));
        panel0.setLayout(null);
        this.getContentPane().add(panel0);
}
private void label(){
        JLabel L0 = new JLabel("EJEMPLO 3");
        L0.setLocation(360, 0);
        L0.setFont(new Font("Lucida Sans", Font.BOLD,30));
        L0.setForeground(new Color(255,204,0));
        L0.setSize(300, 40);
        panel0.add(L0);
    
        JLabel L1 = new JLabel(new ImageIcon("ejem3.png"));
        L1.setLocation(50, 40);
        L1.setSize(800, 600);
        panel0.add(L1);
}
private void boton(){
    JButton b1 = new JButton("Regresar");
    b1.setSize(120, 40);
    b1.setBackground(new Color(4,176,129));
    b1.setForeground(Color.WHITE);
    b1.setLocation(390, 630);
    panel0.add(b1);
    
    ActionListener a1 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Sustitucion ven9Nueva = new Sustitucion();
            ven9Nueva.setVisible(true);
        }
           
       };
       b1.addActionListener(a1);
}    
    
    
}
