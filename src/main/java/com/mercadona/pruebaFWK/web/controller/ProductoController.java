package com.mercadona.pruebaFWK.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mercadona.pruebaFWK.business.dto.ProductoDto;
import com.mercadona.pruebaFWK.business.service.ProductoServiceInterface;

@Controller
@RequestMapping("/auth/Producto")
public class ProductoController {
	
	@Autowired
	private ProductoServiceInterface service;

	
	@GetMapping("/{ean}")
	public ResponseEntity<ProductoDto> checkEAN(@PathVariable(required = true, name = "ean") String ean) {
		
		ProductoDto result =  service.getProductoByEAN(ean);
		
		if (result == null) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
			
		}else {
			
			return  ResponseEntity.ok(result);
			
		}
		
	}
	
	
}
