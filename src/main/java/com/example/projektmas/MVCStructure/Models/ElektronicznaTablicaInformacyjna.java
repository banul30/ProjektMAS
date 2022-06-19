package com.example.projektmas.MVCStructure.Models;

import com.example.projektmas.MVCStructure.Helpers.StringListConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ElektronicznaTablicaInformacyjna {
    @Id
    private Long idTablica;

    @Column
    @Convert(converter = StringListConverter.class)
    private List<String> obslugiwaneJezyki;


    @OneToMany(mappedBy = "tablica", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<DanePrzegladuTablicy> przegladyTablic;


}
