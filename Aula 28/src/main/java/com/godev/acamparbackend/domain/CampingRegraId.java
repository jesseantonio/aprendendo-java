package com.godev.acamparbackend.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CampingRegraId implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "camping_id")
	private Camping camping;
	
	@ManyToOne
	@JoinColumn(name = "regra_id")
	private Regra regra;
	
	public Camping getCamping() {
		return camping;
	}
	public void setCamping(Camping camping) {
		this.camping = camping;
	}
	public Regra getRegra() {
		return regra;
	}
	public void setRegra(Regra regra) {
		this.regra = regra;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((camping == null) ? 0 : camping.hashCode());
		result = prime * result + ((regra == null) ? 0 : regra.hashCode());
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
		CampingRegraId other = (CampingRegraId) obj;
		if (camping == null) {
			if (other.camping != null)
				return false;
		} else if (!camping.equals(other.camping))
			return false;
		if (regra == null) {
			if (other.regra != null)
				return false;
		} else if (!regra.equals(other.regra))
			return false;
		return true;
	}
	
	
	
	
}
