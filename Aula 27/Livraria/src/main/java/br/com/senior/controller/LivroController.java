package br.com.senior.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senior.dto.LivroDTO;
import br.com.senior.dto.LivroMapper;
import br.com.senior.entity.Livro;
import br.com.senior.service.LivroService;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {

	@Autowired
	private LivroService livroService;
	
	@Autowired
	private LivroMapper livroMapper;
	
	@GetMapping(value = "/dto")
	public ResponseEntity<List<LivroDTO>> findAllDto(){
		List<Livro> livros = livroService.findAll();
		List<LivroDTO> livrosConvertidos = new ArrayList<LivroDTO>(); 
		for (Livro livro : livros) {
			livrosConvertidos.add(livroMapper.toDTO(livro));
		}
		return ResponseEntity.ok().body(livrosConvertidos);
	}
	
	@GetMapping()
	public ResponseEntity<List<Livro>> findAll(){
		List<Livro> livros = livroService.findAll();
		return ResponseEntity.ok().body(livros);
	}
	
	@GetMapping(value = "/dto/{id}")
	public ResponseEntity<LivroDTO> findByIdDto(@PathVariable Long id){
		Livro livro = livroService.findById(id);
		LivroDTO lvdto = livroMapper.toDTO(livro);
		return ResponseEntity.ok().body(lvdto);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Livro> findById(@PathVariable Long id){
		Livro livro = livroService.findById(id);
		return ResponseEntity.ok().body(livro);
	}
	
	@PostMapping
	public ResponseEntity<Livro> insert(@RequestBody Livro livro) {
		livro = livroService.insert(livro);
		return ResponseEntity.ok().body(livro);
	}
	
	@PostMapping(value = "/dto")
	public ResponseEntity<Livro> insert(@RequestBody LivroDTO livrodto) {
		Livro livro = livroMapper.toEntity(livrodto);
		livro = livroService.insert(livro);
		return ResponseEntity.ok().body(livro);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Livro> update(@RequestBody Livro livro,@PathVariable Long id){
		livro = livroService.update(id, livro);
		return ResponseEntity.ok().body(livro);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		livroService.delete(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
}
