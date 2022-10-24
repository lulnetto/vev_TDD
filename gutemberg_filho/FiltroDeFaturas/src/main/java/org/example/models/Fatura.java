package org.example.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fatura {

    private String codigo;
    private int valor;
    private Date data;
    private String cliente;


    public Fatura(String codigo, int valor, String date, String cliente) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.codigo = codigo;
        this.valor = valor;
        this.data = simpleDateFormat.parse(date);
        this.cliente = cliente;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public int getValor(){
        return this.valor;
    }

    public Date getData(){
        return this.data;
    }

    public String getCliente(){
        return this.cliente;
    }
}
