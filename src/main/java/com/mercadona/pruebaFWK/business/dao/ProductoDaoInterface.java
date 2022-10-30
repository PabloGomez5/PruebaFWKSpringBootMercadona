package com.mercadona.pruebaFWK.business.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mercadona.pruebaFWK.business.domain.Producto;

@Repository
public interface ProductoDaoInterface {
	
	public List<Producto> getProductoByEAN(Long codigo, Long codigoProvedor, Long idDestino);
	public Producto getProductoById(Long id);
    public Producto create(Producto destino);
    public boolean update(Producto destino);
    public boolean delete(Producto destino);

}
