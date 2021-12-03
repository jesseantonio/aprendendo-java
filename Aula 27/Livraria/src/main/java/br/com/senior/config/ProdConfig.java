package br.com.senior.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;

import br.com.senior.entity.Livro;
import br.com.senior.repository.LivroRespository;

@Profile("prod")
public class ProdConfig implements CommandLineRunner{

	@Autowired
	private LivroRespository lr;
	
	@Override
	public void run(String... args) throws Exception {
		Livro l1 = new Livro(null,"LivroProd-1","prod1","12345678910");
		Livro l2 = new Livro(null,"LivroProd-2","prod2","62445678910");
		Livro l3 = new Livro(null,"LivroProd-3","prod3","14365879910");

		lr.saveAll(Arrays.asList(l1,l2,l3));
	}

	
}
