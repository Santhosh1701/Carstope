package com.example.Form.repoistry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Form.entity.FormEntity;

@Repository
public interface FormRepoistry extends JpaRepository<FormEntity, Integer>{

	
}
