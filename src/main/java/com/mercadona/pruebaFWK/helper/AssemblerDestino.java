package com.mercadona.pruebaFWK.helper;

import com.mercadona.pruebaFWK.business.domain.Destino;
import com.mercadona.pruebaFWK.business.dto.DestinoDto;

public class AssemblerDestino {
	
	
	public static void dtoToDomain(Destino domain, DestinoDto dto) {
		
		domain.setNombre(dto.getNombre());
		
	}
	
	public static DestinoDto domainToDto(Destino domain) {
		
		DestinoDto dto;
		
		if( domain == null) {
			dto = null;
		}else {
			
		dto = new DestinoDto();
		
		dto.setId(domain.getId());
		dto.setNombre(domain.getNombre());
		
		}
		
		return dto;
		
	}

}
