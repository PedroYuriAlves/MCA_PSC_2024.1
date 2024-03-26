
import javax.swing.JOptionPane;

public class Exercicio_01 {

    public static void main(String[] args) {

        //Entrada
        String textoValor = JOptionPane.showInputDialog("Informar o valor de Troco.");

        if (textoValor.compareTo("0") < 0 || textoValor.compareTo("9") >= 0) {
            JOptionPane.showMessageDialog(null, "Valor Invalido");

        } else {

            int valorAtual = Integer.parseInt(textoValor);

            //Processamento
            int notas100 = valorAtual / 100;
            valorAtual = valorAtual % 100;

            int notas50 = valorAtual / 50;
            valorAtual = valorAtual % 50;

            int notas20 = valorAtual / 20;
            valorAtual = valorAtual % 20;

            int notas10 = valorAtual / 10;
            valorAtual = valorAtual % 10;

            int notas5 = valorAtual / 5;
            valorAtual = valorAtual % 5;

            int notas2 = valorAtual / 2;
            valorAtual = valorAtual % 2;

            int notas1 = valorAtual / 1;
            valorAtual = valorAtual % 1;

            // Saida
            String resposta = "Notas de 100: " + notas100;
            resposta = resposta + "\nNotas de 50: " + notas50;
            resposta += "\nNotas de 20: " + notas20;
            resposta += "\nNotas de 10: " + notas10;
            resposta += "\nNotas de 5: " + notas5;
            resposta += "\nNotas de 2: " + notas2;
            resposta += "\nMoedas de 1: " + notas1;

            JOptionPane.showMessageDialog(null, resposta);
        }
    }
}
