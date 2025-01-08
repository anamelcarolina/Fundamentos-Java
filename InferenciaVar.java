/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

public class InterferenciaVar {
    public static void main (String[] args) {
        
    //Em vez de declarar explicitamente o tipo de uma variável (ex: Double), você usa Var. O compilador deduz o tipo a partir do valor atribuído.
        double a = 4.5;
        System.out.println(a);
                              
        var b = 6.9;
        System.out.println(b); //O compilador entende que o tipo é double 
        
        a = 7.0;
        System.out.println(a);
        
        var c = "Carol";//O compilador entende que o tipo é string
        System.out.println(c);
        
    //No java eu tambem posso fazer dessa maneira:
        double d;//Variavel foi declarada
        d = 2.4;//Variavel foi inicializada
        System.out.println(d);//Usada
           
}         
}
