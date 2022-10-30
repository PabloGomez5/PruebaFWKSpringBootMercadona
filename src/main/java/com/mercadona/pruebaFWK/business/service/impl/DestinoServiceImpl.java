package com.mercadona.pruebaFWK.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadona.pruebaFWK.business.dao.DestinoDaoInterface;
import com.mercadona.pruebaFWK.business.domain.Destino;
import com.mercadona.pruebaFWK.business.dto.DestinoDto;
import com.mercadona.pruebaFWK.business.service.DestinoServiceInterface;

@Service
public class DestinoServiceImpl implements DestinoServiceInterface {
	
	@Autowired
	private DestinoDaoInterface dao;

	@Override
	public Long create(//DestinoDto dto
			) {
		
		Destino new11 = new Destino();
		new11.setNombre("a new one");
		
		Long d_id = dao.create(new11);
		
    	System.out.println("Created destino with id " + d_id);
		
		return d_id;
	}

	@Override
	public List<DestinoDto> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DestinoDto read(Long id) {
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
