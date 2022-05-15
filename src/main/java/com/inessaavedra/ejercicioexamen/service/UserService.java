package com.inessaavedra.ejercicioexamen.service;

import com.inessaavedra.ejercicioexamen.join.UserDocumentJoin;
import com.inessaavedra.ejercicioexamen.model.UserModel;

public interface UserService {
    Iterable<UserModel> retrieveAll(); 
    Iterable<UserDocumentJoin> retrieveUserDocumentJoin(); 
    
}
