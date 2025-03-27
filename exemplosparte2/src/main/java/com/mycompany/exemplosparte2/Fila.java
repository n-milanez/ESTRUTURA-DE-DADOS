/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplosparte2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Fila {
    private class No {
        Object item;
        No prox;        
    }
    
    private No inicio;
    private No fim;

    // Operações
    public Fila() { //  Cria uma Fila vazia
        this.inicio = new No();
        this.fim = this.inicio;
        this.inicio.prox = null;
    }

    public void enfileira(Object valor) {
        this.fim.prox = new No();
        this.fim = this.fim.prox;
        this.fim.item = valor;
        this.fim.prox = null;
    }

    public Object desenfileira() throws Exception {
        Object valor = null;
        if (this.vazia()) {
            throw new Exception("Erro: A fila esta vazia");
        }
        this.inicio = this.inicio.prox;
        valor = this.inicio.item;
        return valor;
    }

    public boolean vazia() {
        return (this.inicio == this.fim);
    }


    public void imprime() {
        No aux;
        aux = this.inicio.prox;
        while (aux != null) {
            System.out.print(" " + aux.item.toString());
            aux = aux.prox;
        }
        System.out.println();
    }
}
