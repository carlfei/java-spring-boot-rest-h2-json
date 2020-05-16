package com.hjson.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hjson.model.ClassCliente;

import com.hjson.service.ClassService;

@RestController
public class ClassHJsonController {

	@Autowired
	private ClassService classService;

	public ClassHJsonController(ClassService classService) {
		this.classService = classService;
	}

	@RequestMapping("/all")
	public Iterable<ClassCliente> list() {
		return classService.returnAll();
	}

	@PostMapping(value = "/update", consumes = "application/json;charset=UTF-8", produces = "application/json;charset=UTF-8")
	public ClassCliente updateCalle(@RequestBody ClassCliente userupdate) {

		return classService.save(userupdate);

		
	}

}
