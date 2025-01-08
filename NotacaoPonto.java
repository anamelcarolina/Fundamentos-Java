/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;
public class NotacaoPonto {
    public static void main(String[] args) {
        
        // Notação ponto é uma maneira de dizer ao programa o que voce quer que um objeto faça ou qual atributo deseja acessar
    
        String s = "Bom dia X";
        // replace = ele faz uma busca por um texto específico (ou um caractere) e o substitui por outro.
        s = s.replace("X", "Senhora"); //Substitui 'x' por 'Senhora' --> A saida vai ser "Bom dia Senhora 
        s = s.toUpperCase(); // tranforma em letra maiuscula 
        System.out.println(s);
        
        // Tambem podemos fazer dessa forma:
        String x = "Guilherme". toUpperCase();
        System.out.println(x);
        
        
        // Tambem temos:
        
        String y = "Bom dia X"
                .replace("X", "Gui")
                .toUpperCase();
        System.out.println(y);
   
    }
}
