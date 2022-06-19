package com.example.projektmas.MVCStructure.Models;

import com.example.projektmas.Config.TramwajModel;
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
public class TramwajKlasyczny {
    @Id
    private Long idTramwaj;
    private String przebieg;
    private String nazwa;
    private String terenoperacyjny;
    private int portyUsb;
    private TramwajModel model;
    private int wagaRampy;

    @OneToMany(mappedBy = "tramwajKlasyczny", fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Kasownik> kasowniki;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "tramwajKlasyczny_Przystanek",
            joinColumns = {@JoinColumn(name = "fk_id_tramwajKlasyczny")},
            inverseJoinColumns = {@JoinColumn(name = "fk_id_przystanek")}
    )
    private Set<Przystanek> przystanki;



    private String generujRaportOStanieTramwaju() {
        String trescRaportu = "idenntyfikator: "+ idTramwaj+ ", przebieg: "+ przebieg + ", nazwa: "+ nazwa + ", teren operacyjny: "+ terenoperacyjny;
        return trescRaportu;
    }

}

