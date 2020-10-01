/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.ieti.api.gt.controller;

import com.edu.eci.ieti.api.gt.model.User;
import com.edu.eci.ieti.api.gt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Andrés Quintero
 */
@RestController
public class UserController {
    
    @Autowired 
    UserService us;
    
    @RequestMapping(value="/user", method=RequestMethod.GET)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(us.getAll(),HttpStatus.ACCEPTED);
    }
    
    @RequestMapping(value="/user/{userid}", method=RequestMethod.GET)
    public ResponseEntity<?> getById(@PathVariable String userId) {
        return new ResponseEntity<>(us.getById(userId),HttpStatus.ACCEPTED);
    }
    
    @RequestMapping(value="/user", method=RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody User user ) {
        return new ResponseEntity<>(us.create(user),HttpStatus.CREATED);
    }
    
    @RequestMapping(value="/user/{userid}", method=RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody User user) {
        return new ResponseEntity<>(us.update(user),HttpStatus.OK);
    }
    
    @RequestMapping(value="/user/{userid}", method=RequestMethod.DELETE)
    public ResponseEntity<?> remove(@PathVariable String userId) {
        us.remove(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
}
