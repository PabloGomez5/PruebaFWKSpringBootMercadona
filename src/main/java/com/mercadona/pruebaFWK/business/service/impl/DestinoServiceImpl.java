package com.mercadona.pruebaFWK.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadona.pruebaFWK.business.dao.DestinoDaoInterface;
import com.mercadona.pruebaFWK.business.domain.Destino;
import com.mercadona.pruebaFWK.business.dto.DestinoDto;
import com.mercadona.pruebaFWK.business.service.DestinoServiceInterface;
import com.mercadona.pruebaFWK.helper.AssemblerDestino;

@Service
public class DestinoServiceImpl implements DestinoServiceInterface {
	
	@Autowired
	private DestinoDaoInterface dao;

	@Override
	public DestinoDto create(DestinoDto dto) {
		
		Destino domain = new Destino();
		
		AssemblerDestino.dtoToDomain(domain, dto);
		
		Destino result = dao.create(domain);
		
    	System.out.println("Created destino with id " + result.getId());
    	
		return AssemblerDestino.domainToDto(result);
		
	}
	
	@Override
	public DestinoDto read(Long id) {
		
		Destino domain = dao.getDestinoById(id);
		
		return AssemblerDestino.domainToDto(domain);

	}

	@Override
	public List<DestinoDto> list() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void update(DestinoDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
