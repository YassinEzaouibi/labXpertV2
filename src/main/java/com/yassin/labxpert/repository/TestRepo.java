package com.yassin.labxpert.repository;

import com.yassin.labxpert.entiys.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Test, Long> {
}
