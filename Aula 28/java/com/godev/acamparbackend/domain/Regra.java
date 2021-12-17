package com.godev.acamparbackend.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.godev.acamparbackend.dto.RegraDTO;

@Entity(name = "Regra")
@Table(name = "regra")
public class Regra implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@JsonIgnore
	@OneToMany(mappedBy = "id.regra")
	private Set<CampingRegra> campingRegras = new HashSet<>();

	private String descricao;

	public Regra() {
		super();
	}

	public Regra(Integer id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public Regra(RegraDTO regraDto) {
		super();
		this.id = regraDto.getId();
		this.descricao = regraDto.getDescricao();
	}

	@JsonIgnore
	public List<Camping> getCampings() {

		List<Camping> campings = new ArrayList<>();
		for (CampingRegra campingRegra : campingRegras) {
			campings.add(campingRegra.getCamping());
		}
		return campings;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCampings(Set<CampingRegra> campings) {
		this.campingRegras = campings;
	}

	public Set<CampingRegra> getCampingRegras() {
		return campingRegras;
	}

	public void setCampingRegras(Set<CampingRegra> campingRegras) {
		this.campingRegras = campingRegras;
	}

	@Override
	public String toString() {
		return "Regra [id=" + id + ", campingRegras=" + campingRegras + ", descricao=" + descricao + "]";
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
		Regra other = (Regra) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
