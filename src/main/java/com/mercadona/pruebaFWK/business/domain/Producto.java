package com.mercadona.pruebaFWK.business.domain;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//import javax.validation.constraints.NotNull;

@Entity
@Table(name="PRODUCTO")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name= "CODIGO")
	//@NotNull
	private Long codigo;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name= "CODIGO_PROVEDOR")
	private Provedor provedor;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name= "ID_DESTINO")
	private Destino destino;
	
	@Column(name= "NOMBRE")
	private String nombre;
	
	@Column(name= "DESCRIPCION")
	private String descripcion;
	
	@Column(name= "FECHA_ALTA_REGISTRO")
	private LocalDate fechaAlta;
	
	@Column(name= "FECHA_ULTIMA_MODIFICACION")
	private LocalDate fechaUltimaModificacion;
	
	@Column(name= "FECHA_BAJA_PRODUCTO")
	private LocalDate fechaBaja;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Provedor getProvedor() {
		return provedor;
	}

	public void setProvedor(Provedor provedor) {
		this.provedor = provedor;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
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

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public LocalDate getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}

	public void setFechaUltimaModificacion(LocalDate fechaUltimaModificacion) {
		this.fechaUltimaModificacion = fechaUltimaModificacion;
	}

	public LocalDate getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
}
