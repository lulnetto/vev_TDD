package org.example.service;

import org.example.models.Cliente;
import org.example.models.Fatura;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class FiltroDeFaturasServiceTest {

    @Test
    public void create_new_client() throws ParseException {
        //Criar um novo cliente

        Cliente cliente = new Cliente("Berg", "23/3/2022", "Paraíba");

        assertEquals("Berg", cliente.getNome());
        assertEquals("23/10/2022", cliente.getData());
        assertEquals("Paraíba", cliente.getEstado());
    }

    @Test
    public void create_new_invoice() throws ParseException {
        //Criar uma nova fatura

        Fatura fatura = new Fatura("CODTEST", 100, "20/08/2022", "Berg");

        assertEquals("CODTEST", fatura.getCodigo());
        assertEquals(100, fatura.getValor());
        assertEquals("20/08/2022", fatura.getData());
        assertEquals("Berg", fatura.getCliente());
    }


    @Test
    public void filter_is_bellow_2k() throws ParseException {
        //Criar um filtro
        FiltroDeFaturasService filtroDeFaturasService = new FiltroDeFaturasService();

        //Pecorrer umas lista de faturas e verifica se o valor está abaixo de 2k
        //Lista de faturas que passarão pelo filtro
        Fatura[] faturas = {new Fatura("#123", 1000, "10/10/2022", "Berg"),
                new Fatura("#234", 2000, "10/10/2022", "Berg")};


        assertEquals(1, filtroDeFaturasService.filter(faturas).size());

    }

    @Test
    public void filter_is_between_2k_2kAndHalf_and_your_date_has_more_than_a_month() throws ParseException {
        //Criar um filtro
        FiltroDeFaturasService filtroDeFaturasService = new FiltroDeFaturasService();

        //Pecorrer umas lista de faturas e verifica se o valor está entre de 2k e 2k e meio.
        // Verifica se a fatura tem 1 mês ou menos.
        //Lista de faturas que passarão pelo filtro.
        Fatura[] faturas = {new Fatura("#123", 2200, "10/10/2022", "Berg"),
                new Fatura("#234", 2000, "10/10/2022", "Berg")};


        assertEquals(0, filtroDeFaturasService.filter(faturas).size());

    }




}