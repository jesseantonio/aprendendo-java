package com.godev.acamparbackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godev.acamparbackend.services.exceptions.ObjectNotFoundException;
import com.godev.acamparbackend.domain.Estado;
import com.godev.acamparbackend.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repository;

	public Estado buscar(Integer id) {
		Optional<Estado> optional = repository.findById(id);
		return optional.orElseThrow(() -> new ObjectNotFoundException(
				"Estado não encontrado! Id = " + id + "Tipo: " + Estado.class.getName()));
	}

}
