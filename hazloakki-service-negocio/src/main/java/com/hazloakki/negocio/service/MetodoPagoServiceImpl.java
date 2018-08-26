package com.hazloakki.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazloakki.negocio.entity.CatMetodoPagoEntity;
import com.hazloakki.negocio.modelo.MetodoPagoDto;
import com.hazloakki.negocio.repository.CatMetodoPagoRepository;
@Service
public class MetodoPagoServiceImpl implements MetodoPagoService {

	@Autowired
	private CatMetodoPagoRepository catMetodoPagoRepository;

	@Override
	public List<MetodoPagoDto> obtenerMetodosPago() {

		List<CatMetodoPagoEntity> meEntities = catMetodoPagoRepository.findByEstatus(Boolean.TRUE);
		List<MetodoPagoDto> metodosPago = new ArrayList<>();

		for (CatMetodoPagoEntity data : meEntities) {
			metodosPago.add(data.to());
		}

		return metodosPago;
	}

}
