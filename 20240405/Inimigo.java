/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoPersonagem;

/**
 *
 * @author SAMSUNG
 */
public class Inimigo extends Personagem {

    private int dano;

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public Inimigo(String nome, int energia, int vida, int dano) {
        super(nome, energia, vida);
        this.dano = dano;
    }

}
