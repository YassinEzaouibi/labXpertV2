package com.yassin.labxpert.services;

import com.yassin.labxpert.entiys.Users;
import com.yassin.labxpert.entiys.enums.Role;
import com.yassin.labxpert.entiys.enums.Sex;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class UserServiceTest {
    @Autowired
    private UserService userService;

   /* @Autowired
    UserServiceTest(UserService userService){
        this.userService = userService;
    }*/

    @Test
    void addUser() {
        Users user = new Users();
        user.setUsername("Zaid");
        user.setTelephone("0404004");
        user.setPassword("yasso");
        user.setAdresse("Maroc");
        user.setEmail("newq@neew.com");
        user.setRole(Role.ADMIN);
        user.setSex(Sex.MALE);
        user.setRole(Role.TECHNICIEN);
        userService.addUser(user);
    }
    @Test
    @AfterEach
    void deleteUserByEmail() {
        userService.deleteUserByEmail("newq@new.com");

    }
    @Test
    void modifierUtilisateur() {
        Users users = userService.getUserByEmail("newq@neew.com");
        users.setUsername("e");
        users.setTelephone("00000");
        users.setPassword("e0@1");
        users.setAdresse("Fes");
        users.setEmail("updateEmail@email.com");
        userService.modifierUtilisateur(users);
    }

    @Test
    void getUserById() {
        Users user = userService.getUserById(1);
        assertEquals("newq@neew.com", user.getEmail());
    }

    @Test
    void getUsers() {
        assertEquals(false, userService.getUsers().isEmpty());
    }

}