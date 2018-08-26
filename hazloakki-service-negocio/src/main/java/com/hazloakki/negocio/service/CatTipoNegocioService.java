package com.hazloakki.negocio.service;

import java.util.List;

import com.hazloakki.negocio.entity.CatTipoNegocioEntity;

public interface CatTipoNegocioService {
	
	List<CatTipoNegocioEntity> obtenerTipoNegocioAll();
	CatTipoNegocioEntity obtenerTipoNegocioById(Integer idCategoria);
}
