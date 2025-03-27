/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fila;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Fila {
    private Object[] objetos = new Object[10]; 
    private int totalDeObjetos = 0;

    public void enfileira(Object objeto) {
        if (totalDeObjetos == objetos.length) {
            System.out.println("Fila cheia! Deslocando elementos...");
            for (int i = 0; i < totalDeObjetos - 1; i++) {
                objetos[i] = objetos[i + 1];
            }
            totalDeObjetos--; 
        }
        objetos[totalDeObjetos] = objeto;
        totalDeObjetos++;
        System.out.println(objeto + " foi adicionado à fila.");
    }

    public void desenfileira() {
        if (totalDeObjetos == 0) {
            System.out.println("A fila está vazia!");
            return;
        }
        System.out.println(objetos[0] + " foi removido da fila.");
        for (int i = 0; i < totalDeObjetos - 1; i++) {
            objetos[i] = objetos[i + 1]; 
        }
        objetos[totalDeObjetos - 1] = null; 
        totalDeObjetos--;
    }

    public Object primeiro() {
        if (totalDeObjetos == 0) {
            System.out.println("A fila está vazia.");
            return null;
        }
        System.out.println("Primeiro elemento: " + objetos[0]);
        return objetos[0];
    }

    public Object ultimo() {
        if (totalDeObjetos == 0) {
            System.out.println("A fila está vazia.");
            return null;
        }
        System.out.println("Último elemento: " + objetos[totalDeObjetos - 1]);
        return objetos[totalDeObjetos - 1];
    }

    public int tamanho() {
        System.out.println("Tamanho da fila: " + totalDeObjetos);
        return totalDeObjetos;
    }

    public boolean vazia() {
        boolean estaVazia = totalDeObjetos == 0;
        System.out.println("A fila está vazia? " + estaVazia);
        return estaVazia;
    }

    public void imprimirFila() {
        if (totalDeObjetos == 0) {
            System.out.println("A fila está vazia.");
            return;
        }
        System.out.print("Fila atual: ");
        for (int i = 0; i < totalDeObjetos; i++) {
            System.out.print(objetos[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enfileira("A");
        fila.enfileira("B");
        fila.enfileira("C");

        fila.imprimirFila(); 

        fila.primeiro();
        fila.ultimo();
        fila.tamanho();
        fila.vazia();

        fila.desenfileira();
        fila.imprimirFila();
        fila.primeiro();

        fila.enfileira("D");
        fila.imprimirFila();
    }
}
