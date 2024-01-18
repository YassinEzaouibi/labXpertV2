package com.yassin.labxpert.repository;

import com.yassin.labxpert.entiys.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient, Long> {
}
