/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.ieti.api.gt.services;

import com.edu.eci.ieti.api.gt.model.User;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andrés Quintero
 */
@Service
public interface UserService {
    
    List<User> getAll();
    
    User getById(String userId);
    
    User create(User user);
    
    User update(User user);
    
    void remove(String userId);
    
}
