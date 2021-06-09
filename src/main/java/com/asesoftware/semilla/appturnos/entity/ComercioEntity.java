package com.asesoftware.semilla.appturnos.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "comercios")

public class ComercioEntity {

	@Id
	@Column(name = "id_comercio")
	private Integer id_comercio;
	
	@Column(name = "nom_comercio")
	private String nom_comercio;
	
	@Column(name = "aforo_maximo")
	private Integer aforo_maximo;

	//Almacenar servicios relacionados al Comercio
	@OneToMany(mappedBy = "id_comercio")
	private List<ServicioEntity> servicios;
	
	
}
