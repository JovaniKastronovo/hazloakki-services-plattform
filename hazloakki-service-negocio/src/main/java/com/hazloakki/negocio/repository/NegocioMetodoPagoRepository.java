package com.hazloakki.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hazloakki.negocio.entity.MetodoPagoEntity;
import com.hazloakki.negocio.entity.NegocioMetodoPagoKey;

@Repository
public interface NegocioMetodoPagoRepository 
					extends JpaRepository<MetodoPagoEntity, NegocioMetodoPagoKey> {

}
