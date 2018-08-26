package com.hazloakki.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hazloakki.negocio.entity.NegociosServiciosEntity;
import com.hazloakki.negocio.entity.NegociosServiciosKey;

@Repository
public interface NegocioServiciosRepository 
	extends JpaRepository<NegociosServiciosEntity, NegociosServiciosKey> {

	
}
