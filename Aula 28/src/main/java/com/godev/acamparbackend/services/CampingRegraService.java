package com.godev.acamparbackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.godev.acamparbackend.services.exceptions.DataIntegrityException;
import com.godev.acamparbackend.services.exceptions.ObjectNotFoundException;
import com.godev.acamparbackend.domain.Camping;
import com.godev.acamparbackend.domain.CampingRegra;
import com.godev.acamparbackend.repositories.CampingRegraRepository;

@Service
public class CampingRegraService {

	@Autowired
	private CampingRegraRepository repository;
	
	public CampingRegra find(Integer id) {
		Optional<CampingRegra> optional = repository.findById(id);
		return optional.orElseThrow(() -> new ObjectNotFoundException(
				"CampingRegra não encontrado! Id = " + id + " Tipo: " + Camping.class.getName()));
	}
	
	public CampingRegra insert(CampingRegra obj) {
		return repository.save(obj);
	}

	public CampingRegra update(CampingRegra obj) {
		return repository.save(obj);
	}

	public void delete(Integer campingId, Integer regraId) {
		try {
			//repository.deleteByCampingIdAndRegraId(campingId, regraId);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException(
					"Camping não pode ser deletado por causa da integridade do banco de dados");
		}
	}

	public List<CampingRegra> findAll() {
		List<CampingRegra> campingRegras = repository.findAll();
		return campingRegras;
	}
	
	public List<CampingRegra> search(Integer campingId) {
		List<CampingRegra> campingRegras = repository.findAllCampingRegraByCampingId(campingId);
		return campingRegras;
	}

}
