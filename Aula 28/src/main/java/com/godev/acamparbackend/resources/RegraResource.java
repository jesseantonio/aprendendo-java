package com.godev.acamparbackend.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.godev.acamparbackend.domain.Regra;
import com.godev.acamparbackend.dto.RegraDTO;
import com.godev.acamparbackend.services.RegraService;

@RestController
@RequestMapping(value = "/regras")
public class RegraResource {

	@Autowired
	private RegraService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<RegraDTO> find(@PathVariable Integer id) {
		Regra obj = service.find(id);
		RegraDTO objDto = new RegraDTO(obj);
		return ResponseEntity.ok().body(objDto);

	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody RegraDTO objDto) {
		Regra obj = new Regra(objDto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody RegraDTO objDto, @PathVariable Integer id) {
		Regra obj = new Regra(objDto);
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<RegraDTO>> findAll() {
		List<Regra> regras = service.findAll();
		List<RegraDTO> regrasDto = regras.stream().map(regra -> new RegraDTO(regra)).collect(Collectors.toList());
		return ResponseEntity.ok().body(regrasDto);
	}

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ResponseEntity<Page<RegraDTO>> findPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "id") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {
		Page<Regra> regras = service.findPage(page, linesPerPage, orderBy, direction);
		Page<RegraDTO> regrasDto = regras.map(regra -> new RegraDTO(regra));
		return ResponseEntity.ok().body(regrasDto);
	}

}
