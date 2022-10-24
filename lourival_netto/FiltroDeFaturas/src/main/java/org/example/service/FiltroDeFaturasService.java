package org.example.service;

import org.example.models.Fatura;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
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
                filtered.remove(fatura);
            }else if(fatura.getValor() > 2500 && fatura.getValor() <= 3000){

            }
        }
        return filtered;
    }

    private int calcTime(Date data){
        LocalDate today = LocalDate.now();
        LocalDate date = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period time = Period.between(date, today);
        return (time.getMonths() * 30) + time.getDays();
    }

}
