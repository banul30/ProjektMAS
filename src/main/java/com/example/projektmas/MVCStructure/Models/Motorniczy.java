package com.example.projektmas.MVCStructure.Models;

import com.example.projektmas.Config.Zmiana;
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
public class Motorniczy {


    @Id
    private Long idMotorniczy;
    private String Imie;
    private String Nazwisko;
    private BigDecimal Pensja;
    private Zmiana zmiana;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable( name= "motorniczy_tramwajKlasyczny",
            joinColumns = {@JoinColumn(name="fk_id_motorniczy")},
            inverseJoinColumns = {@JoinColumn(name="fk_id_tramwajKlasyczny")} )
    private Set<TramwajKlasyczny> tramwajeKlasyczne;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable( name= "motorniczy_tramwajNiskopodlogowy",
            joinColumns = {@JoinColumn(name="fk_id_motorniczy")},
            inverseJoinColumns = {@JoinColumn(name="fk_id_tramwajNiskopodlogowy")} )
    private Set<TramwajNiskopodlogowy> tramwajeNiskopodlogowe;

}
