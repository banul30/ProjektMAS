package com.example.projektmas.MVCStructure.Models;


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
public class DanePrzegladuTablicy {
    @Id
     private Long idPrzegladu;
     private String opisStanu;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "technik_id", referencedColumnName = "idTechnik", foreignKey = @ForeignKey(name = "fk_przeglad_Technik"))
     private Technik technik;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "tablica_id", referencedColumnName = "idTablica", foreignKey = @ForeignKey(name = "fk_przeglad_Tablica"))

    private ElektronicznaTablicaInformacyjna tablica;


}
