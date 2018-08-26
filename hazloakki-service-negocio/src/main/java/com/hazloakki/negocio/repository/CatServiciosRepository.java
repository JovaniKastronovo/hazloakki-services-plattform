package com.hazloakki.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hazloakki.negocio.entity.CatServiciosEntity;

public interface CatServiciosRepository extends JpaRepository<CatServiciosEntity, String>{

		List<CatServiciosEntity> findByEstatus(boolean estatus);
}
