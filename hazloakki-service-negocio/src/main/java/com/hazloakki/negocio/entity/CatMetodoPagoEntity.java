package com.hazloakki.negocio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

import com.hazloakki.negocio.modelo.MetodoPagoDto;

@Entity
@Table(name = "cat_metodo_pago")
public class CatMetodoPagoEntity {

	@Version
	private Long version;
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private String id;
	private String nombre;
	private String descripcion;
	private boolean estatus;

	public MetodoPagoDto to() {

		MetodoPagoDto metodoPagoDto = new MetodoPagoDto();
			metodoPagoDto.setId(getId());
			metodoPagoDto.setNombre(getNombre());
			metodoPagoDto.setDescripcion(getDescripcion());
			metodoPagoDto.setEstatus(isEstatus());

		return metodoPagoDto;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

}
