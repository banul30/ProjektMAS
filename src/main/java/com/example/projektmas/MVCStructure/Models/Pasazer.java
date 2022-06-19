package com.example.projektmas.MVCStructure.Models;

import com.example.projektmas.Config.Zmiana;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pasazer {
    @Id
    private Long idPasazer;
    private String Imie;
    private String Nazwisko;
    private Instant dataUrodzenia;

    @OneToMany(mappedBy = "Pasazer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Mandat> mandaty;

    @OneToMany(mappedBy = "Pasazer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Bilet> bilety;




}
