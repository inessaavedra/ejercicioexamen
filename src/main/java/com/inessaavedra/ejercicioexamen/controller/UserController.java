package com.inessaavedra.ejercicioexamen.controller;

import com.inessaavedra.ejercicioexamen.join.UserDocumentJoin;
import com.inessaavedra.ejercicioexamen.model.UserModel;
import com.inessaavedra.ejercicioexamen.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<Iterable<UserModel>> retrieveAll(){
        return ResponseEntity.ok().body(userService.retrieveAll());
    }

    @GetMapping("/users/join")
    public ResponseEntity<Iterable<UserDocumentJoin>> retrieveUserDocumentJoin(){
        return ResponseEntity.ok().body(userService.retrieveUserDocumentJoin());
    }
    
}
