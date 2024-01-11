package com.yassin.labxpert.entitys;

import com.yassin.labxpert.enums.UniteMesure;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Resultat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idResultat;
    @OneToOne
    Analyse analyseAssocie;
    UniteMesure uniteMesure;


}
