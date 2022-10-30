package com.mercadona.pruebaFWK.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.mercadona.pruebaFWK.business.dto.DestinoDto;
import com.mercadona.pruebaFWK.business.service.DestinoServiceInterface;
 

@Controller
@RequestMapping("/auth/destino")
public class DestinoController{

	@Autowired
	private DestinoServiceInterface service;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Long create(//@Valid @RequestBody DestinoDto dto
			) {
		
		return service.create();
		
	}
	
	@GetMapping
	public List<DestinoDto> list() {
		
		return service.list();
		
	}
	
	@GetMapping("/{id}")
	public DestinoDto read(@PathVariable(required = true, name = "id") Long id) {
		return service.read(id);
	}
	
	@PutMapping
	public void update(//@Valid 
			@RequestBody DestinoDto dto) {
		service.update(dto);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(required = true, name = "id") Long id) {
		service.delete(id);
	}
	
	
}
