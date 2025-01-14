/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

public class Wrappers {
    public static void main (String[] args){
    //byte
    Byte b = 100;
    Short s = 1000;
    
    // Integer.parseInt(entrada.next());
    Integer i = 10000;
    Long l = 100000L;
    
    System.out.println(b.byteValue());
    System.out.println(s.toString());
    System.out.println(i * 3);
    System.out.println(l / 3);
      
    Float f = 123.10F;
    System.out.println(f);
    
    Double d = 1234.5678;
    System.out.println(d);
    
    Boolean bo = Boolean.parseBpplean("true");
    System.out.println(bo);
    System.out.println(bo.toString().toUpperCase());
    
    
    Character c = '#'; //char
    System.out.println(c + "...");
    }
    
}
