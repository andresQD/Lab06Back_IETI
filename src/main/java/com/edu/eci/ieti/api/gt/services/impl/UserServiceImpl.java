package com.edu.eci.ieti.api.gt.services.impl;

import com.edu.eci.ieti.api.gt.model.User;
import com.edu.eci.ieti.api.gt.persistence.repositories.DataRepository;
import com.edu.eci.ieti.api.gt.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrés Quintero
 */
@Component
public class UserServiceImpl implements UserService {
    
    @Autowired 
    DataRepository dataRepo;

    @Override
    public List<User> getAll() {
        return dataRepo.getAll();
    }

    @Override
    public User getById(String userId) {
        return dataRepo.getById(userId);
    }

    @Override
    public User create(User user) {
        return dataRepo.create(user);
    }

    @Override
    public User update(User user) {
        return dataRepo. update(user);
    }

    @Override
    public void remove(String userId) {
        dataRepo.remove(userId);
    }
    
}
