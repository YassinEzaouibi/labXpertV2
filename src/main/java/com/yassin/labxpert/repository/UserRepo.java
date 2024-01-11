package com.yassin.labxpert.repository;

import com.yassin.labxpert.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
