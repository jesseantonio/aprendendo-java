package com.godev.acamparbackend.dto;

import com.godev.acamparbackend.domain.CampingRegra;

public class CampingRegraDTO {

	public Integer campingId;
	public Integer regraId;
	public Boolean valor;

	public CampingRegraDTO() {
	}

	public CampingRegraDTO(CampingRegra campingRegra) {
		this.campingId = campingRegra.getCamping().getId();
		this.regraId = campingRegra.getRegra().getId();
		this.valor = campingRegra.isValor();
	}

	public CampingRegraDTO(Integer campingId, Integer regraId, Boolean valor) {
		super();
		this.campingId = campingId;
		this.regraId = regraId;
		this.valor = valor;
	}

	public Integer getCampingId() {
		return campingId;
	}

	public void setCampingId(Integer campingId) {
		this.campingId = campingId;
	}

	public Integer getRegraId() {
		return regraId;
	}

	public void setRegraId(Integer regraId) {
		this.regraId = regraId;
	}

	public Boolean getValor() {
		return valor;
	}

	public void setValor(Boolean valor) {
		this.valor = valor;
	}

}
