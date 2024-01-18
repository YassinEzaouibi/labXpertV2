package com.yassin.labxpert.services;

import com.yassin.labxpert.entiys.Users;
import com.yassin.labxpert.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void deleteUserByEmail(String email){
        Optional<Users> user = userRepo.findByEmail(email);
        user.ifPresent(userRepo::delete);
    }
    public Users getUserByEmail(String email){
        return userRepo.findByEmail(email).get();
    }
    public Users addUser(Users user){
        return userRepo.save(user);
    }
    public Users modifierUtilisateur(Users updatedUser){
        return userRepo.save(updatedUser);

    }
    public Users getUserById(long id){
        return userRepo.findById(id).get();
    }
    public List<Users> getUsers(){
        return userRepo.findAll();
    }
}
