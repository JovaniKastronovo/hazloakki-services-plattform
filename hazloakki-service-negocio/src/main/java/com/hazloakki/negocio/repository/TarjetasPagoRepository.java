package com.hazloakki.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hazloakki.negocio.entity.CatTipoTarjetaEntity;

public interface TarjetasPagoRepository extends JpaRepository<CatTipoTarjetaEntity, String>{

	List<CatTipoTarjetaEntity> findByEstatus(boolean estatus);
}
