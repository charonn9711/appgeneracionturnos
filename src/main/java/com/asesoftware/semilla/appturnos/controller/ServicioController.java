package com.asesoftware.semilla.appturnos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.appturnos.entity.ServicioEntity;

@RestController
@RequestMapping(path = "/api/v1/servicio")
public class ServicioController {

	@GetMapping(path = "/todos")
	public List<ServicioEntity> consultarTodos(){
		return null;
	}
	
}
