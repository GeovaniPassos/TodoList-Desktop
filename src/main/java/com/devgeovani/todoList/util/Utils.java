/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgeovani.todoList.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author geovani
 */
public class Utils {
    public String relogio(){
        
        SimpleDateFormat formatoDataHora = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
                
        Timer timer = new Timer(1000, e -> {
            String dataHoraAtual = formatoDataHora.format(new Date());
        });
        timer.start();
        return null;
    }
    
}
