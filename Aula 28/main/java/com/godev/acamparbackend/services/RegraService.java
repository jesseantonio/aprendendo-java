package com.godev.acamparbackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.godev.acamparbackend.services.exceptions.DataIntegrityException;
import com.godev.acamparbackend.services.exceptions.ObjectNotFoundException;
import com.godev.acamparbackend.domain.Regra;
import com.godev.acamparbackend.repositories.RegraRepository;

@Service
public class RegraService {

	@Autowired
	private RegraRepository repository;

	public Regra find(Integer id) {
		Optional<Regra> optional = repository.findById(id);
		return optional.orElseThrow(() -> new ObjectNotFoundException(
				"Regra não encontrada! Id = " + id + " Tipo: " + Regra.class.getName()));
	}
	
	public Regra insert(Regra obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	
	public Regra update(Regra obj) {
		find(obj.getId());
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Regra não pode ser deletado por causa da integridade do banco de dados");
		}
	}
	
	public List<Regra> findAll() {
		List<Regra> regras = repository.findAll();
		return regras;
	}
	
	public Page<Regra> findPage(Integer page, Integer linesPerPage, String orderBy, String direction){
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repository.findAll(pageRequest);
	}
}
