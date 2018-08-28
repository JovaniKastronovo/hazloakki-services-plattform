package com.hazloakki.negocio.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

import com.hazloakki.negocio.modelo.ServiciosDto;

@Entity
@Table(name = "negocios_servicios")
public class NegociosServiciosEntity {


	@EmbeddedId
	private NegociosServiciosKey negociosServiciosKey;

	public ServiciosDto to() {
		ServiciosDto serviciosDto = new ServiciosDto();

		return serviciosDto;
	}

	public NegociosServiciosKey getNegociosServiciosKey() {
		return negociosServiciosKey;
	}

	public void setNegociosServiciosKey(NegociosServiciosKey negociosServiciosKey) {
		this.negociosServiciosKey = negociosServiciosKey;
	}

}
