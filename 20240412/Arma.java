/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoPersonagem;

import java.util.Random;

/**
 *
 * @author SAMSUNG
 */
public class Arma {

    private int dano;
    private String nome;

    public Arma(String nome) {
        this.nome = nome;
        dano = (new Random()).nextInt(10) + 1;
    }

    public Arma() {
    }

    //métodos de acesso = getters
    public int getDano() {
        return dano;
    }

    public String getNome() {
        return nome;
    }

    //métodos modificadores = setters
    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\ndano: " + dano;
    }
}
