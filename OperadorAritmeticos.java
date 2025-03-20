/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

public class OperadoresAritmeticos {
    public static void main (String[] args){
    System.out.println(2 + 3);
    
    var x = 34.56;
    double y = 2.2;
    
    System.out.println(x + y);// Adc
    System.out.println(x - y);// Menos
    System.out.println(x * y);//Multiplicação
    System.out.println(x / y);//Divisão
    
    /*  Saida:
    36.760000000000005
    32.36
    76.03200000000001
    15.709090909090909
    */
    
    int a = 8;
    int b = 3;
    
    System.out.println(a + b);// Adc
    System.out.println(a - b);// Menos
    System.out.println(a * b);//Multiplicação
    System.out.println(a / b);//Divisão
    System.out.println(a / (double) b);// Converter para double
    System.out.println(a % b );// Resto da divisão. Operador Modulo
    
    /*  Saida:
    11
    5
    24
    2
    2.6666666666666665
    2
    */
    
    System.out.println(x + y - a * b);// Saida: 12.760000000000005

        // Para fazer uma potencia (  2³ ) é usada uma funcionalidade Math.pow 
    
    int c = 3 * 4 - 10;
    int d = (int) Math.pow(c, 3);
    System.out.println(d);
    }
    
}
