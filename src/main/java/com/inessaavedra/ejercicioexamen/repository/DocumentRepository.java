package com.inessaavedra.ejercicioexamen.repository;

import com.inessaavedra.ejercicioexamen.model.DocumentModel;

import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<DocumentModel, Long>{
    
}
