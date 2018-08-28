package com.hazloakki.negocio.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="negocios_tarjetas")
public class NegociosTarjetasPagoEntity {

	@EmbeddedId
	private NegociosTarjetasPagoKey negociosTarjetasPagoKey;

	public NegociosTarjetasPagoKey getNegociosTarjetasPagoKey() {
		return negociosTarjetasPagoKey;
	}

	public void setNegociosTarjetasPagoKey(NegociosTarjetasPagoKey negociosTarjetasPagoKey) {
		this.negociosTarjetasPagoKey = negociosTarjetasPagoKey;
	}

}
