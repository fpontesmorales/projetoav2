package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Cliente;
import com.example.demo.repositories.ClienteRepository;

@SpringBootApplication
public class Projetoav2Application implements CommandLineRunner {
	
	@Autowired
	ClienteRepository clienterepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Projetoav2Application.class, args);

	}
	
	@Override
	public void run(String...args)throws Exception {
		
		Cliente c1 = new Cliente(null, "Jucileudo Arantes", "Rua 13 de Maio, Bela Vista, 51", "3482-5677", "juju@gmail.com");
		Cliente c2 = new Cliente(null, "Carmelita Donca", "Av General Sampaio, Centro, 101", "3252-1258", "kaka@gmail.com");
		
		this.clienterepository.saveAll(Arrays.asList(c1,c2));
	}
}
