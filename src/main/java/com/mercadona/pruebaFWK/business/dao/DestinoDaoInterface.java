package com.mercadona.pruebaFWK.business.dao;

import org.springframework.stereotype.Repository;

import com.mercadona.pruebaFWK.business.domain.Destino;

@Repository
public interface DestinoDaoInterface{

	public Destino getDestinoById(Long id);
    public Destino create(Destino destino);
    public boolean update(Destino destino);
    public boolean delete(Destino destino);
    
}
