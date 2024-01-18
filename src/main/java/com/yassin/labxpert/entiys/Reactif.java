package com.yassin.labxpert.entiys;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "\"reactifs\"")
@Data @AllArgsConstructor @NoArgsConstructor
public class Reactif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String descreption;
    private int quantity;
    private Date dateExperation;

    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;

}
