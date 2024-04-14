/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoPersonagem;

/**
 *
 * @author SAMSUNG
 */
public class Exemplos_Vetores {

    public static void main(String[] args) {

        int inteiro = 2;
        int[] vetor_inteiros = new int[12];
        double[] vetor_double = new double[3];
        String[] vetor_texto = new String[21];

        vetor_texto[0] = "Oi";
        vetor_texto[1] = "Hoje";
        vetor_texto[2] = "a";
        vetor_texto[3] = "aula";
        vetor_texto[4] = "e";
        vetor_texto[5] = "de ";
        vetor_texto[6] = "vetor";

        vetor_inteiros[0] = 3;
        vetor_inteiros[1] = 43;
        vetor_inteiros[2] = 4123;
        vetor_inteiros[3] = 3232;
        vetor_inteiros[4] = 1223;

        Inimigo[] vetor_inimigo = new Inimigo[5];
        vetor_inimigo[0] = new Inimigo("Orc", 10, 100, 12);
        vetor_inimigo[1] = new Inimigo("Dragao", 40, 300, 52);
        vetor_inimigo[2] = new Inimigo("Mago Negro", 20, 100, 332);

        for (int index = 0; index < vetor_inimigo.length; index++) {
            if (vetor_inimigo[index] != null) {
                System.out.println("Posicao: " + index + " - " + vetor_inimigo[index].toString());
            }
        }

        for (int index = 0; index < vetor_inteiros.length; index++) {
            System.out.println("Posicao: " + index + " - " + vetor_inteiros[index]);

        }
        System.out.println("");
        for (int index = 0; index < vetor_texto.length; index++) {
            System.out.println("Posicao: " + index + " - " + vetor_texto[index]);

        }

    }
}
