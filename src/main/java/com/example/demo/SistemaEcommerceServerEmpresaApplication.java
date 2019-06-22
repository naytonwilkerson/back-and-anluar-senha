package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Senha;
import com.example.demo.repository.SenhaRepository;



@SpringBootApplication
public class SistemaEcommerceServerEmpresaApplication  {
	
	@Autowired
	static SenhaRepository senhaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SistemaEcommerceServerEmpresaApplication.class, args);
	
			
	}

	
	
	

}
