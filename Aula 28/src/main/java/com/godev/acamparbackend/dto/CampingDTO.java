package com.godev.acamparbackend.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.godev.acamparbackend.domain.Camping;
import com.godev.acamparbackend.services.validation.CampingValidatorAnnotation;

//@CampingValidatorAnnotation
public class CampingDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotEmpty(message = "Nome não pode ser vazio")
	private String nome;

	@NotEmpty(message = "Link da imagem de capa não pode ser vazio")
	@NotBlank(message = "Link da imagem de capa não pode estar em branco")
	private String linkImagemCapa;

	@NotEmpty(message = "Descrição não pode ser vazio")
	@NotBlank(message = "Decrição não pode estar em branco")
	private String descricao;

	private Date dataInicialFuncionamento;

	private String coordenadas;

	@NotEmpty(message = "Responsável não pode ser vazio")
	@NotBlank(message = "Responsável não pode estar em branco")
	private String responsavel;

	@NotEmpty(message = "Telefone não pode ser vazio")
	@NotBlank(message = "Telefone não pode estar em branco")
	private String telefone;

	private String whatsapp;

	private String site;

	@Email(message = "Email em um formato inválido")
	private String email;

	private String facebook;

	private String instagram;

	@NotNull
	private Boolean aceitaCartao;

	@NotNull
	private Boolean aceitaDinheiro;

	private String regulamentoInterno;

	@NotNull
	private Boolean tomadas;

	@NotNull
	private Boolean iluminacao;

	@NotNull
	private Boolean pias;

	@NotNull
	private Boolean wifi;

	@NotNull
	private Boolean barracasParaAlugar;

	@NotNull
	private Boolean areaParaFogueira;
	
	@NotNull
	private Double valorDiaria;

	private String cadastradoPor;

	private Date inseridoEm;

	private Date atualizadoEm;

	public CampingDTO() {

	}

	public CampingDTO(Integer id, @NotEmpty(message = "Nome não pode ser vazio") String nome,
			@NotEmpty(message = "Link da imagem de capa não pode ser vazio") @NotBlank(message = "Link da imagem de capa não pode estar em branco") String linkImagemCapa,
			@NotEmpty(message = "Descrição não pode ser vazio") @NotBlank(message = "Decrição não pode estar em branco") String descricao,
			Date dataInicialFuncionamento, String coordenadas,
			@NotEmpty(message = "Responsável não pode ser vazio") @NotBlank(message = "Responsável não pode estar em branco") String responsavel,
			@NotNull @NotBlank @NotEmpty(message = "Telefone não pode ser vazio") @NotBlank(message = "Telefone não pode estar em branco") String telefone,
			String whatsapp, String site, @Email(message = "Email em um formato inválido") String email,
			String facebook, String instagram, @NotNull @NotBlank Boolean aceitaCartao,
			@NotNull @NotBlank Boolean aceitaDinheiro, String regulamentoInterno, @NotNull @NotBlank Boolean tomadas,
			@NotNull @NotBlank Boolean iluminacao, @NotNull @NotBlank Boolean pias, @NotNull @NotBlank Boolean wifi,
			@NotNull @NotBlank Boolean barracasParaAlugar, @NotNull @NotBlank Boolean areaParaFogueira, @NotNull Double valorDiaria,
			String cadastradoPor, Date inseridoEm, Date atualizadoEm) {
		super();
		this.id = id;
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

	public CampingDTO(Camping camping) {
		super();
		this.id = camping.getId();
		this.nome = camping.getNome();
		this.linkImagemCapa = camping.getLinkImagemCapa();
		this.descricao = camping.getDescricao();
		this.dataInicialFuncionamento = camping.getDataInicialFuncionamento();
		this.coordenadas = camping.getCoordenadas();
		this.responsavel = camping.getResponsavel();
		this.telefone = camping.getTelefone();
		this.whatsapp = camping.getWhatsapp();
		this.site = camping.getSite();
		this.email = camping.getEmail();
		this.facebook = camping.getFacebook();
		this.instagram = camping.getInstagram();
		this.aceitaCartao = camping.getAceitaCartao();
		this.aceitaDinheiro = camping.getAceitaDinheiro();
		this.regulamentoInterno = camping.getRegulamentoInterno();
		this.tomadas = camping.getTomadas();
		this.iluminacao = camping.getIluminacao();
		this.pias = camping.getPias();
		this.wifi = camping.getWifi();
		this.barracasParaAlugar = camping.getBarracasParaAlugar();
		this.areaParaFogueira = camping.getAreaParaFogueira();
		this.valorDiaria = camping.getValorDiaria();
		this.cadastradoPor = camping.getCadastradoPor();
		this.inseridoEm = camping.getInseridoEm();
		this.atualizadoEm = camping.getAtualizadoEm();
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

	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
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
}
