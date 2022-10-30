package com.mercadona.pruebaFWK.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	
	@PostMapping
	public ResponseEntity<DestinoDto> create(@RequestBody DestinoDto dto) {
		
		DestinoDto result = service.create(dto);
		
		if (result == null) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
			
		}else {
			
			return  ResponseEntity.ok(result);
			
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DestinoDto> read(@PathVariable(required = true, name = "id") Long id) {
		
		DestinoDto result =  service.read(id);
		
		if (result == null) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
			
		}else {
			
			return  ResponseEntity.ok(result);
			
		}
		
	}
	
	
	
	@GetMapping
	public List<DestinoDto> list() {
		
		return service.list();
		
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
