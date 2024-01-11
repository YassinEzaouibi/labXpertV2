package com.yassin.labxpert.repository;

import com.yassin.labxpert.entitys.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RapportRepo extends JpaRepository<Rapport, Long> {
}
