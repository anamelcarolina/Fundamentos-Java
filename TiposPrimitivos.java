/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

/*Em java, os tipos primitivos servem para armazenar valores simples, como numeros, caracteres e valores logicos 
    
           Numeros inteiros

Use byte e short quando o valor for pequeno
*Byte armarzena de -128 a 127
*Short armazena de -32.768 a 32.767

Mais comum Int
*int armazena -2 bilhoes a 2 bilhoes

Use Long para valores muito grandes. Use a letra L no final é obrigatoria
*Long 
            Numeros decimais 


*float: quando não precisam de uma padrão, armazena entre 6-7 digitos
*Double: para numeros mais precisos, armazena 15 digitos


            Caracteres
Usado para armazenar um unico caractere
*char

            Boleano
Usado para representar valores lógicos
*Boolean: valores true ou false

*/

public class TiposPrimitivos {
    public static void main(String[] args){
             //Informações do funcionario
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 2_134_845_223;
                
        float salario = 11_445.44F;
        double vendasAcumulativas = 2_991_797_103.01;
        
        char status = 'a'; //ativo
        boolean estaDeFerias = false;
        
             //Calculo
        System.out.println("Quantos dias ele trabalhou? " + anosDeEmpresa * 365 + " dias");
        
        System.out.println("Quantas viagens ele fez? " + numeroDeVoos / 2);
        
        System.out.println("Quantos pontos por real ele fez ?" + pontosAcumulados / vendasAcumulativas );
        
        System.out.println(" O id: " + id + " ganha: " + salario);
        
        System.out.println(" O id " + id + " esta de ferias? " + estaDeFerias);
        
        System.out.println("Status: " + status);
        
    }
}
