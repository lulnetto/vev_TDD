package org.example.service;

import org.example.models.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FiltroDeFaturasServiceTest {

    @Test
    public void create_new_client(){
        //Criar um novo cliente

        Cliente cliente = new Cliente("Berg", "23/10/2022", "Paraíba");

        assertEquals("Berg", cliente.getNome());
        assertEquals("23/10/2022", cliente.getData());
        assertEquals("Paraíba", cliente.getEstado());
    }
    




}