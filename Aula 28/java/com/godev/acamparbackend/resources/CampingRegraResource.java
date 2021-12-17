package com.godev.acamparbackend.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.godev.acamparbackend.domain.Camping;
import com.godev.acamparbackend.domain.CampingRegra;
import com.godev.acamparbackend.domain.Regra;
import com.godev.acamparbackend.dto.CampingRegraDTO;
import com.godev.acamparbackend.services.CampingRegraService;
import com.godev.acamparbackend.services.CampingService;
import com.godev.acamparbackend.services.RegraService;

@RestController
@RequestMapping(value = "/campingRegra")
public class CampingRegraResource {
	
	@Autowired
	private CampingRegraService service;
	
	@Autowired
	private CampingService campingService;
	
	@Autowired
	private RegraService regraService;


	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody CampingRegraDTO objDto) {
		Camping camping = campingService.find(objDto.getCampingId());
		Regra regra = regraService.find(objDto.getRegraId());
		
		
		CampingRegra obj = new CampingRegra(objDto, camping, regra);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(
			@RequestParam(value = "campingId", defaultValue = "") Integer campingId,
			@RequestParam(value = "regraId", defaultValue = "") Integer regraId) {
		service.delete(campingId, regraId);
		return ResponseEntity.noContent().build();

	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody CampingRegraDTO objDto) {
		Camping camping = campingService.find(objDto.getCampingId());
		Regra regra = regraService.find(objDto.getRegraId());
		
		
		CampingRegra obj = new CampingRegra(objDto, camping, regra);
		obj = service.update(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ResponseEntity<List<CampingRegraDTO>> search(
			@RequestParam(value = "campingId", defaultValue = "") Integer campingId) {
		List<CampingRegra> campingRegras = service.search(campingId);
		List<CampingRegraDTO> campingRegrasDto = campingRegras.stream()
				.map(campingRegra -> new CampingRegraDTO(campingRegra)).collect(Collectors.toList());
		return ResponseEntity.ok().body(campingRegrasDto);

	}

}
