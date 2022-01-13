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
public class Formulario extends JFrame {
    public JPanel panel0;
public Formulario(){
        super("INTEGRALES POR SUSTITUCION FORMULARIO");
        this.setSize(700, 600);
        this.setLocation(330, 70);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel();
        label();
        boton();
}
private void panel(){
        panel0 =new JPanel();
        panel0.setSize(600, 525);
        panel0.setLocation(40, 10);
        panel0.setBackground(new Color(51,0,204));
        panel0.setLayout(null);
        this.getContentPane().add(panel0);
}
private void label(){
        JLabel L0 = new JLabel("FORMULARIO");
        L0.setLocation(200, 50);
        L0.setFont(new Font("Lucida Sans", Font.BOLD,30));
        L0.setForeground(new Color(255,204,0));
        L0.setSize(300, 40);
        panel0.add(L0);
    
        JLabel L1 = new JLabel(new ImageIcon("Sust.png"));
        L1.setLocation(50, -10);
        L1.setSize(500, 500);
        panel0.add(L1);
}
private void boton(){
    JButton b1 = new JButton("Regresar");
    b1.setSize(120, 20);
    b1.setBackground(new Color(4,176,129));
    b1.setForeground(Color.WHITE);
    b1.setLocation(250, 450);
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
