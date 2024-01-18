package com.yassin.labxpert.entiys;

import com.yassin.labxpert.entiys.Analyse;
import com.yassin.labxpert.entiys.enums.UniteMesure;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "\"reactif\"")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resultat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idResultat;

    @OneToOne
    private Analyse analyseAssocie;

    @Enumerated
    private UniteMesure uniteMesure;


}
