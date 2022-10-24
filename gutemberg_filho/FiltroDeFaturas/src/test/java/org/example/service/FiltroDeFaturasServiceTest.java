package org.example.service;

import org.example.Controller.ClienteController;
import org.example.models.Cliente;
import org.example.models.Fatura;
import org.junit.jupiter.api.Test;

import java.text.ParseException;


import static org.junit.jupiter.api.Assertions.*;


class FiltroDeFaturasServiceTest {

    @Test
    public void create_new_client() throws ParseException {
        //Criar um novo cliente

        Cliente cliente = new Cliente("Berg", "23/3/2022", "Paraíba");

        assertEquals("Berg", cliente.getNome());
        assertEquals("Paraíba", cliente.getEstado());
    }

    @Test
    public void create_new_invoice() throws ParseException {
        //Criar um novo cliente
        ClienteController clienteController = new ClienteController();
        String clienteID = clienteController.insertClient(new Cliente("Berg", "23/3/2022", "Paraíba"));

        //Criar uma nova fatura
        Fatura fatura = new Fatura("CODTEST", 100, "20/08/2022", clienteID);

        assertEquals("CODTEST", fatura.getCodigo());
        assertEquals(100, fatura.getValor());
        assertEquals("Berg", clienteController.findClient(fatura.getCliente()).getNome());
    }


    @Test
    public void filter_is_bellow_2k() throws ParseException {
        //Criar um novo cliente
        ClienteController clienteController = new ClienteController();
        String clienteID = clienteController.insertClient(new Cliente("Berg", "23/3/2022", "Paraíba"));


        //Criar um filtro
        FiltroDeFaturasService filtroDeFaturasService = new FiltroDeFaturasService(clienteController);

        //Pecorrer umas lista de faturas e verifica se o valor está abaixo de 2k
        //Lista de faturas que passarão pelo filtro
        Fatura[] faturas = {new Fatura("#123", 1000, "10/10/2022", clienteID)};


        assertEquals(0, filtroDeFaturasService.filter(faturas).size());

    }

    @Test
    public void filter_is_between_2k_2kAndHalf_and_your_date_has_more_than_a_month() throws ParseException {
        //Criar um novo cliente
        ClienteController clienteController = new ClienteController();
        String clienteID = clienteController.insertClient(new Cliente("Berg", "23/3/2022", "Paraíba"));

        //Criar um filtro
        FiltroDeFaturasService filtroDeFaturasService = new FiltroDeFaturasService(clienteController);

        //Pecorrer umas lista de faturas e verifica se o valor está entre de 2k e 2k e meio.
        // Verifica se a fatura tem 1 mês ou menos.
        //Lista de faturas que passarão pelo filtro.
        Fatura[] faturas = {new Fatura("#123", 2200, "10/09/2022", clienteID),
                new Fatura("#234", 2000, "10/10/2022", clienteID)};


        assertEquals(1, filtroDeFaturasService.filter(faturas).size());

    }

    @Test
    public void filter_is_between_2kAndHalf_3k_and_your_client_has_more_than_two_month_of_date_inclusion() throws ParseException {
        //Criar um novo cliente
        ClienteController clienteController = new ClienteController();
        String clienteID = clienteController.insertClient(new Cliente("Berg", "23/09/2022", "Paraíba"));

        //Criar um filtro
        FiltroDeFaturasService filtroDeFaturasService = new FiltroDeFaturasService(clienteController);

        //Pecorrer umas lista de faturas e verifica se o valor está entre de 2.5k e 3k.
        // Verifica se a data de inserção do cliente foi de 2 meses ou menos.
        //Lista de faturas que passarão pelo filtro.
        Fatura[] faturas = {new Fatura("#123", 2800, "10/09/2022", clienteID),
                new Fatura("#234", 2600, "10/06/2022", clienteID)};


        assertEquals(0, filtroDeFaturasService.filter(faturas).size());

    }




}