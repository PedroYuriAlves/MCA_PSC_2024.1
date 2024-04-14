/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoPersonagem;

/**
 *
 * @author SAMSUNG
 */
public class Calculadora {

    public Calculadora(int valor) {
        System.out.println("Nova calculadora criada");   
    }

    public double soma(int a, int b) {
        return soma((double) a, (double) b);
    }

    public double soma(String a, String b) {
        return soma(Double.parseDouble(a), Double.parseDouble(b));
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public double divisao(double a, double b) {
        // return a / b;
        return divisao(a, b, false);
    }

    public double divisao(double a, double b, boolean troca) {
        if (troca == true) {
            return b / a;
        } else {// condiçao da versão original
            return a / b;
        }
    }

    public double getMilhas(double kilometros) {
        return kilometros * (1.609);
    }

    public double getMilhas(float metros) {
        return (double) ((metros / 1000) * (1.609));
    }
}
