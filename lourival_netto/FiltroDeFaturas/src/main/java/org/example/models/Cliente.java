package org.example.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Cliente {

    private UUID id;
    private String nome;
    private Date data;
    private String estado;

    public Cliente(String nome, String date, String estado) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.data = simpleDateFormat.parse(date);
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

    public Date getData(){
        return this.data;
    }

}
