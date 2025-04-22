/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgeovani.todoList.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author geovani
 */
public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/todo_list";
    private static final String USER = "geovani";
    private static final String PASSWORD = "1708";
    
    //private static Connection conexao;
    
    public static Connection conectar() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        /*if(conexao == null) {
            try {
                conexao = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexão bem sucedida!");
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null,"Erro ao conectar ao banco de dados!");
            }
        }*/

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
