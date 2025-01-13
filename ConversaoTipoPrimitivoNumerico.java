/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    
    /* A converçao de tipos primitivos numericos é quando voce transforma um valor de um tipo (ex, int), em um outro tipo (ex,double), ou seja, transformar de int para double.
    Tipos de conversão:
    
    * Implicita: Quando um menor é convertido para um maior, ex: de int para double
         --> Double tem mais espaço na memoria do que o int, então não a risco de perder dados 
    
    * Explicita: Quando um tipo maior é convertido para um tipo menor, ex: de double para int
         --> Pode haver a perca de dados 
    
    */
    
    public static void main (String[] args){
        
    // Quero transformar de double para float. Quero usar o numero 2.4
           //double a = 2.4
      
     float b = (float) 2.4;// eplicita Cast
     System.out.println(b);// saida: 2.4
     
     double c = 2.3;
     int d = (int) c;// explicita Cast
     System.out.println(d);// saida; 2
     
     int g = 340;
     byte h = (byte) g;// explicita Cast
     System.out.println(h);// saida: 84
     
     
     double k = (double) 125;
     System.out.println(k);// saida 125.0
     
     byte j = 126;
     double l = (double) j;// Cast
     System.out.println(l);// saida 126.0
     
     double a = 1;
     System.out.println(a);// saida 1.0
      
    }
      
}
