package com.carrefour.microthings.Pagos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pagos")
public class PagosController {
	

	@GetMapping("/verificacion/{idLibro}")
	public ResponseEntity<String> verificarPagos(@PathVariable long idLibro) {
		return new ResponseEntity<String>("NO HAY PAGOS PENDIENTES", HttpStatus.OK);
		
	}
	
	
}
