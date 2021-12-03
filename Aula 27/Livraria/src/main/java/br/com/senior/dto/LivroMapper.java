package br.com.senior.dto;

import org.springframework.stereotype.Service;

import br.com.senior.entity.Livro;

@Service
public class LivroMapper {

	public LivroDTO toDTO(Livro livro) {
		LivroDTO lvdto = new LivroDTO();
		lvdto.descricao = livro.getDescricao();
		lvdto.titulo = livro.getTitulo();
		return lvdto;
	}

	public Livro toEntity(LivroDTO livroDto) {
		Livro livro = new Livro();
		livro.setDescricao(livroDto.descricao);
		livro.setTitulo(livroDto.titulo);

		return livro;
	}
}
