package com.yassin.labxpert.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "typetest")
public class TypeTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idTypeTest;

}
