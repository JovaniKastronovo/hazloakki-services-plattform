package com.hazloakki.negocio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazloakki.negocio.categorias.api.CategoriasNegociosException;
import com.hazloakki.negocio.entity.CatTipoNegocioEntity;
import com.hazloakki.negocio.repository.CatTipoNegocioRepository;

@Service
public class CatTipoNegocioServiceImpl implements CatTipoNegocioService {

	@Autowired
	private CatTipoNegocioRepository catTipoNegocioRepository;

	@Override
	public List<CatTipoNegocioEntity> obtenerTipoNegocioAll() {

		return catTipoNegocioRepository.findAll();
	}

	@Override
	public CatTipoNegocioEntity obtenerTipoNegocioById(Integer idCategoria) {

		return catTipoNegocioRepository.findByIdCategoria(idCategoria)
				.orElseThrow(() -> CategoriasNegociosException.from(
						"No se encontro la categoria de negocio soliciada :" + String.valueOf(idCategoria),
						String.valueOf(idCategoria)));
	}

}
