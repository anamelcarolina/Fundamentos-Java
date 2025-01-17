/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;
public class ConversaoNumeroString {
    
    public static void main (String[] args){
    
         //Destring para numero
    Integer num1 = 10000;
    System.out.println(num1.toString(). length());//Conta quantos caracteres tem
    
       //De numero para string
    int num2 = 100000;
    System.out.println(Integer.toString(num2));// Tambem posso adc o length
    
    
    /// Notação ponto
    
    Double a = 2.4;
    System.out.println(a.doubleValue());//Converte para double 
    
    
    Integer b = 200;
    byte resultado = b.byteValue();// Converte para byte
    System.out.println(resultado); // Saída: -56 
    
    Double g = 10.5;
    int rg = g.intValue();//Converte para int
    System.out.println(rg);//Saida: 10
    
    Integer h = 199;
    long rh = h.longValue();//Converte para long
    System.out.println(rh);//Saida 199
    
    Integer j = 200;
    short rj = j.shortValue();//Converte para short
    System.out.println(rj);//Saida: 200
    
    
    Integer c = 10;
    Integer d = 20;
    System.out.println(c.compareTo(d));// A saida vai ser -1, isso quer dizer que c é menor do que d
    System.out.println(d.compareTo(c));// A saida vai ser 1, isso quer dizer que d é maior do que c
    
    
    Integer e = 10;
    Integer f = 10;
    System.out.println(e.equals(f));// Compara se os dois numeros são iguais 
    }
    
}
