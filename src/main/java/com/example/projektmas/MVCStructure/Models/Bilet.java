package com.example.projektmas.MVCStructure.Models;

import com.example.projektmas.Config.RodzajUlgi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bilet {
    @Id
    private Long idBilet;
    private Instant dataWaznosci;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "pasazer_id", referencedColumnName = "idPasazer", foreignKey = @ForeignKey(name = "fk_bilet_Pasazer"))
    private Pasazer Pasazer;

    @Enumerated(EnumType.STRING)
    private RodzajUlgi rodzajUlgi;


}
