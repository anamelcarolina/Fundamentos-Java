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

/* public static void main(String [] args){
    String valor3 = JOptionPane.showInputDialog("Digite um numero: ");
    String valor4 = JOptionPane.showInputDialog("Digite outro numero: ");
    
    int numero1 = Integer.parseInt(valor3);
    int numero2 = Integer.parseInt(valor4);
    System.out.print("A soma e: ");
    System.out.println(numero1 + numero2);
    int media= numero1 + numero2;
    System.out.print("A media e: "); //Saida 8
    System.out.println(+media / 2); //Saida 9
        
    }
*/
    
}
