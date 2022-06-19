package com.example.projektmas.MVCStructure.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MandatInputData {
    private Long idPasazer;
    private Long idKontroler;
    private BigDecimal kwota;
    private boolean czyOplacony;

    @Override
    public String toString() {
        return "MandatInputData{" +
                "idPasazer=" + idPasazer +
                ", idKontroler=" + idKontroler +
                ", kwota=" + kwota +
                ", czyOplacony=" + czyOplacony +
                '}';
    }
}
