package com.yassin.labxpert.entiys;


import com.yassin.labxpert.entiys.enums.EtatProgressionEchantillon;
import com.yassin.labxpert.entiys.enums.TypeAnalyse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "\"echantillon\"")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Echantillon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEchantillon;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @Enumerated(EnumType.STRING)
    private TypeAnalyse typeAnalyse;

    @Enumerated(EnumType.STRING)
    private EtatProgressionEchantillon etatProgressionEchantillon;

    private Date datePrelevement;
}
