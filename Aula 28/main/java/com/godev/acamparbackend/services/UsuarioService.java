package com.godev.acamparbackend.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.godev.acamparbackend.services.exceptions.DataIntegrityException;
import com.godev.acamparbackend.services.exceptions.ObjectNotFoundException;
import com.godev.acamparbackend.domain.Usuario;
import com.godev.acamparbackend.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;

	public Usuario find(Integer id) {
		Optional<Usuario> optional = repository.findById(id);
		return optional.orElseThrow(() -> new ObjectNotFoundException(
				"Usuario não encontrado! Id = " + id + " Tipo: " + Usuario.class.getName()));
	}

	public Usuario insert(Usuario obj) {
		obj.setId(null);
		obj.setInseridoEm(new Date());
		obj.setAtualizadoEm(new Date());
		return repository.save(obj);
	}

	public Usuario update(Usuario obj) {
		find(obj.getId());
		obj.setAtualizadoEm(new Date());
		return repository.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException(
					"Usuario não pode ser deletado por causa da integridade do banco de dados");
		}
	}

	public List<Usuario> findAll() {
		List<Usuario> usuarios = repository.findAll();
		return usuarios;
	}
	
	public Usuario findByLogin(String login) {
		return repository.findByLogin(login);
	}

	public Page<Usuario> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repository.findAll(pageRequest);
	}
}
