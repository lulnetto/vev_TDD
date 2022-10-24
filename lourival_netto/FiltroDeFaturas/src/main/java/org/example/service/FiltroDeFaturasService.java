package org.example.service;

import org.example.models.Fatura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FiltroDeFaturasService {

    public List<Fatura> filter(Fatura[] faturas){
        List<Fatura> filtered = new ArrayList<>(Arrays.asList(faturas));
        for(Fatura fatura: faturas){
            if (fatura.getValor() < 2000){
                filtered.remove(fatura);
            }else if(fatura.getValor() >= 2000 && fatura.getValor() <= 2500 && calcTime(fatura.getData()) <= 30){

            }
        }
        return filtered;
    }

    private double calcTime(Date date){
        Date today = new Date();
        return 00;
    }

}
