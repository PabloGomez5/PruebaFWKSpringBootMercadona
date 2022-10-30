package com.mercadona.pruebaFWK.business.service;


import java.util.List;


import com.mercadona.pruebaFWK.business.dto.ProductoDto;

public interface ProductoServiceInterface {
	
	
	ProductoDto create(ProductoDto dto);

	List<ProductoDto> list();

	ProductoDto read(Long id);

	void update(ProductoDto dto);

	void delete(Long id);

	ProductoDto getProductoByEAN(String ean);

	

}
