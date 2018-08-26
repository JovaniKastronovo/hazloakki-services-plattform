package com.hazloakki.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hazloakki.negocio.entity.CatMetodoPagoEntity;
@Repository
public interface CatMetodoPagoRepository extends JpaRepository<CatMetodoPagoEntity, String>{
	
	public List<CatMetodoPagoEntity> findByEstatus(boolean estatus);
}
