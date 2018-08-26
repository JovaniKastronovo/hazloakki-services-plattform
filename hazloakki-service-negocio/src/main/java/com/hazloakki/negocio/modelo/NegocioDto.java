package com.hazloakki.negocio.modelo;

import java.util.List;

/**
 * @author Jovani Arzate 2018-07-01 HazloAkki para Empresas v.1
 *
 */
public class NegocioDto {

	private String id;
	private String nombre;
	private Integer idCategoria;
	private String email;
	private String descripcion;
	private String telefono;
	private String domicilio;
	private Double latitud;
	private Double longitud;
	private String idCuenta;
	private String codigoPostal;
	private String delegacion;
	private String colonia;
	private String calle;
	private String numeroExterior;
	private boolean estatus;
	private List<ServiciosDto> serviciosDtos;
	private List<MetodoPagoDto> metodoPagoDtos;
	private List<TipoTarjetaDto> tipoTarjetaDtos;

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

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public String getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getDelegacion() {
		return delegacion;
	}

	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumeroExterior() {
		return numeroExterior;
	}

	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	public List<ServiciosDto> getServiciosDtos() {
		return serviciosDtos;
	}

	public void setServiciosDtos(List<ServiciosDto> serviciosDtos) {
		this.serviciosDtos = serviciosDtos;
	}

	public List<MetodoPagoDto> getMetodoPagoDtos() {
		return metodoPagoDtos;
	}

	public void setMetodoPagoDtos(List<MetodoPagoDto> metodoPagoDtos) {
		this.metodoPagoDtos = metodoPagoDtos;
	}

	public List<TipoTarjetaDto> getTipoTarjetaDtos() {
		return tipoTarjetaDtos;
	}

	public void setTipoTarjetaDtos(List<TipoTarjetaDto> tipoTarjetaDtos) {
		this.tipoTarjetaDtos = tipoTarjetaDtos;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

}
