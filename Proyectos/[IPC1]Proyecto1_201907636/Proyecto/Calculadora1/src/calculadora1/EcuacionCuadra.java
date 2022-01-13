/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JTextField;
/**
 *
 * @author Carlos Rangel
 */
public class EcuacionCuadra extends JFrame {
         public JPanel panel1;  
    public EcuacionCuadra(){
        super("ECUACION CUADRATICA");
        this.setSize(400, 400);
        this.setLocation(470, 165);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   
    
        panel1 = new JPanel();
        panel1.setBackground(new Color(102,0,0));
        panel1.setLocation(15, 15);
        panel1.setSize(350, 330);
        panel1.setLayout(null);
        this.getContentPane().add(panel1);
   
        JLabel L1 = new JLabel();
        L1.setText("Ecuacion Cuadratica");
          L1.setFont(new Font("Lucida Sans", Font.BOLD,25));
        L1.setForeground(Color.WHITE);
        L1.setLocation(20, 10);
        L1.setSize(350, 25);
        panel1.add(L1);
        
        JLabel L2 = new JLabel();
        L2.setForeground(Color.WHITE);
        L2.setText("X^2 "+"+");
        L2.setLocation(70, 55);
        L2.setSize(40, 30);
        panel1.add(L2);
        
        JLabel L3 = new JLabel();
        L3.setForeground(Color.WHITE);
        L3.setText("X "+"+");
        L3.setLocation(150, 55);
        L3.setSize(40, 30);
        panel1.add(L3);
        
        JLabel L4 = new JLabel();
        L4.setForeground(Color.WHITE);
        L4.setText("Resultado");
        L4.setLocation(20, 110);
        L4.setSize(100, 30);
        panel1.add(L4);
        
        JLabel L5 = new JLabel();
        L5.setForeground(Color.WHITE);
        L5.setText("Primer Valor de X");
        L5.setLocation(20, 150);
        L5.setSize(150, 30);
        panel1.add(L5);
        
        JLabel L6 = new JLabel();
        L6.setText("Segundo Valor de X");
        L6.setForeground(Color.WHITE);
        L6.setLocation(20, 190);
        L6.setSize(150, 30);
        panel1.add(L6);
    
    
        JTextField text1 = new JTextField();
        text1.setText("");
        text1.setLocation(35, 45);
        text1.setSize(35, 35);
        panel1.add(text1);
        
        JTextField text2 = new JTextField();
        text2.setText("");
        text2.setLocation(110, 45);
        text2.setSize(35, 35);
        panel1.add(text2);
        
        JTextField text3 = new JTextField();
        text3.setText("");
        text3.setLocation(180, 45);
        text3.setSize(35, 35);
        panel1.add(text3);
        
        JTextField text4 = new JTextField();
        text4.setText("");
        text4.setLocation(170, 150);
        text4.setSize(150, 30);
        panel1.add(text4);
        
        JTextField text5 = new JTextField();
        text5.setText("");
        text5.setLocation(170, 190);
        text5.setSize(150, 30);
        panel1.add(text5);
        
        
    
    
        JButton b1 = new JButton("Calcular");
        b1.setBackground(new Color(102,102,0));
        b1.setForeground(Color.WHITE);
        b1.setLocation(130, 240);
        b1.setSize(85, 30);
        panel1.add(b1);
        
        JButton b2 = new JButton("Guardar Resultado");
        b2.setBackground(new Color(102,102,0));
        b2.setForeground(Color.WHITE);
        b2.setLocation(130, 290);
        b2.setSize(140, 30);
        panel1.add(b2);
        
        
        ActionListener a1 = new ActionListener(){
            public void actionPerformed(){
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a,b,c,x1,x2,d,r,g,L = null;
            a= Double.parseDouble(text1.getText());
            b= Double.parseDouble(text2.getText());
            c=Double.parseDouble(text3.getText());
            
            d=b*b-4*a*c;
            
            if (d>0)
            {
                r = CALCULOSMATH.raiz(d);
                x1=(-b+r)/(2*a)*1000/1000;
                x2=(-b-r)/(2*a)*1000/1000;
                text4.setText(String.valueOf(x1));
                text5.setText(String.valueOf(x2));
            } else{
              
                 r = CALCULOSMATH.raiz(d);
                 g = r/2*a;
                 L = r/2*a;
                x1=-b/2*a;
                x2= -b/2*a;
                text4.setText(String.valueOf(x1)+"+"+g+"i");
                text5.setText(String.valueOf(x2)+"-"+L+"i");
            }
            }
        };b1.addActionListener(a1);
       
    }
}
