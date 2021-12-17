package com.godev.acamparbackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godev.acamparbackend.services.exceptions.ObjectNotFoundException;
import com.godev.acamparbackend.domain.Endereco;
import com.godev.acamparbackend.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repository;

	public Endereco buscar(Integer id) {
		Optional<Endereco> optional = repository.findById(id);
		return optional.orElseThrow(() -> new ObjectNotFoundException(
				"Endereço não encontrado! Id = " + id + "Tipo: " + Endereco.class.getName()));
	}

}
