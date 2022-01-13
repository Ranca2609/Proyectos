/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
/**
 *
 * @author Carlos Rangel
 */
public class Angulos extends JFrame {
    public JPanel panel0;
    public String operador;
      Double dato1;
     Double dato2;
     final double conver = 0.01744444444;
    
public Angulos(){
    super("ANGULOS");
        this.setSize(600, 400);
        this.setLocation(380, 150);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 

     panel0 = new JPanel();
        panel0 = new JPanel();
         panel0.setBackground(new Color(4,176,129));
        panel0.setSize(550, 335);
        panel0.setLocation(17, 15);
        panel0.setLayout(null);
        this.getContentPane().add(panel0);
        


    JLabel L1 = new JLabel("Longitud de Arco");
    L1.setFont(new Font("arial black", Font.BOLD,15));
    L1.setLocation(60, 10);
    L1.setSize(180, 35);
    panel0.add(L1);
    
    JLabel L2 = new JLabel("Angulo");
    L2.setLocation(120, 40);
    L2.setSize(180, 35);
    panel0.add(L2);
    
    JLabel L3 = new JLabel("Radio");
    L3.setLocation(120, 100);
    L3.setSize(180, 35);
    panel0.add(L3);
    
    JLabel L4 = new JLabel("Resultado:");
    L4.setLocation(120, 170);
    L4.setSize(180, 35);
    panel0.add(L4);
    


        JTextField text1 = new JTextField();
        text1.setLocation(175, 45);
        text1.setSize(80, 25);
        panel0.add(text1);
        
        JTextField text2 = new JTextField();
        text2.setLocation(175, 105);
        text2.setSize(80, 25);
        panel0.add(text2);
        
        JTextField text3 = new JTextField();
        text3.setLocation(205, 175);
        text3.setSize(100, 25);
        panel0.add(text3);


    JButton b1 = new JButton("Guardar Resultado");
    b1.setLocation(180, 280);
    b1.setSize(150, 35);
    panel0.add(b1);
    
    JButton b2 = new JButton("Calcular");
    b2.setLocation(360, 180);
    b2.setSize(120, 35);
    panel0.add(b2);
    
    JButton b3 = new JButton("Graficar");
    b3.setLocation(380, 250);
    b3.setSize(90, 30);
    panel0.add(b3);
  

    String [] opciones = {"Grados", "Radianes"};
    JComboBox box1 = new JComboBox(opciones);
    box1.setLocation(350, 90);
    box1.setSize(160, 35);
    panel0.add(box1);
    
    
    

    ActionListener a1 = new ActionListener(){
        public void actionPerformed(){
    
        }
        @Override
        public void actionPerformed(ActionEvent e) {
         double angulo = Double.parseDouble(text1.getText());
         double radio = Double.parseDouble(text2.getText());
         String opcion= box1.getSelectedItem().toString();
         int opcion1 = box1.getSelectedIndex();
         if(opcion1==0){
             text3.setText(String.valueOf(angulo*radio));
             
         }else{
              if(opcion1==1){
             text3.setText(String.valueOf(angulo*radio*conver));     
              }
         }
        }
        
    };b2.addActionListener(a1);
    
 
    
   }
}
