package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Cliente;
import com.example.demo.repositories.ClienteRepository;

@Service

public class ClienteService {
	
	@Autowired
	private ClienteRepository repositorio;

	public Cliente buscar(Integer id) {
		
		Optional<Cliente> obj= repositorio.findById(id);
		return obj.orElse(null);
				
		
	}
}
