/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_logincompleto.Model;

import com.mycompany.aula_logincompleto.DAO.Tusuario_DAO;

/**
 *
 * @author SAMSUNG
 */
public class Tusuario {
    
    private String login;
    private String senha;
    private String nome;

    public Tusuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public boolean logar(){
        Tusuario_DAO usuDAO = new Tusuario_DAO();        
        return usuDAO.login(this);      
    }
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
