/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgeovani.todoList.controller;

import com.devgeovani.todoList.dao.TarefaDAO;
import com.devgeovani.todoList.model.TarefaDTO;
import java.util.List;

/**
 *
 * @author geovani
 */
public class TarefaController {
    //incluir tarefa
    public void novaTarefa(TarefaDTO Tarefa){
        
    }
    
    //Atualizar uma Tarefa
    public void atualizarTarefa(TarefaDTO Tarefa){
        
    }
    
    //Remover uma Tarefa pelo seu ID
    public void removerTarefaById(int idTarefa){
        
    }
    
    //Listar todas as tarefas de um projeto
    public List<TarefaDTO> getAll(int idProjeto){
        TarefaDAO dao = new TarefaDAO();
        return dao.listarTarefas();
    }
    
}
