package com.asesoftware.semilla.appturnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.appturnos.entity.ComercioEntity;
import com.asesoftware.semilla.appturnos.repository.IComercioRepository;

@Service
public class ComercioService implements IComercioService {
	
	@Autowired
	private IComercioRepository comercioRepository;
	

	@Override
	public List<ComercioEntity> getAll() {
		
		return comercioRepository.findAll();
	}

	@Override
	public ComercioEntity getComercioById(Integer id_comercio) {
	
		Optional<ComercioEntity> optional =comercioRepository.findById(id_comercio);
		
		if(optional.isPresent()) {
			return optional.get();			
		}else {
			return null ;
		}
	}

	@Override
	public ComercioEntity createComercio(ComercioEntity comercioEntity) {
		
		
		try {
			return comercioRepository.save(comercioEntity);
		}catch(Exception e) {
			return null;
		}
	}

	@Override
	public ComercioEntity updateComercio(ComercioEntity comercioEntity) {
		
		return comercioRepository.save(comercioEntity);
	}

	@Override
	public void deleteComercio(Integer id_comercio) {
		
		comercioRepository.deleteById(id_comercio);
	}

}
