/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

import javax.swing.JTextField;



/**
 *
 * @author Carlos Rangel
 */
public class CALCULOSMATH {

    static float sin(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static float sin(JTextField text5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    int proporcion;
    
    

  public int potencia(int base, int exponente){
        int resultado;
        if(exponente==0){
         resultado=1;       
        }
        else{
            resultado = base*potencia(base, exponente-1);
        }return resultado;
        
        
    }
  
  public static double raiz (double numero1){
      double numero = numero1;
      for(int i=0; i<800; i++){
          numero = (numero + numero1/numero)/2;
      }
      return numero;
      
      
  }
  public class constantes{
      final double pi = 3.14;
      final double radianes = 0.01744444444;
      
      
  }
    public static double raizn (double s){
        double x = s;
      for(int i=0; i<800; i++){
          x = (x + s/x)/3;
      }
      return x;
      
      
  }
    public static int Factorial(int n){
        int factorial =1;
        for(int i=1; i<=n; i++){
            factorial = factorial*i;
        }return factorial;
    }
   public static double sin(){
       
       float dividendo =1;
        float signo = 0;
        float n =10;
        float result=0;
        double x = 45;
        float divisor =1;
                int i;
        for(i=0;i<=n;i++){
            dividendo=1;
                    int j;
            for(j=0;j<2*i+1; j++){
                dividendo = (float) (dividendo*x);
                
                
            }
            divisor =1;
            for(j=1;j<=2*i+1; j++){
            divisor = divisor*j;
            
        }
            if(i%2==0){
                signo = 1;
            } else{
                signo =-1;
            }
        } result = (dividendo/ divisor) * signo;
        return 0;
    }
   
  
              
          }
       
   


      
  
  
    
  
    
    

    

