/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgeovani.todoList.controller;

import com.devgeovani.todoList.dao.UsuarioDAO;
import com.devgeovani.todoList.model.UsuarioDTO;
import java.util.List;

/**
 *
 * @author geovani
 */
public class UsuarioController {
    public List<String> listar(){
        UsuarioDAO dao = new UsuarioDAO();
        return dao.listarUsuario();
    }
    
    public boolean login(String login, String senha){
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setLogin(login);
        usuario.setSenha(senha);
        
        UsuarioDAO dao = new UsuarioDAO();
        return dao.autenticarUsuario(usuario);
    }
    
    public boolean novoUsuario(String login, String senha){
        UsuarioDTO novo = new UsuarioDTO();
        novo.setLogin(login);
        novo.setSenha(senha);
        
        UsuarioDAO dao = new UsuarioDAO();
        return dao.inserirUsuario(novo);
    }
    
    public boolean excluirUsuario(String login){
        UsuarioDAO dao = new UsuarioDAO();
        return dao.excluirUsuario(login);
    }
}
