package com.hazloakki.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hazloakki.negocio.entity.NegociosServiciosEntity;
import com.hazloakki.negocio.entity.NegociosServiciosKey;

@Repository
public interface NegocioServiciosRepository 
	extends JpaRepository<NegociosServiciosEntity, NegociosServiciosKey> {
	String QUERY_SERVICIOS_X_NEGOCIO = "SELECT a.idNegocio,b.negociosServiciosKey.idServicio, c.id, c.nombre, c.descripcion "
			+ "from NegocioEntity a, NegociosServiciosEntity b, CatServiciosEntity c "
			+ "WHERE a.idNegocio = b.idNegocio"
			+ "AND b.negociosServiciosKey.idServicio = c.id";
	/**
	 * Obtiene todos los servicios de un negocio por id del negocio
	 * @param idNegocio
	 * @return
	 */
	//List<NegociosServiciosEntity> findByIdNegocio(String idNegocio);
	
}
