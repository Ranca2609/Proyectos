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
import javax.swing.JLabel;
import javax.swing.JButton
;/**
 *
 * @author Carlos Rangel
 */
public class Cuadro extends JFrame {
    public JPanel panel0;
    public  Cuadro(){
        super("MENU PRINCIPAL");
        this.setBounds(45, 40, 1280, 650);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JFrame VENTANA =this;
       
        paneles();
        botones();
        
    }
private void paneles(){
    panel0 = new JPanel();
    panel0.setBackground(Color.YELLOW);
    panel0.setLocation(30, 65);
    panel0.setSize(1200, 500);
    panel0.setLayout(null);
    this.getContentPane().add(panel0);
    

  JLabel L1 = new JLabel(new ImageIcon("arit2.jpeg"));
    L1.setBounds(-15, 50, 256, 30);
    panel0.add(L1);
    
    
    
    JLabel L2 = new JLabel(new ImageIcon("alge.jpeg"));
    L2.setBounds(70, 30, 512, 40);
    panel0.add(L2);
    
     JLabel L4 = new JLabel();
    L4.setText("Ecuaciones");
     L4.setFont(new Font("arial black", Font.BOLD,15));
    L4.setBounds(260, 80, 512, 30);
    panel0.add(L4);
    
      JLabel L5 = new JLabel();
       L5.setFont(new Font("arial black", Font.BOLD,15));
    L5.setText("Factorizacion");
    L5.setBounds(260, 140, 512, 190);
    panel0.add(L5);
    
         
    JLabel L6 = new JLabel(new ImageIcon("tri.jpeg"));
    L6.setBounds(430, 15, 256, 50);
    panel0.add(L6);
    
       JLabel L7 = new JLabel();
    L7.setText("Funciones Trigonometricas");
     L7.setFont(new Font("arial black", Font.BOLD,15));
    L7.setBounds(450, 80, 256, 13);
    panel0.add(L7);
    
    JLabel L8 = new JLabel();
    L8.setText("Angulos");
     L8.setFont(new Font("arial black", Font.BOLD,15));
    L8.setBounds(500, 240, 256, 20);
    panel0.add(L8);
    
    JLabel L9 = new JLabel(new ImageIcon("cal.jpeg"));
    L9.setBounds(680, 30, 256, 35);
    panel0.add(L9);
    
    JLabel L10 = new JLabel();
    L10.setText("Calculo Diferencial");
     L10.setFont(new Font("arial black", Font.BOLD,15));
    L10.setBounds(725, 80, 256, 13);
    panel0.add(L10);
    
    JLabel L11 = new JLabel();
    L11.setText("Calculo Integral");
         L11.setFont(new Font("arial black", Font.BOLD,15));
    L11.setBounds(725, 170, 256, 20);
    panel0.add(L11);
    
    JLabel L12 = new JLabel(new ImageIcon("li.jpeg"));
    L12.setBounds(950, 30, 256, 35);
    panel0.add(L12);
    
    JLabel L13 = new JLabel();
    L13.setText("Operaciones con Matrices");
        L13.setFont(new Font("arial black", Font.BOLD,15));
    L13.setBounds(950, 80, 256, 13);
    panel0.add(L13);
    
    JLabel L14 = new JLabel();
    L14.setText("Operaciones Basicas");
        L14.setFont(new Font("arial black", Font.BOLD,15));
    L14.setBounds(980, 250, 256, 13);
    panel0.add(L14);
    
    JLabel L15 = new JLabel(new ImageIcon("math.jpeg"));
        L15.setLocation(-280, 75);
        L15.setSize(800, 600);
        panel0.add(L15);
    
}
private void botones(){
    JButton b1 = new JButton("Calculadora");
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    b1.setLocation(50, 90);
    b1.setSize(130, 25);
    panel0.add(b1);
    
    JButton b2 = new JButton("Ecuacion Cuadratica");
    b2.setLocation(250, 120);
     b2.setBackground(Color.BLACK);
    b2.setForeground(Color.WHITE);
    b2.setSize(165, 25);
    panel0.add(b2);
    
    JButton b3 = new JButton("Sistema de"
            + " Ecuaciones");
     b3.setBackground(Color.BLACK);
    b3.setForeground(Color.WHITE);
    b3.setLocation(250, 160);
    b3.setSize(180, 25);
    panel0.add(b3);
    
    JButton b4 = new JButton("Binomio Cuadrado");
     b4.setBackground(Color.BLACK);
    b4.setForeground(Color.WHITE);
    b4.setLocation(250, 250);
    b4.setSize(165, 25);
    panel0.add(b4);
    
    JButton b5 = new JButton("Diferencia de Cuadrados");
     b5.setBackground(Color.BLACK);
    b5.setForeground(Color.WHITE);
    b5.setLocation(250, 290);
    b5.setSize(185, 25);
    panel0.add(b5);
    
    JButton b6 = new JButton("Suma y Diferencia de Cubos");
     b6.setBackground(Color.BLACK);
    b6.setForeground(Color.WHITE);
    b6.setLocation(250, 340);
    b6.setSize(200, 25);
    panel0.add(b6);
    
    JButton b7 = new JButton("Seno");
     b7.setBackground(Color.BLACK);
    b7.setForeground(Color.WHITE);
    b7.setLocation(500, 120);
    b7.setSize(100, 25);
    panel0.add(b7);
    
    JButton b8 = new JButton("Coseno");
     b8.setBackground(Color.BLACK);
    b8.setForeground(Color.WHITE);
    b8.setLocation(500, 160);
    b8.setSize(100, 25);
    panel0.add(b8);
    
    JButton b9 = new JButton("Tangente");
     b9.setBackground(Color.BLACK);
    b9.setForeground(Color.WHITE);
    b9.setLocation(500, 200);
    b9.setSize(100, 25);
    panel0.add(b9);
    
    JButton b10 = new JButton("Longitud de Arco");
     b10.setBackground(Color.BLACK);
    b10.setForeground(Color.WHITE);
    b10.setLocation(500, 270);
    b10.setSize(150, 25);
    panel0.add(b10);
     
    JButton b11 = new JButton("Casos de Derivacion");
     b11.setBackground(Color.BLACK);
    b11.setForeground(Color.WHITE);
    b11.setLocation(725, 120);
    b11.setSize(150, 25);
    panel0.add(b11);
    
    JButton b12 = new JButton("Casos de Integracion");
     b12.setBackground(Color.BLACK);
    b12.setForeground(Color.WHITE);
    b12.setLocation(725, 195);
    b12.setSize(160, 25);
    panel0.add(b12);
    
    JButton b13 = new JButton("Sumas de Riemann");
     b13.setBackground(Color.BLACK);
    b13.setForeground(Color.WHITE);
    b13.setLocation(725, 225);
    b13.setSize(150, 25);
    panel0.add(b13);
    
    JButton b14 = new JButton("Favoritos");
     b14.setBackground(Color.BLACK);
    b14.setForeground(Color.WHITE);
    b14.setLocation(775, 450);
    b14.setSize(150, 25);
    panel0.add(b14);
    
    JButton b15 = new JButton("Transpuesta");
     b15.setBackground(Color.BLACK);
    b15.setForeground(Color.WHITE);
    b15.setLocation(1000, 120);
    b15.setSize(150, 25);
    panel0.add(b15);
    
    JButton b16 = new JButton("Inversa");
     b16.setBackground(Color.BLACK);
    b16.setForeground(Color.WHITE);
    b16.setLocation(1000, 160);
    b16.setSize(150, 25);
    panel0.add(b16);
    
    JButton b17 = new JButton("Determinante");
     b17.setBackground(Color.BLACK);
    b17.setForeground(Color.WHITE);
    b17.setLocation(1000, 200);
    b17.setSize(150, 25);
    panel0.add(b17);
    
    JButton b18 = new JButton("Operaciones entre Matrices");
     b18.setBackground(Color.BLACK);
    b18.setForeground(Color.WHITE);
    b18.setLocation(975, 300);
    b18.setSize(200, 25);
    panel0.add(b18);
    
    JButton b19 = new JButton("Historial");
     b19.setBackground(Color.BLACK);
    b19.setForeground(Color.WHITE);
    b19.setLocation(1000, 450);
    b19.setSize(150, 25);
    panel0.add(b19);
   
    ActionListener a1 = new ActionListener(){
        public void actionPerformed (){
        }
        @Override
        public void actionPerformed(ActionEvent e) {
         
            CalculadoraArit venNueva = new CalculadoraArit();
            venNueva.setVisible(true);
            
        }
    };  
    
        b1.addActionListener(a1);
        
        
        
        
        ActionListener a2 = new ActionListener(){
        public void actionPerformed2(){
           
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            EcuacionCuadra ven1Nueva = new EcuacionCuadra();
            ven1Nueva.setVisible(true); 
        }
            
        };
        b2.addActionListener(a2);
        
        
        ActionListener a3 = new ActionListener(){
        public void actionPerformed3(){
            
        }
            
        @Override
        public void actionPerformed(ActionEvent e) {
            
            Binomio ven2Nueva = new Binomio();
            ven2Nueva.setVisible(true);
        }
            
        };
        b4.addActionListener(a3);
        
        ActionListener a4 = new ActionListener(){
            public void actionPerformed4(){
                
            }
        @Override
        public void actionPerformed(ActionEvent e) {
            DiferenciaCua ven3Nueva = new DiferenciaCua();
            ven3Nueva.setVisible(true);
            
            
        }
            
        };
        b5.addActionListener(a4);
        
        ActionListener a5 = new ActionListener(){
        public void actionPerformed5(){
            
        }
            
        @Override
        public void actionPerformed(ActionEvent e) {
            SumaYDife ven4Nueva = new SumaYDife();
            ven4Nueva.setVisible(true);
        }
            
        };
       b6.addActionListener(a5);
       
       ActionListener a6 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Seno ven5Nueva = new Seno();
            ven5Nueva.setVisible(true);
        }
           
       };
       b7.addActionListener(a6);
       
        ActionListener a7 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Coseno ven6Nueva = new Coseno();
            ven6Nueva.setVisible(true);
        }
           
       };
       b8.addActionListener(a7);
       
       
          ActionListener a26 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             SistemaEcuaciones ven6Nueva = new SistemaEcuaciones();
            ven6Nueva.setVisible(true);
        }
           
       };
       b3.addActionListener(a26);
       
       
 
       
        ActionListener a9 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
                  
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Tangente ven20Nueva = new Tangente();
            ven20Nueva.setVisible(true);
        }
           
       };
       b9.addActionListener(a9);
       
       
       ActionListener a10 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Angulos ven8Nueva = new Angulos();
            ven8Nueva.setVisible(true);
        }
           
       };
       b10.addActionListener(a10);
       
       
        ActionListener a11 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Derivadas ven9Nueva = new Derivadas();
            ven9Nueva.setVisible(true);
        }
           
       };
       b11.addActionListener(a11);
       
       
        ActionListener a12 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Integrales ven10Nueva = new Integrales();
            ven10Nueva.setVisible(true);
        }
           
       };
       b12.addActionListener(a12);
       
        ActionListener a13 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Historial ven11Nueva = new Historial();
            ven11Nueva.setVisible(true);
        }
           
       };
       b19.addActionListener(a13);
       
       
          ActionListener a28 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Rieman ven11Nueva = new Rieman();
            ven11Nueva.setVisible(true);
        }
           
       };
       b13.addActionListener(a28);
       
       
       
        ActionListener a23 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             MTranspuesta ven5Nueva = new MTranspuesta();
            ven5Nueva.setVisible(true);
        }
           
       };
       b15.addActionListener(a23);
       
       
        ActionListener a24 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             MInversa ven5Nueva = new MInversa();
            ven5Nueva.setVisible(true);
        }
           
       };
       b16.addActionListener(a24);
       
           
        ActionListener a30 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
           OperacionesM   ven5Nueva = new OperacionesM();
            ven5Nueva.setVisible(true);
        }
           
       };
       b18.addActionListener(a30);
       
       
       
       
       
             ActionListener a25 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             MDeterminante ven5Nueva = new MDeterminante();
            ven5Nueva.setVisible(true);
        }
           
       };
       b17.addActionListener(a25);
       
       
       
        ActionListener a27 = new ActionListener(){
       public void actionPerformed6(){
           
           
           
       }
           
        @Override
        public void actionPerformed(ActionEvent e) {
            
             Favoritos ven6Nueva = new Favoritos();
            ven6Nueva.setVisible(true);
        }
           
       };
       b14.addActionListener(a27);
       
}
}

