package com.yassin.labxpert.repository;

import com.yassin.labxpert.entitys.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Test, Long> {
}
