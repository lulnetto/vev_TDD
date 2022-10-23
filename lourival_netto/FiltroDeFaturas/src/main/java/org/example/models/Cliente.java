package org.example.models;

import java.util.UUID;

public class Cliente {

    private UUID id;
    private String nome;
    private String data;
    private String estado;

    public Cliente(String nome, String data, String estado) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.data = data;
        this.estado = estado;
    }

    public UUID getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEstado(){
        return this.estado;
    }

    public String getData(){
        return this.data;
    }

}
