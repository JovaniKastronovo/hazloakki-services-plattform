package com.hazloakki.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hazloakki.negocio.entity.NegociosTarjetasPagoEntity;
import com.hazloakki.negocio.entity.NegociosTarjetasPagoKey;
@Repository
public interface NegocioTarjetasPagoRepository extends JpaRepository<NegociosTarjetasPagoEntity, NegociosTarjetasPagoKey> {

}
