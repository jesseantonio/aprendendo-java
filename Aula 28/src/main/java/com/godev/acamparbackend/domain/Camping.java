package com.godev.acamparbackend.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.godev.acamparbackend.dto.CampingDTO;

@Entity(name = "Camping")
@Table(name = "camping")
public class Camping implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Usuario proprietario;

	@Column(unique = true)
	private String nome;

	private String linkImagemCapa;

	private String descricao;

	private Date dataInicialFuncionamento;

	private String coordenadas;

	private String responsavel;

	private String telefone;

	private String whatsapp;

	private String site;

	@Column(unique = true)
	private String email;

	private String facebook;

	@Column(unique = true)
	private String instagram;

	private Boolean aceitaCartao;

	private Boolean aceitaDinheiro;

	private String regulamentoInterno;

	private Boolean tomadas;

	private Boolean iluminacao;

	private Boolean pias;

	private Boolean wifi;

	private Boolean barracasParaAlugar;

	private Boolean areaParaFogueira;
	
	private Double valorDiaria;

	private String cadastradoPor;

	private Date inseridoEm;

	private Date atualizadoEm;
	


	@JsonIgnore
	@OneToMany(mappedBy = "id.camping")
	private Set<CampingRegra> campingRegras = new HashSet<CampingRegra>();

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;

	public Camping() {
		super();
	}

	public Camping(Integer id, Usuario usuario, String nome, String linkImagemCapa, String descricao, Date dataInicialFuncionamento,
			String coordenadas, String responsavel, String telefone, String whatsapp, String site, String email,
			String facebook, String instagram, Boolean aceitaCartao, Boolean aceitaDinheiro, String regulamentoInterno,
			Boolean tomadas, Boolean iluminacao, Boolean pias, Boolean wifi, Boolean barracasParaAlugar,
			Boolean areaParaFogueira, Double valorDiaria, String cadastradoPor, Date inseridoEm, Date atualizadoEm) {
		super();
		this.id = id;
		this.proprietario = usuario;
		this.nome = nome;
		this.linkImagemCapa = linkImagemCapa;
		this.descricao = descricao;
		this.dataInicialFuncionamento = dataInicialFuncionamento;
		this.coordenadas = coordenadas;
		this.responsavel = responsavel;
		this.telefone = telefone;
		this.whatsapp = whatsapp;
		this.site = site;
		this.email = email;
		this.facebook = facebook;
		this.instagram = instagram;
		this.aceitaCartao = aceitaCartao;
		this.aceitaDinheiro = aceitaDinheiro;
		this.regulamentoInterno = regulamentoInterno;
		this.tomadas = tomadas;
		this.iluminacao = iluminacao;
		this.pias = pias;
		this.wifi = wifi;
		this.barracasParaAlugar = barracasParaAlugar;
		this.areaParaFogueira = areaParaFogueira;
		this.valorDiaria = valorDiaria;
		this.cadastradoPor = cadastradoPor;
		this.inseridoEm = inseridoEm;
		this.atualizadoEm = atualizadoEm;
	}

	public Camping(CampingDTO campingDto) {
		super();
		this.id = campingDto.getId();
		this.nome = campingDto.getNome();
		this.linkImagemCapa = campingDto.getLinkImagemCapa();
		this.descricao = campingDto.getDescricao();
		this.dataInicialFuncionamento = campingDto.getDataInicialFuncionamento();
		this.coordenadas = campingDto.getCoordenadas();
		this.responsavel = campingDto.getResponsavel();
		this.telefone = campingDto.getTelefone();
		this.whatsapp = campingDto.getWhatsapp();
		this.site = campingDto.getSite();
		this.email = campingDto.getEmail();
		this.facebook = campingDto.getFacebook();
		this.instagram = campingDto.getInstagram();
		this.aceitaCartao = campingDto.getAceitaCartao();
		this.aceitaDinheiro = campingDto.getAceitaDinheiro();
		this.regulamentoInterno = campingDto.getRegulamentoInterno();
		this.tomadas = campingDto.getTomadas();
		this.iluminacao = campingDto.getIluminacao();
		this.pias = campingDto.getPias();
		this.wifi = campingDto.getWifi();
		this.barracasParaAlugar = campingDto.getBarracasParaAlugar();
		this.areaParaFogueira = campingDto.getAreaParaFogueira();
		this.valorDiaria = campingDto.getValorDiaria();
		this.cadastradoPor = campingDto.getCadastradoPor();
		this.inseridoEm = campingDto.getInseridoEm();
		this.atualizadoEm = campingDto.getAtualizadoEm();
	}

	public List<Regra> getRegras() {
		List<Regra> regras = new ArrayList<Regra>();
		for (CampingRegra campingRegra : campingRegras) {
			regras.add(campingRegra.getRegra());
		}
		return regras;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLinkImagemCapa() {
		return linkImagemCapa;
	}

	public void setLinkImagemCapa(String linkImagemCapa) {
		this.linkImagemCapa = linkImagemCapa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInicialFuncionamento() {
		return dataInicialFuncionamento;
	}

	public void setDataInicialFuncionamento(Date dataInicialFuncionamento) {
		this.dataInicialFuncionamento = dataInicialFuncionamento;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public Boolean getAceitaCartao() {
		return aceitaCartao;
	}

	public void setAceitaCartao(Boolean aceitaCartao) {
		this.aceitaCartao = aceitaCartao;
	}

	public Boolean getAceitaDinheiro() {
		return aceitaDinheiro;
	}

	public void setAceitaDinheiro(Boolean aceitaDinheiro) {
		this.aceitaDinheiro = aceitaDinheiro;
	}

	public String getRegulamentoInterno() {
		return regulamentoInterno;
	}

	public void setRegulamentoInterno(String regulamentoInterno) {
		this.regulamentoInterno = regulamentoInterno;
	}

	public Boolean getTomadas() {
		return tomadas;
	}

	public void setTomadas(Boolean tomadas) {
		this.tomadas = tomadas;
	}

	public Boolean getIluminacao() {
		return iluminacao;
	}

	public void setIluminacao(Boolean iluminacao) {
		this.iluminacao = iluminacao;
	}

	public Boolean getPias() {
		return pias;
	}

	public void setPias(Boolean pias) {
		this.pias = pias;
	}

	public Boolean getWifi() {
		return wifi;
	}

	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

	public Boolean getBarracasParaAlugar() {
		return barracasParaAlugar;
	}

	public void setBarracasParaAlugar(Boolean barracasParaAlugar) {
		this.barracasParaAlugar = barracasParaAlugar;
	}

	public Boolean getAreaParaFogueira() {
		return areaParaFogueira;
	}

	public void setAreaParaFogueira(Boolean areaParaFogueira) {
		this.areaParaFogueira = areaParaFogueira;
	}

	public String getCadastradoPor() {
		return cadastradoPor;
	}

	public void setCadastradoPor(String cadastradoPor) {
		this.cadastradoPor = cadastradoPor;
	}

	public Date getInseridoEm() {
		return inseridoEm;
	}

	public void setInseridoEm(Date inseridoEm) {
		this.inseridoEm = inseridoEm;
	}

	public Date getAtualizadoEm() {
		return atualizadoEm;
	}

	public void setAtualizadoEm(Date atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}

	public void setRegras(Set<CampingRegra> regras) {
		this.campingRegras = regras;
	}

	public Set<CampingRegra> getCampingRegras() {
		return campingRegras;
	}

	public void setCampingRegras(Set<CampingRegra> campingRegras) {
		this.campingRegras = campingRegras;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	

	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	@Override
	public String toString() {
		return "Camping [id=" + id + ", nome=" + nome + ", linkImagemCapa=" + linkImagemCapa + ", descricao="
				+ descricao + ", dataInicialFuncionamento=" + dataInicialFuncionamento + ", coordenadas=" + coordenadas
				+ ", responsavel=" + responsavel + ", telefone=" + telefone + ", whatsapp=" + whatsapp + ", site="
				+ site + ", email=" + email + ", facebook=" + facebook + ", instagram=" + instagram + ", aceitaCartao="
				+ aceitaCartao + ", aceitaDinheiro=" + aceitaDinheiro + ", regulamentoInterno=" + regulamentoInterno
				+ ", tomadas=" + tomadas + ", iluminacao=" + iluminacao + ", pias=" + pias + ", wifi=" + wifi
				+ ", barracasParaAlugar=" + barracasParaAlugar + ", areaParaFogueira=" + areaParaFogueira
				+ ", cadastradoPor=" + cadastradoPor + ", inseridoEm=" + inseridoEm + ", atualizadoEm=" + atualizadoEm
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camping other = (Camping) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Usuario getUsuario() {
		return proprietario;
	}

	public void setUsuario(Usuario usuario) {
		this.proprietario = usuario;
	}
}
