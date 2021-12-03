package br.com.senior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senior.entity.Livro;

public interface LivroRespository extends JpaRepository<Livro, Long>{

}
