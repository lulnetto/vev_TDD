package org.example.models;

import java.util.UUID;

public class Fatura {

    private String codigo;
    private int valor;
    private String data;
    private String cliente;


    public Fatura(String codigo, int valor, String data, String cliente) {
        this.codigo = codigo;
        this.valor = valor;
        this.data = data;
        this.cliente = cliente;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public int getValor(){
        return this.valor;
    }

    public String getData(){
        return this.data;
    }

    public String getCliente(){
        return this.cliente;
    }
}
