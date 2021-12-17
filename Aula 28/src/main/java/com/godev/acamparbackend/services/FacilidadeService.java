package com.godev.acamparbackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godev.acamparbackend.services.exceptions.ObjectNotFoundException;
import com.godev.acamparbackend.domain.Facilidade;
import com.godev.acamparbackend.repositories.FacilidadeRepository;

@Service
public class FacilidadeService {

	@Autowired
	private FacilidadeRepository repository;

	public Facilidade buscar(Integer id) {
		Optional<Facilidade> optional = repository.findById(id);
		return optional.orElseThrow(() -> new ObjectNotFoundException(
				"Facilidade não encontrado! Id = " + id + "Tipo: " + Facilidade.class.getName()));
	}

}
