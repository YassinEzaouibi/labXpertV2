package com.yassin.labxpert.repository;

import com.yassin.labxpert.entitys.Reactif;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultatRepo extends JpaRepository<Reactif, Long> {
}
