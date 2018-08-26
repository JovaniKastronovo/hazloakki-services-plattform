package com.hazloakki.negocio.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="negocios_servicios")
public class NegociosServiciosEntity {


	@Version
	private Long version;
	@EmbeddedId
	private NegociosServiciosKey negociosServiciosKey;

	public NegociosServiciosKey getNegociosServiciosKey() {
		return negociosServiciosKey;
	}

	public void setNegociosServiciosKey(NegociosServiciosKey negociosServiciosKey) {
		this.negociosServiciosKey = negociosServiciosKey;
	}

}
