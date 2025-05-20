/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.devgeovani.todoList.main;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author geovani
 */
public class TodoList {

    public static void main(String[] args) {
        
        Consumer<String> imprimir = s -> System.out.println("Olá,"+ s + "!");
        imprimir.accept("Java");
        
        System.out.println();
        
        Supplier<Double> randomNumber = () -> Math.random() * 100;
        System.out.println(randomNumber.get());
    }
}
