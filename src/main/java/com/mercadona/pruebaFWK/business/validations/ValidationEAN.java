package com.mercadona.pruebaFWK.business.validations;

import org.springframework.stereotype.Component;

@Component
public class ValidationEAN {
	
	public boolean validateProductoDto(Long ean) {
		
		boolean resultValidation = true;
		
		passlengthValidation( ean, resultValidation);
		passformatValidation( ean, resultValidation);
		
		
		return resultValidation;
		
	}
	
	private void passlengthValidation( Long ean, boolean resultValidation ) {
		
		if(resultValidation) {
			if (ean.SIZE != 13) {
				resultValidation = false;
			}
		}
	}
	
	private void passformatValidation( Long ean, boolean resultValidation ) {
		
		if(resultValidation) {
			if (ean.SIZE != 13) {
				resultValidation = false;
			}
		}
		
	}
	
}
