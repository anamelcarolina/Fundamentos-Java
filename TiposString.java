/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

public class TiposString {
    //String é um objeto imutado 
    public static  void main (String[] args) {
    System.out.println("Olá pessoal".charAt(2)); //retorna o caractere na posição indicada pelo indice, começando pelo 0. A saida vai ser 'á'
    
    String s = "Boa tarde";
    System.out.println(s.concat("!!!")); //junta a string original com outra string
    System.out.println(s + "!!!");// Faz a mesma coisa mais é mais comum de se usar
    
    System.out.println(s.startsWith("Boa")); // Verifica  se a string começa com o texto especifico. Saida : True ,pois a palavra 'Boa tarde' comeca com 'Boa'
    System.out.println(s.toLowerCase().startsWith("boa")); // Transforma o texto em minusculo e verifica se a palavra 'Boa tarde' começa com 'boa'. Resultado: True ,pois a palavra está em minusculo e comaça com 'boa' 
    System.out.println(s.toUpperCase().endsWith("TARDE")); // Transforma o texto em maiuscula e verifica se a ultima palavra de 'Boa taede' termina com 'TARDE'. Resultado: True ,pois a palavra está em maiusculo e termina com 'TARDE' 
    
    System.out.println(s.length());// Conta o numero de caracteres (contando com o espeço). Reultado = 9
    
    System.out.println(s.equals("boa tarde"));// Compara as duas stringss. Resultado: False, pois a 'string s' começa com B maiusculo, aqui começa com o b minusculo
    System.out.println(s.toLowerCase().equals("boa tarde"));// Compara duas strings, considerando maiusculas e minusculas. Ou toda palavra tem que ser em maiuscula ou em minuscula pro redultado ser 'true'
    System.out.println(s.equalsIgnoreCase("boa tarde"));// Ignora se é maiscula ou minuscula 

        //Treino
    String g = "Guilherme de Carol";
    
    System.out.println (g.startsWith("Guilherme")); //true
    System.out.println(g.startsWith("gusmão")); //False
    System.out.println(g.startsWith("guilherme"));//False
    System.out.println(g.toUpperCase().startsWith("guilherme"));//False
    System.out.println(g.toUpperCase().startsWith("GUILHERME"));//true
    
    System.out.println(g.endsWith("Carol"));//True
    System.out.println(g.endsWith("Nepomuceno"));//False
    System.out.println(g.endsWith("carol"));//False
    System.out.println(g.toLowerCase().endsWith("Carol"));//False
    System.out.println(g.toLowerCase().endsWith("carol"));//True
    
    
   

  String a = "Ana Carolina";
    System.out.println(a.length()); // 12
    System.out.println(g.length()); // 18
    
 String ag = "Ana Gusmao";
    System.out.println(ag.length());//10
    
String b = "Hart";
     System.out.println(b.length());//4
     
  String f = "Famill";
  System.out.println(f.length()); //6
    
    }
}
