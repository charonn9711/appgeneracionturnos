package com.asesoftware.semilla.appturnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.semilla.appturnos.entity.ServicioEntity;

public interface IServicioRepository extends JpaRepository<ServicioEntity, Integer> {
	

}
