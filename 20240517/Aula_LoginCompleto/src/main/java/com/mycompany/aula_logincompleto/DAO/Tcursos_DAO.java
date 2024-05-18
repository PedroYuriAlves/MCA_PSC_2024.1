/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_logincompleto.DAO;

import com.mycompany.aula_logincompleto.Model.Cursos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SAMSUNG
 */
public class Tcursos_DAO {

    public boolean inserirCurso(Cursos curso) {

        try {

            ConnectionFactory cnn = new ConnectionFactory();
            Connection conexao = cnn.obtemConexao();

            String sql = "INSERT INTO TCURSOS (CUR_NOME, CUR_QTDSEM) VALUES(?,?) ";
            //3: Pré compila o comando
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, curso.getNome());
            ps.setInt(2, curso.getQtdeSem());

            ps.execute();

            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public ArrayList<Cursos> listar() {
        try {
            ConnectionFactory cnn = new ConnectionFactory();
            Connection conexao = cnn.obtemConexao();

            String sql = "SELECT * FROM TCURSOS";
            //3: Pré compila o comando
            PreparedStatement ps = conexao.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<Cursos> lRetorno = new ArrayList<>();
            while (rs.next()) {
                int CUR_ID = rs.getInt("CUR_ID");
                String CUR_NOME = rs.getString("CUR_NOME");
                int CUR_QTDSEM = rs.getInt("CUR_QTDSEM");

                Cursos cursoDB = new Cursos(CUR_ID, CUR_NOME, CUR_QTDSEM);
                lRetorno.add(cursoDB);
            }
            return lRetorno;
        } catch (SQLException ex) {
            return null;
        }
    }
}
