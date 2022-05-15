package com.inessaavedra.ejercicioexamen.controller;

import com.inessaavedra.ejercicioexamen.model.DocumentModel;
import com.inessaavedra.ejercicioexamen.service.DocumentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DocumentController {
    @Autowired
    private DocumentService service;

    @GetMapping("/documents")
    public ResponseEntity<Iterable<DocumentModel>> retrieveAll() {
        return ResponseEntity.ok().body(service.retrieveAll());
    }
}