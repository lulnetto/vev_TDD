package org.example.service;

import org.example.models.Cliente;
import org.example.models.Fatura;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FiltroDeFaturasServiceTest {

    @Test
    public void create_new_client(){
        //Criar um novo cliente

        Cliente cliente = new Cliente("Berg", "23/3/2022", "Paraíba");

        assertEquals("Berg", cliente.getNome());
        assertEquals("23/10/2022", cliente.getData());
        assertEquals("Paraíba", cliente.getEstado());
    }

    public void create_new_invoice(){
        //Criar uma nova fatura

        Fatura fatura = new Fatura("CODTEST", 100, "20/08/2022", "Berg");

        assertEquals("CODETEST", fatura.getCodigo());
        assertEquals(100, fatura.getValor());
        assertEquals("20/08/2022", fatura.getData());
        assertEquals("Berg", fatura.getCliente());
    }



}