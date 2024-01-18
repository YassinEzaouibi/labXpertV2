package com.yassin.labxpert.entiys;

import com.yassin.labxpert.entiys.enums.RapporType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "\"rapport\"")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rapport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private RapporType rapporType;

    private Date periodeDebut;
    private Date periodeFin;

    @OneToMany
    private List<Analyse> historiqueAnalyse;
}