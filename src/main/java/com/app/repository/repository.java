package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Material;

@Repository
public interface repository extends JpaRepository<Material, Long> {
	

	
	
}
