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
public class Historial extends JFrame {
  public JPanel panel0;
    public Historial(){
    super("HISTOEIAL DE RESULTADOS");
 
          this.setSize(500, 700);
        this.setLocation(450, 20);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
         //  panel0 =new JPanel();
       // panel0.setSize(450, 550);
      // panel0.setLocation(15, 80);
     // panel0.setBackground(Color.WHITE);
      // panel0.setLayout(null);
      // this.getContentPane().add(panel0);
       
       JScrollPane panel= new JScrollPane();
       panel.setSize(450, 550);
       panel.setLocation(15, 80);
       panel.setBackground(Color.WHITE);
       panel.setLayout(null);
       this.getContentPane().add(panel);
       
       JList lista = new JList();
       
       
   
       
       JLabel L1 = new JLabel("Resultado");
       L1.setLocation(10, 80);
       L1.setSize(150, 30);
       panel.add(L1);
       
       JLabel L2 = new JLabel("Operacion");
       L2.setLocation(200, 80);
       L2.setSize(150, 30);
       panel.add(L2);
       
       JLabel L3 = new JLabel("Fecha");
       L3.setLocation(350, 80);
       L3.setSize(150, 30);
       panel.add(L3);
       
       JLabel L4 = new JLabel("Historial");
       L4.setFont(new Font("Lucida Sans", Font.ITALIC,20) );
       L4.setForeground(Color.BLACK);
       L4.setLocation(15, 15);
       L4.setSize(150, 30);
       panel.add(L4);
       
       
    String [] opciones = {"R. Ascendente", "R. Descendente","Fecha"};
    JComboBox box1 = new JComboBox(opciones);
    box1.setLocation(180, 40);
    box1.setSize(120, 35);
    panel.add(box1);
    
    JButton b1 = new JButton("Ordenar");
    b1.setLocation(330, 40);
    b1.setSize(90, 30);
    panel.add(b1);
    }


    
}
