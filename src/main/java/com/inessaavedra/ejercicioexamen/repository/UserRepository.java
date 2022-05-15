package com.inessaavedra.ejercicioexamen.repository;

import com.inessaavedra.ejercicioexamen.model.UserModel;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Long> {
    
    
}
