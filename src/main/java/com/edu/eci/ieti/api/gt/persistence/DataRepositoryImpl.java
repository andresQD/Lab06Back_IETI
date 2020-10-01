/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.ieti.api.gt.persistence;

import com.edu.eci.ieti.api.gt.model.User;
import com.edu.eci.ieti.api.gt.persistence.repositories.DataRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Andrés Quintero
 */
@Component
public class DataRepositoryImpl implements DataRepository {
    
    static List<User> users = new ArrayList<User>();

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getById(String userId) {
        int i = 0;
        while(i<users.size() && !users.get(i).getName().equals(userId)) i++;
        if(i != users.size()){
            return users.get(i);
        }
        else{
            return null;
        }       
    }

    @Override
    public User create(User user) {
        users.add(user);
        return users.get(users.size()-1);
    }

    @Override
    public User update(User user) {
        int i = 0;
        while(i<users.size() && !users.get(i).getName().equals(user)) i++;
        users.set(i, user);
        return users.get(users.size()-1);
    }

    @Override
    public void remove(String userId) {
        int i = 0;
        while(i<users.size() && !users.get(i).getName().equals(userId)) i++;
        users.remove(i);
    }

}
