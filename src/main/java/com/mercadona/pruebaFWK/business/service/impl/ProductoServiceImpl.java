package com.mercadona.pruebaFWK.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadona.pruebaFWK.business.dao.ProductoDaoInterface;
import com.mercadona.pruebaFWK.business.domain.Producto;
import com.mercadona.pruebaFWK.business.dto.ProductoDto;
import com.mercadona.pruebaFWK.business.service.ProductoServiceInterface;
import com.mercadona.pruebaFWK.helper.AssemblerProducto;

@Service
public class ProductoServiceImpl implements ProductoServiceInterface{
	
	
	@Autowired
	private ProductoDaoInterface dao;

	
	@Override
	public ProductoDto getProductoByEAN(String ean) {
		
		if (ean.matches("[0-9]+") && ean.length()== 13) {
			
			Long codigo = Long.parseLong(ean.substring(0, 6));
			Long codigoProvedor = Long.parseLong(ean.substring(7, 11));
			Long idDestino =  (long) Character.getNumericValue(ean.charAt(12));
			
			List<Producto> domainList = dao.getProductoByEAN(codigo, codigoProvedor, idDestino);
			
			return AssemblerProducto.domainToDto(domainList.get(0));
		}else {
			return null;
		}
	}
	
	@Override
	public ProductoDto read(Long id) {
		
		Producto domain = dao.getProductoById(id);
		
		return AssemblerProducto.domainToDto(domain);
	}

	
	@Override
	public ProductoDto create(ProductoDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoDto> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ProductoDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
