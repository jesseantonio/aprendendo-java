package com.godev.acamparbackend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.godev.acamparbackend.services.exceptions.DataIntegrityException;
import com.godev.acamparbackend.services.exceptions.ObjectNotFoundException;
import com.godev.acamparbackend.domain.Camping;
import com.godev.acamparbackend.domain.CampingRegra;
import com.godev.acamparbackend.domain.Regra;
import com.godev.acamparbackend.repositories.CampingRegraRepository;
import com.godev.acamparbackend.repositories.CampingRepository;

@Service
public class CampingService {

	@Autowired
	private CampingRepository repository;

	@Autowired
	CampingRegraRepository campingRegraRepository;

	public Camping find(Integer id) {
		Optional<Camping> optional = repository.findById(id);
		return optional.orElseThrow(() -> new ObjectNotFoundException(
				"Camping não encontrado! Id = " + id + " Tipo: " + Camping.class.getName()));
	}

	public Camping insert(Camping obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public Camping update(Camping obj) {
		find(obj.getId());
		return repository.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException(
					"Camping não pode ser deletado por causa da integridade do banco de dados");
		}
	}

	public List<Camping> findAll() {
		List<Camping> campings = repository.findAll();
		return campings;
	}
	

	
	
//	public Camping findByEmail(String email) {
//		Camping campingsEmail = repository.findByEmail(email);
//		return campingsEmail;
//	}
	
	
	

	public Page<Camping> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {

		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);

		return repository.findAll(pageRequest);

	}

	public Page<Camping> search(List<Integer> regrasIds, Integer page, Integer linesPerPage, String orderBy,
			String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);

		List<CampingRegra> campingRegras = campingRegraRepository.findAllCampingRegraByRegraId(regrasIds);
		List<Regra> regras = campingRegras.stream().map(x -> x.getRegra()).collect(Collectors.toList());

		return repository.search(regras, pageRequest);
	}

	public List<Camping> serviceTestRepository() {
		List<Camping> campings = repository.buscarCampingComCartao(10.0d);
		return campings;
	}
	
}
