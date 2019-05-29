package com.carrefour.microthings.Reservas.service;

import org.springframework.http.ResponseEntity;

public interface IReservaService {

	ResponseEntity<String> reservarLibro(long idLibro);
}
