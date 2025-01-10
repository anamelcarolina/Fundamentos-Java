/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

import java.util.Scanner;// Import do Scanner

public class Console {
   public static void main(String[] args){
         //Print vai imprir tudo na mesma linha. Saida "Bom dia!!"
         System.out.print("Bom");   
         System.out.print(" dia!!\n");// \n para pular linha
         
         //Println vai pular uma linha e vai imprimir 
         System.out.println("Eu gosto de chocolate");
         System.out.println("Receitas");
         
         System.out.printf("Salario: %.3f%n", 1234.5679);
         System.out.printf("Nome: %s%n", "Carol");
         //System.OUT: saida do sistema, é o que vai imprimir no computador (é a tela)
         
                                       //Scanner
                                       
     // O tipo:  o nome: recebe    valor:
         Scanner entrada = new Scanner(System.in);// System.in é uma "porta" que permite ao programa receber dados do teclado. Scanner Ajuda a "ler" o que a pessoa digitar no teclado
          
          System.out.print("Digite o seu nome: ");
          String nome = entrada.nextLine();// O programa espera o usuario digitar algo
          System.out.println("\nNome= " + nome);
          
          System.out.print("\nDigite seu sobrenome: ");
          String sobrenome = entrada.nextLine();
          System.out.println("Sobrenome" + sobrenome);
          System.out.println( "Seja bem vindo(a): " + nome + sobrenome );
        
         System.out.print("\nDigite a sua idade: ");
         int idade = entrada.nextInt();
         System.out.println("Confirmando, a sua idade e:  " + idade);
         
          entrada.close();// Para fechar o Scanner


 }

                            //Problema
      
      //Scanner teclado = new Scanner(System.in);
 
    //System.out.println("Qual a sua idade?");
    //int idade = teclado.nextInt();
      
    //System.out.println("Qual o seu nome?");
    //String nome = teclado.nextLine();
      
    //System.out.println("Qual o seu sobrenome?");
    //String sobrenome = teclado.nextLine();
 
    //teclado.close();

    // A saida desse codigo vai ser: 
   //-->   Qual a sua idade? 25
   // -->  Qual o seu nome? Qual o seu sobrenome? Silva


                     // Resoluçao do problema:

   //Scanner teclado = new Scanner(System.in);
        
        //System.out.print("Qual a sua idade? ");
        //int idade = teclado.nextInt();
        //teclado.nextLine(); //limpar o buffer
        //System.out.println("Sua idade e: " +idade);
        
        
        //System.out.print("Qual e o seu nome? ");
        //String nome = teclado.nextLine();
        //System.out.println("Seu nome e: " +nome);
        
        //System.out.print("Digite seu sobrenome: ");
        //String sobrenome = teclado.nextLine();
        //System.out.println("Seu sobrenome e: "+sobrenome);
   
   //teclado.close();

   // A saida desse codigo vai ser:
   // -->  Qual a sua idade? 20
  // --> Sua idade e: 20
 // --> Qual e o seu nome? João
// --> Seu nome e: João
// --> Digite seu sobrenome: de Andrade
// --> Seu sobrenome e: de Andrade
    

   
}    
