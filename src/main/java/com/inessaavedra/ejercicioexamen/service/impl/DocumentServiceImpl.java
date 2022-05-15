package com.inessaavedra.ejercicioexamen.service.impl;

import com.inessaavedra.ejercicioexamen.model.DocumentModel;
import com.inessaavedra.ejercicioexamen.repository.DocumentRepository;
import com.inessaavedra.ejercicioexamen.service.DocumentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentServiceImpl implements DocumentService{
    
    @Autowired
    private DocumentRepository documentRepository; 

    @Override
    public Iterable<DocumentModel> retrieveAll(){
        return documentRepository.findAll(); 
    }
    
}
