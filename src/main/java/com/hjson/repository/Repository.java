package com.hjson.repository;

import org.springframework.data.repository.CrudRepository;

import com.hjson.model.ClassCliente;

public interface Repository extends CrudRepository<ClassCliente, Integer> {

}
