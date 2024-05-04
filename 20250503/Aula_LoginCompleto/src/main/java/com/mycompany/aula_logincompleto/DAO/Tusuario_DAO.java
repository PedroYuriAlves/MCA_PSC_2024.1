/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_logincompleto.DAO;

import com.mycompany.aula_logincompleto.Model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author SAMSUNG
 */
public class Tusuario_DAO {

    public boolean login(Tusuario usu) {

        //1: Definir o comando SQL
        String sql = "SELECT * FROM tusuario WHERE USU_LOGIN = ? AND USU_SENHA = ?";
        // String sql = "SELECT * FROM TUSUARIO "                + "WHERE login = '"+usu.getLogin()+"' AND senha = '"+usu.getSenha()+"'";

//2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Executa o comando e guarda
            ps.setString(1, usu.getLogin());
            ps.setString(2, usu.getSenha());

            //o resultado em um ResultSet
            ResultSet rs = ps.executeQuery();
            //5: itera sobre o resultado
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
