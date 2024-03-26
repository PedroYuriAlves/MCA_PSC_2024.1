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
public class AulaLacos {

    public static void main(String[] args) {

        boolean vivo = true;

//do While
        do {

        } while (vivo);
//While



        int contador = 0;
        while (contador < 10) {
            System.out.println("Repete " + contador);
            contador++;
        }

        // FOR
        for (int i = 24; i < 100; i++) {
            System.out.println("index: " + i);
        }

        /*

        int idade = 0;
        while (vivo) {
            System.out.println("Idade Atual: " + idade);
            System.out.println("Acordando...");
            System.out.println("Tomando café...");
            System.out.println("Indo ao banheiro...");
            System.out.println("Estudando...");
            System.out.println("Trabalhando...");
            System.out.println("Jantando...");
            System.out.println("Dormindo...");

            System.out.println("");

            idade++;

            if (idade >= 100) {
                vivo = false;
            } else {
            }
        }

        System.out.println("No ceu tem pao? E morreu...");
         */
        //Exercicios do troco de moedas reformulado;
        int valorTroco = 1554;

        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int moeda1 = 0;

        while (valorTroco > 0) {

            if (valorTroco >= 100) {
                nota100++;
                valorTroco = valorTroco - 100;
            } else if (valorTroco >= 50) {
                nota50++;
                valorTroco = valorTroco - 50;
            } else if (valorTroco >= 20) {
                nota20++;
                valorTroco -= 20;
            } else if (valorTroco >= 10) {
                nota10++;
                valorTroco -= 10;
            } else if (valorTroco >= 5) {
                nota5++;
                valorTroco -= 5;
            } else if (valorTroco >= 2) {
                nota2++;
                valorTroco -= 2;
            } else if (valorTroco >= 1) {
                moeda1++;
                valorTroco -= 1;
            }
        }
        // Saida
        String resposta = "Notas de 100: " + nota100;
        resposta = resposta + "\nNotas de 50: " + nota50;
        resposta += "\nNotas de 20: " + nota20;
        resposta += "\nNotas de 10: " + nota10;
        resposta += "\nNotas de 5: " + nota5;
        resposta += "\nNotas de 2: " + nota2;
        resposta += "\nMoedas de 1: " + moeda1;

        JOptionPane.showMessageDialog(null, resposta);

    }
}
