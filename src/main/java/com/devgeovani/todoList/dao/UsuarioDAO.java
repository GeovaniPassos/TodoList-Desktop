/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgeovani.todoList.dao;

import com.devgeovani.todoList.model.UsuarioDTO;
import com.devgeovani.todoList.util.Criptografia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author geovani
 */
public class UsuarioDAO {
    public boolean inserirUsuario(UsuarioDTO usuario){
        
        try (Connection conn = Conexao.conectar()){
            
            String sql = "INSERT INTO usuario (login, senha) VALUES (?,?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            String senhaHash = Criptografia.sha256(usuario.getSenha());
            stmt.setString(2, senhaHash);
            
            int linhasAfetadas = stmt.executeUpdate();
            
            return linhasAfetadas > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean autenticarUsuario(UsuarioDTO usuario){
        
        try (Connection conn = Conexao.conectar()){
            
            String senha = Criptografia.sha256(usuario.getSenha());
            String sql = "SELECT * FROM usuarios WHERE login = ? AND senha = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, senha);
            
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (Exception e) {
            return false;
        }
    }
}
