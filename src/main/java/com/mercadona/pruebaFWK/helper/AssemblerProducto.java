package com.mercadona.pruebaFWK.helper;

import com.mercadona.pruebaFWK.business.domain.Producto;
import com.mercadona.pruebaFWK.business.dto.ProductoDto;

public class AssemblerProducto {

	
	public static void dtoToDomain(Producto domain, ProductoDto dto) {
		
		domain.setCodigo(dto.getCodigo());
		domain.setProvedor(dto.getProvedor());
		domain.setDestino(dto.getDestino());
		domain.setNombre(dto.getNombre());
		domain.setDescripcion(dto.getDescripcion());
		domain.setFechaAlta(dto.getFechaAlta());
		domain.setFechaUltimaModificacion(dto.getFechaUltimaModificacion());
		domain.setFechaBaja(dto.getFechaBaja());
		
	}


	public static ProductoDto domainToDto(Producto domain) {
		
		ProductoDto dto;
		
		if( domain == null) {
			dto = null;
		}else {
			
			dto= new ProductoDto();
			
			dto.setId(domain.getId());
			dto.setCodigo(domain.getCodigo());
			dto.setProvedor(domain.getProvedor());
			dto.setDestino(domain.getDestino());
			dto.setNombre(domain.getNombre());
			dto.setDescripcion(domain.getDescripcion());
			dto.setFechaAlta(domain.getFechaAlta());
			dto.setFechaUltimaModificacion(domain.getFechaUltimaModificacion());
			dto.setFechaBaja(domain.getFechaBaja());
			
		}
		
		return dto;
	}

}
