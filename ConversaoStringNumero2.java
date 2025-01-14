package com.mycompany.fundamentos;
import javax.swing.JOptionPane;

public class Exemplos {
    public static void main(String[] args) {

                                      //EXEMPLO COM BYTE
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número (de -128 a 127):");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número (de -128 a 127):");

        byte numero1 = Byte.parseByte(valor1); // Converte para byte
        byte numero2 = Byte.parseByte(valor2); // Converte para byte

        byte soma = (byte) (numero1 + numero2); // Soma e converte o resultado para byte

        System.out.println("A soma é: " + soma);

                                  //EXEMPLO COM FLOAT
        String valor3 = JOptionPane.showInputDialog("Digite o primeiro número decimal:");
        String valor4 = JOptionPane.showInputDialog("Digite o segundo número decimal:");

        float numero3 = Float.parseFloat(valor3); // Converte para float
        float numero4 = Float.parseFloat(valor4); // Converte para float

        float soma = numero3 + numero4; // Soma os números

        System.out.println("A soma é: " + soma);


                                //EXEMPLO COM INT

        String valor5 = JOptionPane.showInputDialog("Digite um numero: ");
        String valor6 = JOptionPane.showInputDialog("Digite outro numero: ");
    
        int numero5 = Integer.parseInt(valor5);
        int numero6 = Integer.parseInt(valor6);
        System.out.print("A soma e: ");
        System.out.println(numero5 + numero6);
        int media= numero5 + numero6;
        System.out.print("A media e: "); 
        System.out.println(+media / 2); 

        
    }
}

