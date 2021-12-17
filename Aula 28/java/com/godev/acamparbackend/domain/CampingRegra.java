package com.godev.acamparbackend.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.godev.acamparbackend.dto.CampingRegraDTO;

@Entity(name = "CampingRegra")
@Table(name = "campingRegra")
public class CampingRegra implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@EmbeddedId
	private CampingRegraId id = new CampingRegraId();

	private boolean valor;

	public CampingRegra() {
		// TODO Auto-generated constructor stub
	}

	public CampingRegra(CampingRegraDTO campingRegraDTO, Camping camping, Regra regra) {
		this.valor = campingRegraDTO.getValor();
		this.id = new CampingRegraId();
		this.id.setCamping(camping);
		this.id.setRegra(regra);
	}

	public CampingRegra(Camping camping, Regra regra, boolean valor) {
		super();
		this.id.setCamping(camping);
		this.id.setRegra(regra);
		this.valor = valor;
	}

	@JsonIgnore
	public Camping getCamping() {
		return id.getCamping();
	}

	@JsonIgnore
	public Regra getRegra() {
		return id.getRegra();
	}

	public CampingRegraId getId() {
		return id;
	}

	public void setId(CampingRegraId id) {
		this.id = id;
	}

	public boolean isValor() {
		return valor;
	}

	public void setValor(boolean valor) {
		this.valor = valor;
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
		CampingRegra other = (CampingRegra) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
