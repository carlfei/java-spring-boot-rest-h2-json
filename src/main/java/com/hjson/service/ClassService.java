package com.hjson.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hjson.model.ClassCliente;
import com.hjson.repository.Repository;;

@Service
public class ClassService {

	private Repository repository;

	public ClassService(Repository repository) {
		this.repository = repository;
	}

	public Iterable<ClassCliente> returnAll() {
		return repository.findAll();
	}

	public ClassCliente save(ClassCliente cliente) {
		return repository.save(cliente);
	}

	public Iterable<ClassCliente> save(List<ClassCliente> clientes) {
		return repository.saveAll(clientes);
	}
}