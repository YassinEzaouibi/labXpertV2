package com.yassin.labxpert.entitys;

import com.yassin.labxpert.enums.RapporType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rapport")
public class Rapport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idRapport;
    RapporType rapporType;
    Date periodeDebut;
    Date periodeFin;
    List<Analyse> historiqueAnalyse;
}