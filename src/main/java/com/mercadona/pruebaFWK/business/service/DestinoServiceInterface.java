package com.mercadona.pruebaFWK.business.service;

import java.util.List;

import com.mercadona.pruebaFWK.business.dto.DestinoDto;

public interface DestinoServiceInterface {

	Long create();

	List<DestinoDto> list();

	DestinoDto read(Long id);

	void update(DestinoDto dto);

	void delete(Long id);
	
	

}
