package com.godev.acamparbackend.services;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godev.acamparbackend.domain.Camping;
import com.godev.acamparbackend.domain.CampingRegra;
import com.godev.acamparbackend.domain.Endereco;
import com.godev.acamparbackend.domain.Regra;
import com.godev.acamparbackend.domain.Usuario;
import com.godev.acamparbackend.repositories.CampingRegraRepository;
import com.godev.acamparbackend.repositories.CampingRepository;
import com.godev.acamparbackend.repositories.EnderecoRepository;
import com.godev.acamparbackend.repositories.RegraRepository;
import com.godev.acamparbackend.repositories.UsuarioRepository;

@Service
public class DBService {
	
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private RegraRepository regraRepository;

	@Autowired
	private CampingRepository campingRepository;

//	@Autowired
//	private EstadoRepository estadoRepository;

//	@Autowired
//	private MunicipioRepository municipioRepository;

	@Autowired
	private CampingRegraRepository campingRegraRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public void instantiateTestDatabase() {

		Regra regra1 = new Regra(null, "Camping é rígido com poluição sonora?");
		Regra regra2 = new Regra(null, "Camping aceita animais?");
		Regra regra3 = new Regra(null, "Camping é rígido com relação as regras?");
		Regra regra4 = new Regra(null, "Camping aceita mensalistas?");
		Regra regra5 = new Regra(null, "Camping permite a entrada de pessoas sem identificação?");
		Regra regra6 = new Regra(null,
				"Camping permite o uso indevido dos espaços? (Ex: número excedente de pessoas nas barracas)");
		Regra regra7 = new Regra(null, "Camping permite som automotivo?");
		Regra regra8 = new Regra(null, "Camping permite visitações de pessoas externas?");
		Regra regra9 = new Regra(null, "Camping possui preocupação com o meio ambiente?");

		regraRepository.saveAll(Arrays.asList(regra1, regra2, regra3, regra4, regra5, regra6, regra7, regra8, regra9));

		Usuario usuario1 = new Usuario();
		usuario1.setLogin("usuario1");
		usuario1.setEmail("usuario1@gmail.com");
		usuario1.setNome("usuario1");
//		usuario1.setSenha(bCryptPasswordEncoder.encode("senha4"));
		usuario1.setInseridoEm(new Date());
		usuario1.setAtualizadoEm(new Date());
		
		Usuario usuario2 = new Usuario();
		usuario2.setLogin("usuario2");
		usuario2.setEmail("usuario2@gmail.com");
		usuario2.setNome("usuario2");
//		usuario2.setSenha(bCryptPasswordEncoder.encode("senha4"));
		usuario2.setInseridoEm(new Date());
		usuario2.setAtualizadoEm(new Date());
		
		Usuario usuario3 = new Usuario();
		usuario3.setLogin("usuario3");
		usuario3.setEmail("usuario3@gmail.com");
		usuario3.setNome("usuario3");
//		usuario3.setSenha(bCryptPasswordEncoder.encode("senha4"));
		usuario3.setInseridoEm(new Date());
		usuario3.setAtualizadoEm(new Date());
		
		Usuario usuario4 = new Usuario();
		usuario4.setLogin("usuario4");
		usuario4.setEmail("usuario4@gmail.com");
		usuario4.setNome("usuario4");
//		usuario4.setSenha(bCryptPasswordEncoder.encode("senha4"));
		usuario4.setInseridoEm(new Date());
		usuario4.setAtualizadoEm(new Date());
		
		usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2, usuario3));
		
		Camping c1 = new Camping();
		c1.setUsuario(usuario1);
		c1.setAceitaCartao(true);
		c1.setAceitaDinheiro(true);
		c1.setAreaParaFogueira(true);
		c1.setAtualizadoEm(new Date());
		c1.setBarracasParaAlugar(true);
		c1.setCadastradoPor("Marcio Michelluzzi");
		c1.setCoordenadas("-26.9139754,-49.0716105");
		c1.setDataInicialFuncionamento(new Date());
		c1.setDescricao(
				"Nossa área de Camping, tem toda estrutura necessária, para que você tenha uma estadia confortável e tranquila");
		c1.setEmail("contato@imperialgreen.com.br");
		c1.setFacebook("https://www.facebook.com/imperialgreenpark/");
		c1.setIluminacao(true);
		c1.setInseridoEm(new Date());
		c1.setInstagram("asdadasaaaa");
		c1.setLinkImagemCapa("https://ondeacampar.com.br/wp-content/uploads/Imperial-Green-Camping-20.jpg");
		c1.setNome("IMPERIAL GREEN");
		c1.setPias(true);
		c1.setRegulamentoInterno("Aceita animais com restrição: Os animais não poderão ficar soltos.");
		c1.setResponsavel("Marcio");
		c1.setTelefone("");
		c1.setWifi(true);
		c1.setTomadas(true);

		Camping c2 = new Camping();
		c2.setUsuario(usuario3);
		c2.setAceitaCartao(true);
		c2.setAceitaDinheiro(true);
		c2.setAreaParaFogueira(true);
		c2.setAtualizadoEm(new Date());
		c2.setBarracasParaAlugar(true);
		c2.setCadastradoPor("TESTE");
		c2.setCoordenadas("-26.9139754,-49.0716105");
		c2.setDataInicialFuncionamento(new Date());
		c2.setDescricao("TESTE");
		c2.setEmail("TESTE");
		c2.setFacebook("TESTE");
		c2.setIluminacao(true);
		c2.setInseridoEm(new Date());
		c2.setInstagram("sajdfhjsdkfdsf");
		c2.setLinkImagemCapa("hTEST");
		c2.setNome("TESTE");
		c2.setPias(true);
		c2.setRegulamentoInterno("Aceita animais com restrição: Os animais não poderão ficar soltos.");
		c2.setResponsavel("TESTE");
		c2.setTelefone("");
		c2.setWifi(true);
		c2.setTomadas(true);

		Endereco ed1 = new Endereco();
		ed1.setBairro("Sete de janeiro");
		ed1.setCep("89012500");
		ed1.setComplemento("Sem complemento");
		ed1.setLogradouro("Rua sete de janeiro");
		ed1.setNumero("Sem numero");

		Endereco ed2 = new Endereco();
		ed2.setBairro("Victor Konder");
		ed2.setCep("89012510");
		ed2.setComplemento("Apto 10");
		ed2.setLogradouro("Rua Max Hering");
		ed2.setNumero("474");

		enderecoRepository.saveAll(Arrays.asList(ed1, ed2));

		c1.setEndereco(ed1);
		c2.setEndereco(ed2);
		campingRepository.saveAll(Arrays.asList(c1, c2));

		CampingRegra cr1 = new CampingRegra(c1, regra6, true);
		CampingRegra cr2 = new CampingRegra(c1, regra2, true);
		CampingRegra cr3 = new CampingRegra(c1, regra1, true);
		CampingRegra cr4 = new CampingRegra(c2, regra1, true);
		CampingRegra cr5 = new CampingRegra(c2, regra8, true);

		c2.getCampingRegras().addAll(Arrays.asList(cr4, cr5));
		c1.getCampingRegras().addAll(Arrays.asList(cr1, cr2, cr3));

		regra1.getCampingRegras().addAll(Arrays.asList(cr4, cr3));
		regra2.getCampingRegras().addAll(Arrays.asList(cr2));
		regra6.getCampingRegras().addAll(Arrays.asList(cr1));
		regra8.getCampingRegras().addAll(Arrays.asList(cr5));

		campingRegraRepository.saveAll(Arrays.asList(cr1, cr2, cr3, cr4, cr5));

	}

}
