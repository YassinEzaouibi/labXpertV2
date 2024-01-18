package com.yassin.labxpert.entiys;


import com.yassin.labxpert.entiys.enums.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="\"fournisseur\"")
@Data @AllArgsConstructor @NoArgsConstructor
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String adresse;
    private String telephone;
    private String email;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    private String Entreprise;
}
