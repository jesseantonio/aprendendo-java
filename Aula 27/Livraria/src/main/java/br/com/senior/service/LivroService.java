package br.com.senior.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senior.entity.Livro;
import br.com.senior.exception.LivroDescricaoException;
import br.com.senior.exception.LivroIsbnException;
import br.com.senior.repository.LivroRespository;

@Service
public class LivroService {

	@Autowired
	private LivroRespository livroRepository;
	
	public List<Livro> findAll(){
		return livroRepository.findAll();
	}
	
	public Livro findById(Long id) {
		Optional<Livro> livro = livroRepository.findById(id);
		return livro.get();
	}
	
	public Livro insert(Livro livro) {
		if(livro.getIsbn().length() >= 13 || livro.getIsbn().length() == 0) {
			throw new LivroIsbnException(null);
		}
		if(livro.getDescricao().length() > 40) {
			throw new LivroDescricaoException("Wrong amount of characters");
		}
		return livroRepository.save(livro);
	}
	
	public Livro update(Long id, Livro livro) {
		Livro lv = livroRepository.getById(id);
		lv.setDescricao(livro.getDescricao());
		lv.setIsbn(livro.getIsbn());
		lv.setTitulo(livro.getTitulo());
		return livroRepository.save(lv);
	}
	
	public void delete(Long id) {
		Livro obj = livroRepository.getById(id);
		livroRepository.delete(obj);
	}
}
