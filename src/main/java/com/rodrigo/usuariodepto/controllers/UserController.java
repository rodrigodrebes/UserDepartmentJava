package com.rodrigo.usuariodepto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rodrigo.usuariodepto.entities.User;
import com.rodrigo.usuariodepto.repositories.UserRepository;
import java.util.List;

@RestController
@RequestMapping(value = "/users") // qual o caminho que o controlador irá responder
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<User> findAll(){
List<User> result = repository.findAll();
return result;
    }
}
