package com.example.projektmas.MVCStructure.Models;

import com.example.projektmas.Config.StanTuszu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Kasownik {
    @Id
    private Long idKasownik;
    private StanTuszu stanTuszu;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "tramwajKlasyczny_id", referencedColumnName = "idTramwaj", foreignKey = @ForeignKey(name = "fk_kasownik_tramwajklasyczny"))
    private TramwajKlasyczny tramwajKlasyczny;



    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "tramwajNiskopodlogowy_id", referencedColumnName = "idTramwaj", foreignKey = @ForeignKey(name = "fk_kasownik_tramwajniskopoglogowy"))
    private TramwajNiskopodlogowy tramwajNiskopodlogowy;

}
