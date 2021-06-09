package com.asesoftware.semilla.appturnos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "servicios")
public class ServicioEntity {
	
	@Id
	@Column(name = "id_servicio")
	private Integer id_servicio;
	
	@Column(name = "nom_servicio")
	private String nom_servicio;
	
	@Column(name = "duracion")
	private Integer duracion;
	
	@Column(name = "id_comercio")
	private Integer id_comercio;

}
