package com.example.projektmas.MVCStructure.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mandat {

    @Id
    private Long IdMandat;
    private BigDecimal kwota;
    private boolean czyOplacony;
    private Instant DataWystawienia;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "kontroler_biletow_id", referencedColumnName = "idKontrolerBiletow", foreignKey = @ForeignKey(name = "fk_mandat_KontrolerBiletow"))
    private KontrolerBiletow kontrolerBiletow;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "pasazer_id", referencedColumnName = "idPasazer", foreignKey = @ForeignKey(name = "fk_mandat_Pasazer"))
    private Pasazer Pasazer;
}
