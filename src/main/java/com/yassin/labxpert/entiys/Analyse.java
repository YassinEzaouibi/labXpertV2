package com.yassin.labxpert.entiys;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "\"analyse\"")
@Data @AllArgsConstructor @NoArgsConstructor
public class Analyse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToOne
    @JoinColumn(name = "echantillon_id")
    private Echantillon echantillon;

    private Date dateDebut;
    private Date dateFin;

    @OneToMany(mappedBy="analyse" ,fetch = FetchType.LAZY)
    private List<Test> tests;

    private String commantaires;
}
