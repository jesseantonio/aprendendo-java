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

import com.godev.acamparbackend.resources.utils.URL;
import com.godev.acamparbackend.domain.Camping;
import com.godev.acamparbackend.dto.CampingDTO;
import com.godev.acamparbackend.services.CampingService;

@RestController
@RequestMapping(value = "/campings")
public class CampingResource {

	@Autowired
	private CampingService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<CampingDTO> find(@PathVariable Integer id) {
		Camping camping = service.find(id);
		CampingDTO campingDTO = new CampingDTO(camping);
		return ResponseEntity.ok().body(campingDTO);

	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody CampingDTO objDto) {
		Camping obj = new Camping(objDto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}


	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody CampingDTO objDto, @PathVariable Integer id) {
		Camping obj = new Camping(objDto);
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();

	}

//	@RequestMapping(value = "/{email}", method = RequestMethod.GET)
//	public ResponseEntity<Camping> findByEmail(@PathVariable String email) {
//		Camping campingsEmail = service.findByEmail(email);
//		return ResponseEntity.ok().body(campingsEmail);
//	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<CampingDTO>> findAll() {
		List<Camping> campings = service.findAll();
		List<CampingDTO> campingsDto = campings.stream().map(camping -> new CampingDTO(camping))
				.collect(Collectors.toList());
		return ResponseEntity.ok().body(campingsDto);
	}

	
	
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ResponseEntity<Page<CampingDTO>> findPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "id") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {
		Page<Camping> campings = service.findPage(page, linesPerPage, orderBy, direction);
		Page<CampingDTO> campingsDto = campings.map(camping -> new CampingDTO(camping));
		return ResponseEntity.ok().body(campingsDto);
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ResponseEntity<Page<CampingDTO>> search(
			@RequestParam(value = "regrasIds", defaultValue = "") String regrasIds,
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "id") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {

		List<Integer> ids = URL.decodeIntegerList(regrasIds);
		Page<Camping> campings = service.search(ids, page, linesPerPage, orderBy, direction);
		Page<CampingDTO> campingsDto = campings.map(camping -> new CampingDTO(camping));
		
		return ResponseEntity.ok().body(campingsDto);
	}
	
	@RequestMapping(value = "/testeRepository", method = RequestMethod.GET)
	public ResponseEntity<List<CampingDTO>> testeRepository() {
		List<Camping> campings = service.serviceTestRepository();
		List<CampingDTO> campingsDto = campings.stream().map(camping -> new CampingDTO(camping))
				.collect(Collectors.toList());
		return ResponseEntity.ok().body(campingsDto);
	}
	
	
}
