package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Material;
import com.app.repository.repository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/materials")
public class MaterialController {

    @Autowired
    private repository materialRepository;

    // POST: Add Material
    @PostMapping("add")
    public ResponseEntity<Material> addMaterial(@Valid @RequestBody Material material) {
    	Material saved = materialRepository.save(material);
    	return ResponseEntity.ok(materialRepository.save(material));
    }

    // GET: List All Materials
    @GetMapping("findall")
    public ResponseEntity<List<Material>> getAllMaterials() {
        return ResponseEntity.ok(materialRepository.findAll());
    }
}