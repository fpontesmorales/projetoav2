package com.example.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Cliente;

@RestController
@RequestMapping(value="/clientes")

public class ClienteResources {
	@RequestMapping(method = RequestMethod.GET)
	public List <Cliente> listar(){
		
		Cliente c1 = new Cliente(1, "Jucileudo Arantes", "Rua 13 de Maio, Bela Vista, 51", "3482-5677", "juju@gmail.com");
		Cliente c2 = new Cliente(2, "Carmelita Donca", "Av General Sampaio, Centro, 101", "3252-1258", "kaka@gmail.com");
		
		List<Cliente> lista = new ArrayList<>();
		
		lista.add(c1);
		lista.add(c2);
		
		return lista;
	}
}
