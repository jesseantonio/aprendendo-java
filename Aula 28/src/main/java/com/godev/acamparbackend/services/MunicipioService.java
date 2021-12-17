package com.godev.acamparbackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godev.acamparbackend.services.exceptions.ObjectNotFoundException;
import com.godev.acamparbackend.domain.Municipio;
import com.godev.acamparbackend.repositories.MunicipioRepository;

@Service
public class MunicipioService {

	@Autowired
	private MunicipioRepository repository;

	public Municipio buscar(Integer id) {
		Optional<Municipio> optional = repository.findById(id);
		return optional.orElseThrow(() -> new ObjectNotFoundException(
				"Municipio não encontrado! Id = " + id + "Tipo: " + Municipio.class.getName()));
	}

}
