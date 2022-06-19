package com.example.projektmas.MVCStructure.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class KontrolerBiletow {
    @Id
    private Long idKontrolerBiletow;
    private String Imie;
    private String Nazwisko;
    private BigDecimal Pensja;

   // private int minimalnyWiek;

    @OneToMany(mappedBy = "kontrolerBiletow", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Mandat> mandaty;

}
