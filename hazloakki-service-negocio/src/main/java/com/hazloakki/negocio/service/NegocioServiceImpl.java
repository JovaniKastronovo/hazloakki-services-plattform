package com.hazloakki.negocio.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazloakki.negocio.api.NegocioException;
import com.hazloakki.negocio.entity.MetodoPagoEntity;
import com.hazloakki.negocio.entity.NegocioEntity;
import com.hazloakki.negocio.entity.NegocioMetodoPagoKey;
import com.hazloakki.negocio.entity.NegociosServiciosEntity;
import com.hazloakki.negocio.entity.NegociosServiciosKey;
import com.hazloakki.negocio.entity.NegociosTarjetasPagoEntity;
import com.hazloakki.negocio.entity.NegociosTarjetasPagoKey;
import com.hazloakki.negocio.modelo.MetodoPagoDto;
import com.hazloakki.negocio.modelo.NegocioDto;
import com.hazloakki.negocio.modelo.ServiciosDto;
import com.hazloakki.negocio.modelo.TipoTarjetaDto;
import com.hazloakki.negocio.repository.NegocioMetodoPagoRepository;
import com.hazloakki.negocio.repository.NegocioRepository;
import com.hazloakki.negocio.repository.NegocioServiciosRepository;
import com.hazloakki.negocio.repository.NegocioTarjetasPagoRepository;
import com.hazloakki.negocio.service.remotos.OfertaDto;
import com.hazloakki.negocio.service.remotos.OfertasNegociosApiClient;

/**
 * @author Jovani Arzate 2018-07-01 HazloAkki para Empresas v.1
 *
 */
@Service
public class NegocioServiceImpl implements NegocioService {

	@Autowired
	private NegocioRepository negocioRepository;
	@Autowired
	private OfertasNegociosApiClient ofertasNegociosApiClient;
	@Autowired
	private NegocioServiciosRepository negocioServiciosRepository;
	@Autowired
	private NegocioMetodoPagoRepository negocioMetodoPagoRepository;
	@Autowired
	private NegocioTarjetasPagoRepository negocioTarjetasPagoRepository;
	
	

	@Transactional
	@Override
	public NegocioEntity guardarNegocio(NegocioDto negocioDto) {
		NegocioEntity negocioEntity = NegocioEntity.from(negocioDto);

		NegocioEntity negocioEntity2 = negocioRepository.save(negocioEntity);
		
		try {
			/*
			 * Servicios por negocio
			 */

			for (ServiciosDto serviciosDto : negocioDto.getServiciosList()) {
				NegociosServiciosKey serviciosKey = new NegociosServiciosKey();
				serviciosKey.setIdNegocio(negocioEntity2.getId());
				serviciosKey.setIdServicio(serviciosDto.getId());

				NegociosServiciosEntity serviciosEntity = new NegociosServiciosEntity();
				serviciosEntity.setNegociosServiciosKey(serviciosKey);
				negocioServiciosRepository.save(serviciosEntity);
			}

			/*
			 * Metodos de pago por negocio
			 */

			for (MetodoPagoDto metodoPago : negocioDto.getMetodoPagoList()) {
				NegocioMetodoPagoKey metodoPagoKey = new NegocioMetodoPagoKey();
				metodoPagoKey.setIdNegocio(negocioEntity2.getId());
				metodoPagoKey.setIdPago(metodoPago.getId());

				MetodoPagoEntity negocioMetodoPagoEntity = new MetodoPagoEntity();
				negocioMetodoPagoEntity.setNegocioMetodoPagoKey(metodoPagoKey);
				negocioMetodoPagoRepository.save(negocioMetodoPagoEntity);
			}

			/*
			 * Tipos de tarjeta por negocio
			 */
			for (TipoTarjetaDto tipoTarjetaDto : negocioDto.getTipoTarjetaList()) {

				NegociosTarjetasPagoEntity tarjetasPagoEntity = new NegociosTarjetasPagoEntity();
				NegociosTarjetasPagoKey tarjetasPagoKey = new NegociosTarjetasPagoKey();
				tarjetasPagoKey.setIdNegocio(negocioEntity2.getId());
				tarjetasPagoKey.setIdTarjeta(tipoTarjetaDto.getId());

				tarjetasPagoEntity.setNegociosTarjetasPagoKey(tarjetasPagoKey);

				negocioTarjetasPagoRepository.save(tarjetasPagoEntity);

			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return negocioEntity2;
	}

	@Override
	public NegocioDto obtenerNegocio(String idNegocio) {
		
		NegocioEntity negocioEntity = negocioRepository.findById(idNegocio)
				.orElseThrow(() -> NegocioException.from("No se encontro el negocio : " + idNegocio, idNegocio));
		
		 List<ServiciosDto> serviciosList = new ArrayList<>();
		 List<MetodoPagoDto> metodoPagoList = new ArrayList<>();
		 List<TipoTarjetaDto> tipoTarjetaList = new ArrayList<>();
		 
	 
		NegocioDto negocioDto = negocioEntity.to();
			negocioDto.setServiciosList(serviciosList);
			negocioDto.setMetodoPagoList(metodoPagoList);
			negocioDto.setTipoTarjetaList(tipoTarjetaList);

		return negocioDto;
	}
	/*
	 *  ServiciosDto serviciosDto = new ServiciosDto();
		 	serviciosDto.setId("1");
		 	serviciosDto.setNombre("servicio a domicilio");
		 	serviciosDto.setDescripcion("te llevan tus solicitudes a casa");
		 	serviciosList.add(serviciosDto);
		 	
		 	serviciosDto = new ServiciosDto();
		 	serviciosDto.setId("2");
		 	serviciosDto.setNombre("estacionamiento");
		 	serviciosDto.setDescripcion("zona para estacionarse");
		 	serviciosList.add(serviciosDto);
		 	
		
		 	MetodoPagoDto pagoDto = new MetodoPagoDto();
			 	pagoDto.setId("1");
			 	pagoDto.setNombre("pago efectivo");
			 	pagoDto.setDescripcion("pagos realizados en efectivo");
			 	metodoPagoList.add(pagoDto);
			 	
			
			TipoTarjetaDto tipoTarjetaDto = new TipoTarjetaDto();
				tipoTarjetaDto.setId("1");
				tipoTarjetaDto.setNombre("visa");
				tipoTarjetaDto.setDescripcion("tarjetas de tipo visa");
				tipoTarjetaList.add(tipoTarjetaDto);
			
			tipoTarjetaDto = new TipoTarjetaDto();
				tipoTarjetaDto.setId("2");
				tipoTarjetaDto.setNombre("master-card");
				tipoTarjetaDto.setDescripcion("tarjetas de tipo mastercard");
				tipoTarjetaList.add(tipoTarjetaDto);
			 	(non-Javadoc)
	 * @see com.hazloakki.negocio.service.NegocioService#modificaNegocio(java.lang.String, com.hazloakki.negocio.modelo.NegocioDto)
	 */

	@Transactional
	@Override
	public NegocioEntity modificaNegocio(String idNegocio, NegocioDto cuentaDto) {

		NegocioEntity negocioEntity = negocioRepository.findById(idNegocio)
				.orElseThrow(() -> NegocioException.from("No se encontro el negocio : " + idNegocio, idNegocio));

		negocioEntity = NegocioEntity.from(cuentaDto);
		negocioEntity.setId(idNegocio);

		return negocioRepository.save(negocioEntity);
	}

	@Transactional
	@Override
	public void borrarNegocio(String idNegocio) {
		NegocioEntity negocioEntity = negocioRepository.findById(idNegocio)
				.orElseThrow(() -> NegocioException.from("No se encontro el negocio : " + idNegocio, idNegocio));

		negocioRepository.delete(negocioEntity);
	}

	@Override

	public List<NegocioEntity> obtenerAllNegociosByCuenta(String idCuenta) {

		return negocioRepository.findByIdCuentaAndEstatus(idCuenta, Boolean.TRUE);
	}

	@Override
	public List<OfertaDto> obtenerAllOfertasByNegocio(String idNegocio) {

		return ofertasNegociosApiClient.obtenerOfertasByNegocio(idNegocio);
	}

}
