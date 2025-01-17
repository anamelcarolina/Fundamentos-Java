package com.mycompany.fundamentos;

//scanner, tres string usando nextline, ultimos tres salarios, calcular a media dos ultimos tres salarios,  casas decimais com virgula ou ponto 

import java.util.Scanner;



public class DesafioConversao {
    public static void main (String[] args){
        Scanner entrada  = new Scanner (System.in);
        
        System.out.print("Digite seu primeiro salario: ");
        String salario1 = entrada.next().replace(",",".");
        
        System.out.print("/nDigite seu segundo salario: ");
        String salario2 = entrada.next().replace(",",".");
        
        System.out.print("/nDigite seu terceiro salario: ");
        String salario3 = entrada.next().replace(",",".");
        
        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);
        
        double media = (valor1 + valor2 + valor3) /3;
        System.out.println(" A media dos salarios é: " + media);
        
      entrada.close();    
    }
    
}
