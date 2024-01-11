package com.yassin.labxpert.entitys;

import com.yassin.labxpert.enums.EtatProgressionEchantillon;
import com.yassin.labxpert.enums.TypeAnalyse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "echantillon")
public class Echantillon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEchantillon;
    @ManyToOne
    Patient patient;
    TypeAnalyse typeAnalyse;
    EtatProgressionEchantillon etatProgressionEchantillon;
    Date datePrelevement;
}
