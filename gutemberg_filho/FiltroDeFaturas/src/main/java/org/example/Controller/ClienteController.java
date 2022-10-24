package org.example.Controller;

import org.example.models.Cliente;

import java.util.HashMap;
import java.util.Map;

public class ClienteController {

    private Map<String, Cliente> clientes;

    public ClienteController(){
        this.clientes = new HashMap<>();
    }

    public String insertClient(Cliente cliente){
        this.clientes.put(cliente.getId(), cliente);
        return cliente.getId();
    }

    public Cliente findClient(String clientID){
        return this.clientes.get(clientID);
    }

}
