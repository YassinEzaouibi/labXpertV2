package com.yassin.labxpert.entiys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "\"tools\"")
@Data @AllArgsConstructor @NoArgsConstructor
public class Tools {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String utilisation;
    private int quantity;

}
