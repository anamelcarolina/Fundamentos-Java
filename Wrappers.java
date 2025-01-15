/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;
/*                                                                      Objeto vs Primitivos

*Tipos Primitivos: int, double, boolean, etc... são dados simples. Voce não pode pedir para fazer algo (metodos) como: "Me mostre quantos digitos voce tem" ou "converta-se para texto"

*Objetos: tem metodos, o que significa que voce pode pedir para eles fazerem coisas especificias, igual eu citei lá em cima. Os Wrappers transformam os primitivos em objetos 

Exs: 
*Primitivos (int)

int numero = 10;
numero.toString(); --> transformar em texto
Resultado: Erro

*Wrapper (Integer)

Integer numero = 10;
Systm.out.println(numero.toString()); --> Saida 10

*/
public class Wrappers {
     public static void main (String[] args){
         
         //byte
         Byte b = 100;//Wrapper para o tipo byte
         System.out.println(b.byteValue());// Retorna o valor do ojeto Byte como um tipo primitivo byte
         
         Short s = 1000;//Wrapper para o tipo short
         System.out.println(s.toString()); //Transforma em texto, em String
         
         
         Integer i = Integer.parseInt("10000");// Converte para int
         System.out.println(i * 3);// Saida 30000
         
         
         Long l = 1000000L;// adc um L no final 
         System.out.println(l / 3);
         
         Boolean bo = Boolean.parseBoolean("true");// Convertando string por boolean
         System.out.println(bo);
         System.out.println(bo.toString(). toUpperCase());// boolean convertido para String  
         
         
         Float f = 123.10F;
         System.out.println(f);
    
        Double d = 1234.5678;
        System.out.println(d);
    
    }   
}

