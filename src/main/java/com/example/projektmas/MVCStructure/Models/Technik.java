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
public class Technik {

    @Id
    private Long idTechnik;
    private String Imie;
    private String Nazwisko;
    private BigDecimal Pensja;
    private Zmiana zmiana;

    @OneToMany(mappedBy = "technik", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<DanePrzegladuTablicy> przegladyTablic;


}
