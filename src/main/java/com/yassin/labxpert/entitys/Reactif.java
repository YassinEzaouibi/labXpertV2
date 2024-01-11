package com.yassin.labxpert.entitys;

import com.yassin.labxpert.enums.StatusTest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reactif")
public class Reactif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idReactif;
    String nomReactif;
    String descreption;
    int quantityReactif;
    Date dateExperation;
    @ManyToOne
    Fournisseur fournisseur;

}
