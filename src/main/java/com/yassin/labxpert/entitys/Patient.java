package com.yassin.labxpert.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idPatient;
    String nomComplet;
    String adresse;
    String telephone;
    String email;
    String sex;
    @ManyToOne
    List<Analyse> historiqueAnalyse;
}
