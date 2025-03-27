/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplosparte2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Principal {

    public static void main(String[] args) {
        Fila fila = new Fila();
        try {
            fila.enfileira("Matheus");
            fila.enfileira("Marcos");
            fila.enfileira("Lucas");
            fila.enfileira("João");
            fila.enfileira("Paulo");
            fila.enfileira("Felipe");
            fila.enfileira("Timóteo");
            
            fila.imprime();
            
            System.out.println("Desenfileirou: " + fila.desenfileira());
            
            fila.imprime();
            
            fila.enfileira("James");
            fila.enfileira("Tito");
            
            System.out.println("Desenfileirou: " + fila.desenfileira());
            System.out.println("Desenfileirou: " + fila.desenfileira());
            System.out.println("Desenfileirou: " + fila.desenfileira());
            System.out.println("Desenfileirou: " + fila.desenfileira());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        fila.imprime();
    }
}
