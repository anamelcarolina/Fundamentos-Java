package com.mycompany.fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    
    public static void main(String [] args){
        String valor1 = JOptionPane.showInputDialog("Digite a primeira nota: ");//JOptionPane: Cria a janela visual   showInputDialog:  exibe uma caixinha de dialogo 
        String valor2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        
        double numero1 = Double.parseDouble(valor1);// Precisamos converter as strings para outro tipo, pois quando usamos o metodo JOptionPane.showInputDialog ele sempre retorna o que o usuario digitou como uma String (um texto). Mesmo que vc digite numero na caixa, o programa ainda entende aquilo como texto.
       double numero2 = Double.parseDouble(valor2);
       double soma = numero1 + numero2;
       System.out.println("A soma e: "+ soma);// Somei 2 + 2, saida: 4.0



        
    }

/* Fiz um exemplo com as minhas notas da faculdade

public static void main(String [] args){
    String valor1= JOptionPane.showInputDialog("Digite a primeira nota: "); //Digitei 4.43
    String valor2= JOptionPane.showInputDialog("Digite a segunda nota: ");//Digitei 4.33
    String valor3= JOptionPane.showInputDialog("Digite a  nota do PPD: ");//Digitei 1.00
    String valor4= JOptionPane.showInputDialog("Digite a  nota do Educa: ");//Digitei 0.50
    
    double numero1= Double.parseDouble(valor1);
    double numero2= Double.parseDouble(valor2);
    double numero3= Double.parseDouble(valor3);
    double numero4= Double.parseDouble(valor4);
    double soma= numero1 + numero2 +numero3 +numero4;
    System.out.print("A soma das quatro notas e: ");// Saida 10,26
    System.out.println(+soma);
    System.out.print("A media das quatro notas e: ");// Saida 5.13
    System.out.println(+soma /2);
    
        
    }
*/
    
}
