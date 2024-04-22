/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_GUI;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui Code your solution here Escriba su
         * solución aquí
         */
        Scanner sc = new Scanner(System.in);

        double pi = Math.PI;
        double raio = sc.nextDouble();

        double area = pi * (Math.pow(raio, 2));

        System.out.printf("%.2f","A=" + area);
    }

}
