package org.example.service;

import org.example.models.Fatura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiltroDeFaturasService {

    public List<Fatura> filter(Fatura[] faturas){
        List<Fatura> filtered = new ArrayList<>(Arrays.asList(faturas));

        return filtered;
    }
}
