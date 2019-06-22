package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Senha;


@Repository
public interface SenhaRepository extends JpaRepository<Senha,Integer>{
	

}
