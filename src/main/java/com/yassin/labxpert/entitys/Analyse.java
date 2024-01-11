package com.yassin.labxpert.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "analyse")
public class Analyse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idAnalyse;
    @OneToOne
    Echantillon echantillon;
    @OneToOne
    User user;

    Date dateDebut;
    Date dateFin;
    List<Test> tests;
    String commantaires;
}
