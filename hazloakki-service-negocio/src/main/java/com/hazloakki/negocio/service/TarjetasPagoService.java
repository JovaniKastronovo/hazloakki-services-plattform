package com.hazloakki.negocio.service;

import java.util.List;

import com.hazloakki.negocio.modelo.TipoTarjetaDto;

public interface TarjetasPagoService {
	
	List<TipoTarjetaDto> obtenerTipoTarjetaActivas();

}
