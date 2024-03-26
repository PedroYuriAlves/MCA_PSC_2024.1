/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA_04;

import javax.swing.JOptionPane;

/**
 *
 * @author SAMSUNG
 */
public class TERNARIO {

    public static void main(String[] args) {

        String menuEscolha = JOptionPane.showInputDialog("Menu Calculadora Ternario:"
                + "\n 1 - Soma"
                + "\n 2 - Subtração"
                + "\n 3 - Multiplicação"
                + "\n 4 - Divisão");

        String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor da subtração");
        String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor da subtração");
        double valor1 = Double.parseDouble(primeiroValor);
        double valor2 = Double.parseDouble(segundoValor);

        double resultado = (menuEscolha.equals("1") ? valor1 + valor2
                : (menuEscolha.equals("2") ? valor1 - valor2
                        : (menuEscolha.equals("3") ? valor1 * valor2
                                : (menuEscolha.equals("4") ? valor1 / valor2 : -1))));

        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);

        /*
        
        int valor = 3;
        
        String classificacao = (valor % 2 == 0 ? "Par" : "Impar");

        String c2 = "";
        if (valor % 2 == 0) {
            c2 = "Par";
        } else {
            c2 = "Impar"; 
        }
         */
    }
}
