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
public class CalculadoraArit extends JFrame {
    public JPanel panel1;
     public float primernumero;
     public float segundonumero;
     public String operador;
     public String contenido;
     Double resultado;
     Double numero;
     Double raiz;
     Double factorial;
     public float base;
     public float exponente;
     private boolean punto=true;
     CALCULOSMATH potencia = new CALCULOSMATH();
     
     
    public CalculadoraArit(){
        super("CALCULADORA");
        this.setSize(600, 600);
        this.setLocation(425, 75);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(4,176,129));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
        panel1 = new JPanel();
        panel1.setBackground(new Color(4,176,129));
        panel1.setLocation(10, 10);
        panel1.setSize(565, 550);
        panel1.setLayout(null); 
   
    
 
        
         
        JTextField L1 = new JTextField("");
        L1.setHorizontalAlignment(SwingConstants.RIGHT);
        L1.setLocation(30, 10);
        L1.setSize(500, 70);
        panel1.add(L1);
        this.getContentPane().add(panel1);
     
    
    JButton b1 = new JButton("7");
    b1.setBackground(new Color(255,102,0));
    b1.setFont(new Font("Lucida Sans", Font.BOLD,15));
    b1.setLocation(50, 110);
    b1.setSize(65, 65);
    panel1.add(b1);
    
        JButton b2 = new JButton("4");
         b2.setBackground(new Color(255,102,0));
    b2.setFont(new Font("Lucida Sans", Font.BOLD,15));
    b2.setLocation(50, 200);
    b2.setSize(65, 65);
    panel1.add(b2);
    
      JButton b3 = new JButton("1");
     b3.setBackground(new Color(255,102,0));
    b3.setFont(new Font("Lucida Sans", Font.BOLD,15));
      b3.setLocation(50, 290);
    b3.setSize(65, 65);
    panel1.add(b3);
    
      JButton b4 = new JButton("n√");
       b4.setBackground(new Color(255,102,0));
    b4.setFont(new Font("Lucida Sans", Font.BOLD,15));
    b4.setLocation(50, 380);
    b4.setSize(65, 65);
    panel1.add(b4);
    
    JButton b5 = new JButton("^");
     b5.setBackground(new Color(255,102,0));
    b5.setFont(new Font("Lucida Sans", Font.BOLD,15));
    b5.setLocation(50, 470);
    b5.setSize(65, 65);
    panel1.add(b5);
    
      JButton b6 = new JButton("8");
     b6.setBackground(new Color(255,102,0));
    b6.setFont(new Font("Lucida Sans", Font.BOLD,15));
    b6.setLocation(140, 110);
    b6.setSize(65, 65);
    panel1.add(b6);
    
      JButton b7 = new JButton("5");
     b7.setBackground(new Color(255,102,0));
    b7.setFont(new Font("Lucida Sans", Font.BOLD,15));
      b7.setLocation(140, 200);
    b7.setSize(65, 65);
    panel1.add(b7);
    
      JButton b8 = new JButton("2");
     b8.setBackground(new Color(255,102,0));
    b8.setFont(new Font("Lucida Sans", Font.BOLD,15));
      b8.setLocation(140, 290);
    b8.setSize(65, 65);
    panel1.add(b8);
    
      JButton b9 = new JButton("0");
     b9.setBackground(new Color(255,102,0));
    b9.setFont(new Font("Lucida Sans", Font.BOLD,15));
      b9.setLocation(140, 380);
    b9.setSize(65, 65);
    panel1.add(b9);
    
    JButton b10 = new JButton("Raiz");
     b10.setBackground(new Color(255,102,0));
    b10.setFont(new Font("Lucida Sans", Font.BOLD,12));
    b10.setLocation(140, 470);
    b10.setSize(65, 65);
    panel1.add(b10);
    
     JButton b11 = new JButton("9");
     b11.setBackground(new Color(255,102,0));
    b11.setFont(new Font("Lucida Sans", Font.BOLD,15));
     b11.setLocation(230, 110);
    b11.setSize(65, 65);
    panel1.add(b11);
    
      JButton b12 = new JButton("6");
     b12.setBackground(new Color(255,102,0));
    b12.setFont(new Font("Lucida Sans", Font.BOLD,15));
      b12.setLocation(230, 200);
    b12.setSize(65, 65);
    panel1.add(b12);
    
      JButton b13 = new JButton("3");
     b13.setBackground(new Color(255,102,0));
    b13.setFont(new Font("Lucida Sans", Font.BOLD,15));
      b13.setLocation(230, 290);
    b13.setSize(65, 65);
    panel1.add(b13);
    
      JButton b14 = new JButton("(-)");
     b14.setBackground(new Color(255,102,0));
    b14.setFont(new Font("Lucida Sans", Font.BOLD,15));
      b14.setLocation(230, 380);
    b14.setSize(65, 65);
    panel1.add(b14);
    
    JButton b15 = new JButton("1/x");
     b15.setBackground(new Color(255,102,0));
    b15.setFont(new Font("Lucida Sans", Font.BOLD,15));
    b15.setLocation(230, 470);
    b15.setSize(65, 65);
    panel1.add(b15);
    
    JButton b16 = new JButton("+");
     b16.setBackground(new Color(255,102,0));
    b16.setFont(new Font("Lucida Sans", Font.BOLD,15));
    b16.setLocation(320, 110);
    b16.setSize(65, 65);
    panel1.add(b16);
    
      JButton b17 = new JButton("-");
     b17.setBackground(new Color(255,102,0));
    b17.setFont(new Font("Lucida Sans", Font.BOLD,15));
      b17.setLocation (320, 200);
    b17.setSize(65, 65);
    panel1.add(b17);
    
      JButton b18 = new JButton("*");
     b18.setBackground(new Color(255,102,0));
    b18.setFont(new Font("Lucida Sans", Font.BOLD,15));
      b18.setLocation(320, 290);
    b18.setSize(65, 65);
    panel1.add(b18);
    
      JButton b19 = new JButton("/");
     b19.setBackground(new Color(255,102,0));
    b19.setFont(new Font("Lucida Sans", Font.BOLD,15));
      b19.setLocation(320, 380);
    b19.setSize(65, 65);
    panel1.add(b19);
    
    JButton b20 = new JButton("!");
     b20.setBackground(new Color(255,102,0));
    b20.setFont(new Font("Lucida Sans", Font.BOLD,15));
    b20.setLocation(320, 470);
    b20.setSize(65, 65);
    panel1.add(b20);
    
    JButton b21 = new JButton("Calcular");
     b21.setBackground(new Color(255,102,0));
    b21.setFont(new Font("Lucida Sans", Font.BOLD,12));
    b21.setLocation(420, 110);
    b21.setSize(90, 30);
    panel1.add(b21);
    
    JButton b22 = new JButton("C");
     b22.setBackground(new Color(255,102,0));
    b22.setFont(new Font("Lucida Sans", Font.BOLD,15));
    b22.setLocation(420, 250);
    b22.setSize(90, 30);
    panel1.add(b22);
    
    JButton b23 = new JButton("Guardar Resultado");
     b23.setBackground(new Color(255,102,0));
    b23.setFont(new Font("Lucida Sans", Font.BOLD,11));
    b23.setLocation(410, 450);
    b23.setSize(150, 30);
    panel1.add(b23);

    
    JButton b25 = new JButton("<--");
     b25.setBackground(new Color(255,102,0));
    b25.setFont(new Font("Lucida Sans", Font.BOLD,15));
    b25.setLocation(420, 170);
    b25.setSize(90, 30);
    panel1.add(b25);
    
    
    
    
    
    
    
    
    ActionListener a1 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText(L1.getText()+"7");
               L1.setFont(new Font("Lucida Sans", Font.BOLD,30));
            }
        
    };b1.addActionListener(a1);
    
    ActionListener a2 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText(L1.getText()+"4");
                L1.setFont(new Font("Lucida Sans", Font.BOLD,30));
            }
        
    };b2.addActionListener(a2);
    
    ActionListener a3 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText(L1.getText()+"1");
                L1.setFont(new Font("Lucida Sans", Font.BOLD,30));
            }
        
    };b3.addActionListener(a3);
    
    
    ActionListener a4 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText(L1.getText()+"8");
                L1.setFont(new Font("Lucida Sans", Font.BOLD,30));
            }
        
    };b6.addActionListener(a4);
    
    
     ActionListener a5 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText(L1.getText()+"5");
                L1.setFont(new Font("Lucida Sans", Font.BOLD,30));
            }
        
    };b7.addActionListener(a5);
    
    ActionListener a6 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText(L1.getText()+"2");
                L1.setFont(new Font("Lucida Sans", Font.BOLD,30));
            }
        
    };b8.addActionListener(a6);
    
    ActionListener a7 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText(L1.getText()+"0");
                L1.setFont(new Font("Lucida Sans", Font.BOLD,30));
            }
        
    };b9.addActionListener(a7);
    
    
    ActionListener a8 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText(L1.getText()+"9");
                L1.setFont(new Font("Lucida Sans", Font.BOLD,30));
            }
        
    };b11.addActionListener(a8);
    
    ActionListener a9 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText(L1.getText()+"6");
                L1.setFont(new Font("Lucida Sans", Font.BOLD,30));
            }
        
    };b12.addActionListener(a9);
    
       ActionListener a10 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText(L1.getText()+"3");
                L1.setFont(new Font("Lucida Sans", Font.BOLD,30));
            }
        
    };b13.addActionListener(a10);
    
      ActionListener a11 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
               
              primernumero=Float.parseFloat(L1.getText());
                       operador="(-)";
      
               
                
            }
        
    };b14.addActionListener(a11);
    
    ActionListener a12;
        a12 = new ActionListener(){
            public void actionperformed(){
                
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                segundonumero=Float.parseFloat(L1.getText());
                
                switch(operador){
            case "+":L1.setText(Float.toString(primernumero+segundonumero)); break;
            case "-":L1.setText(Float.toString(primernumero-segundonumero)); break;
            case "*":L1.setText(Float.toString(primernumero*segundonumero)); break;
            case "/":L1.setText(Float.toString(primernumero/segundonumero)); break;
            case "^": L1.setText(Float.toString(potencia.potencia((int) primernumero, (int)segundonumero))); break;
            case"√": L1.setText(Float.toString((float) CALCULOSMATH.raiz((int) primernumero))); break;
            case"n√":L1.setText(Float.toString((float) CALCULOSMATH.raizn((int) primernumero))); break;
            case"!":L1.setText(Float.toString((float) CALCULOSMATH.Factorial((int) primernumero))); break;
            case"(-)":L1.setText(Float.toString(primernumero*(-1)));
                        
                }
               
            }
        };
b21.addActionListener(a12);
    
    ActionListener a13 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                 primernumero=Float.parseFloat(L1.getText());
                       operador="-";
                       L1.setText("");
            }
        
    };b17.addActionListener(a13);
   
    
    ActionListener a14 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
              primernumero=Float.parseFloat(L1.getText());
                       operador="*";
                       L1.setText("");
            }
        
    };b18.addActionListener(a14);
    
    
     ActionListener a15 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                primernumero=Float.parseFloat(L1.getText());
                       operador="/";
                       L1.setText("");
            }
        
    };b19.addActionListener(a15);
    
     ActionListener a16 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
               primernumero=Float.parseFloat(L1.getText());
                       operador="^";
                        L1.setText("");
                    
                       
            }
        
    };b5.addActionListener(a16);
    
     ActionListener a17 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
              primernumero=Float.parseFloat(L1.getText());
                       operador="√";
                    
                

            }
        
    };b10.addActionListener(a17);
    
     ActionListener a18 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
               
                  primernumero=Float.parseFloat(L1.getText());
                       operador="!";
                          
                  
                  
     
               
                
            }
        
    };b20.addActionListener(a18);
    

       
       
       
       
       ActionListener a20 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.setText("");
            }
        
    };b22.addActionListener(a20);
    
     ActionListener a21 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                int length= L1.getText().length();
                int number= L1.getText().length() -1;
                String store;
                if(length > 0)
                {
                    StringBuilder back = new StringBuilder(L1.getText());
                    back.deleteCharAt(number);
                    store=back.toString();
                    L1.setText(store);
                }
                
                
                
                
            }
        
    };b25.addActionListener(a21);
    
    ActionListener a23 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
              String cadena;
              Double numero;
              cadena=L1.getText();
              if (cadena.length()>0){
                  numero=1/(Double.parseDouble(cadena));
                  L1.setText(numero.toString());
              }
            }
        
    };b15.addActionListener(a23);
    
    
    
    
    
    
    
    
    
    ActionListener a22 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                       primernumero=Float.parseFloat(L1.getText());
                       operador="+";
                       L1.setText(""); 
              
                
                
            }
        
    };b16.addActionListener(a22);
    
         ActionListener a25 = new ActionListener(){
        public void actionperformed(){
            
        }
            @Override
            public void actionPerformed(ActionEvent e) {
                 primernumero=Float.parseFloat(L1.getText());
                       operador="n√";
                      
            }
        
    };b4.addActionListener(a25);
           
    }
    
 
   
       
   
            
    }
    
    
     
     
     
     
    

   
    

