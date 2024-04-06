/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoPersonagem;

/**
 *
 * @author SAMSUNG
 */
public class Personagem {

    private int vida;
    private String nome;
    private boolean alive;
    private int energia;

    public Personagem(String nome, int energia, int vida) {
        this.vida = vida;
        this.nome = nome;
        this.energia = energia;
        this.alive = true;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
        if (this.vida == 0) {
            this.alive = false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia <= 0) {
            this.energia = 0;
            setVida(0);
        } else if (energia >= 10) {
            this.energia = 10;
        } else {
            this.energia = energia;
        }
    }

    public void recebeDano(int dano) {
        this.vida -= dano;
        if (vida <= 0) {
            this.alive = false;
        }
    }

}
