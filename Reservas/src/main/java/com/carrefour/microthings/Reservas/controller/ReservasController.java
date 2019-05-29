package com.carrefour.microthings.Reservas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carrefour.microthings.Reservas.service.IReservaService;

@RestController
@RequestMapping(value="/reservas")
public class ReservasController {
	
	@Autowired
	IReservaService ireservaService;

	@PostMapping("/{idLibro}")
	public ResponseEntity<String> reservarLibro(@PathVariable long idLibro) {
		//ResponseEntity<String> response = new ResponseEntity<>("Reservado", HttpStatus.OK);
		return ireservaService.reservarLibro(idLibro);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<String> reservarLibro() {
		ResponseEntity<String> response = new ResponseEntity<>("Reservado", HttpStatus.OK);
		return response;
		
	}
	
}
