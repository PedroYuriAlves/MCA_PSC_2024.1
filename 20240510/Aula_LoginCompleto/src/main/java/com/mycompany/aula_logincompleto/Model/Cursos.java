/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_logincompleto.Model;

/**
 *
 * @author SAMSUNG
 */
public class Cursos {

    private int id;
    private String nome;
    private int qtdeSem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cursos(int id, String nome, int qtdeSem) {
        this.id = id;
        this.nome = nome;
        this.qtdeSem = qtdeSem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeSem() {
        return qtdeSem;
    }

    public void setQtdeSem(int qtdeSem) {
        this.qtdeSem = qtdeSem;
    }

    @Override
    public String toString() {

        return nome;

    }
}
