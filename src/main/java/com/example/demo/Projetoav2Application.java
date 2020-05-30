package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Animal;
import com.example.demo.domain.Cliente;
import com.example.demo.domain.Consulta;
import com.example.demo.domain.Especie;
import com.example.demo.domain.Veterinario;
import com.example.demo.repositories.AnimalRepository;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.repositories.ConsultaRepository;
import com.example.demo.repositories.EspecieRepository;
import com.example.demo.repositories.VeterinarioRepository;

@SpringBootApplication
public class Projetoav2Application implements CommandLineRunner {
	
	@Autowired
	ClienteRepository clienterepository;
	
	@Autowired
	EspecieRepository especierepository;
	
	@Autowired
	AnimalRepository animalrepository;
	
	@Autowired
	ConsultaRepository consultarepository;
	
	@Autowired
	VeterinarioRepository veterinariorepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Projetoav2Application.class, args);

	}
	
	@Override
	public void run(String...args)throws Exception {
		
		Especie esp1 = new Especie (null, "Felino");
		Especie esp2 = new Especie (null, "Canis");	

		Cliente c1 = new Cliente(null, "Jucileudo Arantes", "Rua 13 de Maio, Bela Vista, 51", "3482-5677", "juju@gmail.com");
		Cliente c2 = new Cliente(null, "Carmelita Donca", "Av General Sampaio, Centro, 101", "3252-1258", "kaka@gmail.com");
				
		Animal a1 = new Animal (null, "Felix", 3 , "Macho", esp1,c1);
		Animal a2 = new Animal (null, "Tico", 2 , "Femea", esp1, c1);
		Animal a3 = new Animal (null, "Cicarelle", 5 , "Femea", esp2, c2);
		Animal a4 = new Animal (null, "Junior", 3 , "Macho", esp2, c2);
		
		esp1.getAnimais().addAll(Arrays.asList(a1 , a2));
		esp2.getAnimais().addAll(Arrays.asList(a3 , a4));
		this.especierepository.saveAll(Arrays.asList(esp1,esp2));
		
		c1.getAnimais().addAll(Arrays.asList(a1 , a2));
		c2.getAnimais().addAll(Arrays.asList(a3 , a4));
		this.clienterepository.saveAll(Arrays.asList(c1,c2));
		
		this.animalrepository.saveAll(Arrays.asList(a1, a2, a3, a4));
		
		Veterinario v1 = new Veterinario (null, "Flávio Pinto" , "12365654-45");
		Veterinario v2 = new Veterinario (null, "Michel Temer" , "9876543-33");
		Veterinario v3 = new Veterinario (null, "Juciel Filho" , "3434999-21");
		
		Consulta con1 = new Consulta (null,"05/05/2020 13:45","Av Rui Barbosa, 100, Aldeota","Exame de Urina",a1,v1);
		Consulta con2 = new Consulta (null,"05/12/2019 10:45","Av Rui Barbosa, 100, Aldeota","Raio X Torax",a2,v2);
		Consulta con3 = new Consulta (null,"25/05/2020 09:45","Av Rui Barbosa, 100, Aldeota","Exame de Urina",a3,v2);
		Consulta con4 = new Consulta (null,"05/11/2018 14:45","Av Rui Barbosa, 100, Aldeota","Cirurgia Rabo",a4,v3);
		
		v1.getConsultas().add(con1);
		v2.getConsultas().addAll(Arrays.asList(con2,con3));
		v3.getConsultas().addAll(Arrays.asList(con4));
		
		this.veterinariorepository.saveAll(Arrays.asList(v1, v2, v3));		
		this.consultarepository.saveAll(Arrays.asList(con1, con2, con3, con4));
		
		
		
		
		
		
			
		
	}
}
