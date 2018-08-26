package com.hazloakki.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hazloakki.negocio.entity.NegociosTarjetasPagoEntity;
import com.hazloakki.negocio.entity.NegociosTarjetasPagoKey;

public interface NegocioTarjetasPagoRepository extends JpaRepository<NegociosTarjetasPagoEntity, NegociosTarjetasPagoKey> {

}
