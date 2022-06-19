package com.example.projektmas.MVCStructure.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Przystanek {
    @Id
    private Long idPrzystanek;
    private boolean posiadaWiate;

    @ManyToMany(mappedBy = "przystanki", cascade = CascadeType.ALL)
    private Set<TramwajKlasyczny> tramwajeKlasyczne;

    @ManyToMany(mappedBy = "przystanki", cascade = CascadeType.ALL)
    private Set<TramwajNiskopodlogowy> tramwajeNiskopodlogowe;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="fk_tablicaId")
    private ElektronicznaTablicaInformacyjna elektronicznaTablicaInformacyjna;

}
