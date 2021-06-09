package com.asesoftware.semilla.appturnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.appturnos.entity.ComercioEntity;
import com.asesoftware.semilla.appturnos.service.IComercioService;


@RestController
@RequestMapping(path = "/api/v1/comercio")

public class ComercioController {
	
	@Autowired
	private IComercioService comercioService;
	
	//Listar todos
	@GetMapping(path = "/all")
	public List<ComercioEntity> getAll(){
		
		return comercioService.getAll();
		
	}
	
	//Listar uno, para solicitar datos a usuarios a traves del path o parametro
	
	@GetMapping(path = "/comercio/{id_comercio}")
	public ComercioEntity getComercioById(@PathVariable Integer id_comercio) {
		
		return comercioService.getComercioById(id_comercio);
	}
	
	//otro ejemplo recibiendo parametro por url al marcarlo como request param vamosa
		//leer todos los parametros despues del interrogante
		//http://localhost:9003/api/v1/usuario/usuario?
		@GetMapping(path = "/comercio")
		public ComercioEntity getComercioParametroById(@RequestParam Integer id_comercio) {
			
			return comercioService.getComercioById(id_comercio);
			
		}
	
	//Crear
	//body transmitir información
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ComercioEntity createComercio(@RequestBody ComercioEntity entity) {
		
		return comercioService.createComercio(entity);
	}
		
	
	//Editar
	
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ComercioEntity editarComercio(@RequestBody ComercioEntity entity) {
		
		return comercioService.updateComercio(entity);
	}
		
	
	//Eliminar
	@GetMapping(path = "/delete/{id_comercio}")
	public void eliminarComercio(@PathVariable Integer id_comercio) {
		
		comercioService.deleteComercio(id_comercio);
		
	}

	
}
