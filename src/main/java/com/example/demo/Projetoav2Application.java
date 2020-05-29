package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Animal;
import com.example.demo.domain.Cliente;
import com.example.demo.domain.Especie;
import com.example.demo.repositories.AnimalRepository;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.repositories.EspecieRepository;

@SpringBootApplication
public class Projetoav2Application implements CommandLineRunner {
	
	@Autowired
	ClienteRepository clienterepository;
	
	@Autowired
	EspecieRepository especierepository;
	
	@Autowired
	AnimalRepository animalrepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Projetoav2Application.class, args);

	}
	
	@Override
	public void run(String...args)throws Exception {
		
		Especie esp1 = new Especie (null, "Felino");
		Especie esp2 = new Especie (null, "Canis");	

		Animal a1 = new Animal (null, "Felix", 3 , "macho", esp1);
		Animal a2 = new Animal (null, "Tico", 2 , "femea", esp1);
		
		esp1.getAnimais().addAll(Arrays.asList(a1 , a2));
						
		this.especierepository.saveAll(Arrays.asList(esp1,esp2));
		this.animalrepository.saveAll(Arrays.asList(a1, a2));

		Cliente c1 = new Cliente(null, "Jucileudo Arantes", "Rua 13 de Maio, Bela Vista, 51", "3482-5677", "juju@gmail.com");
		Cliente c2 = new Cliente(null, "Carmelita Donca", "Av General Sampaio, Centro, 101", "3252-1258", "kaka@gmail.com");
		this.clienterepository.saveAll(Arrays.asList(c1,c2));
		
		
			
		
	}
}
