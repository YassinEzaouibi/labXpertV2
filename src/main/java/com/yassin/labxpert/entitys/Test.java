package com.yassin.labxpert.entitys;

import com.yassin.labxpert.enums.StatusTest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idTest;
    @ManyToOne
    Analyse analyse;
    @OneToOne
    TypeTest typeTest;

    StatusTest statusTest;
    Reactif reactif;
    Tools tools;
}
