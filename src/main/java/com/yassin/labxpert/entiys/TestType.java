package com.yassin.labxpert.entiys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="test_type")
@Data @AllArgsConstructor @NoArgsConstructor
public class TestType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private double max;
    private double min;
    private String unite;
}
