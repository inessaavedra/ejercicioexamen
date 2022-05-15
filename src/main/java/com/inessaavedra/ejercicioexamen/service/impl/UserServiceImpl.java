package com.inessaavedra.ejercicioexamen.service.impl;

import com.inessaavedra.ejercicioexamen.join.UserDocumentJoin;
import com.inessaavedra.ejercicioexamen.model.UserModel;
import com.inessaavedra.ejercicioexamen.repository.UserRepository;
import com.inessaavedra.ejercicioexamen.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository; 

    @Override
    public Iterable<UserModel> retrieveAll(){
        return userRepository.findAll(); 
    }

    //Esto se hace cuando tienes un metodo con un join en service
    @Autowired
    private JdbcTemplate template; 

    
    @Override
    public Iterable<UserDocumentJoin> retrieveUserDocumentJoin(){
        String query= "SELECT * FROM USERS INNER JOIN DOCUMENTS ON USER.USER_ID= DOCUMENTS.USER_ID";

        Iterable<UserDocumentJoin> userDocumentJoins= template.query(query,
        (data,rowNum)->{
            return new UserDocumentJoin(
                data.getLong("USERS.USER_ID"),
                data.getString("USERS.USER"),
                data.getString("USERS.COMMENT"),
                data.getLong("DOCUMENTS.DOC_ID"), 
                data.getString("DOCUMENTS.DOC")

            );
        }
        );
        return userDocumentJoins;
    
    }


    
    
}
