package com.yassin.labxpert.entiys;


import com.yassin.labxpert.entiys.enums.Role;
import com.yassin.labxpert.entiys.enums.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="\"users\"")
@Data @AllArgsConstructor @NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String username;
    private String password;
    private String adresse;
    private String telephone;

    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Enumerated(EnumType.STRING)
    private Role role;
}
