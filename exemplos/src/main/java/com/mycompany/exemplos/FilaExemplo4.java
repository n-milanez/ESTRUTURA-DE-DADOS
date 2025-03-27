/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplos;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class FilaExemplo4 {
    public static void main(String[] args){
        Queue<Integer> fila = new LinkedList<>();
        
        // Adiciona os elementos {0, 1, 2, 3, 4} na fila
        for (int i=0; i<5; i++)
            fila.add(i);
        
        // Mostra o conteúdo da fila.
        System.out.println("Elementos da Fila: " + fila);
        
        // Remover o cabeça da fila
        int elemento_removido = fila.remove();
        System.out.println("Elemento Removido: " + elemento_removido);
        
        System.out.println(fila);
        
        // Visualizar o cabeça da fila
        int head = fila.peek();
        System.out.println("Cabeça da Fila: " + head);
        
        // Todos os demais métodos da Interface Collection,
        // tais como size e contains podem ser usados com esta implementação.
        int tamanho = fila.size();
        System.out.println("Tamanho da Fila: " + tamanho);
    } 
} 
