package com.carrefour.microthings.Reservas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReservasServiceImpl implements IReservaService {

	@Value("${pagos.host}")
	private String pagosHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public ResponseEntity<String> reservarLibro(long idLibro) {
		
		ResponseEntity<String> entity = this.restTemplate.getForEntity(pagosHost + "/pagos/verificacion/" + idLibro,String.class);	
		ResponseEntity<String> response = null;
		
		HttpStatus status = entity.getStatusCode();
		
		switch (status){
		case OK:{
			response = new ResponseEntity<>("RESERVA REALIZADA CON ÉXITO", HttpStatus.OK);
			break;
		}
		
		default:{
			response = new ResponseEntity<>("NO SE PUEDE HACER LA RESERVA", HttpStatus.OK);
		}
		}
		return response;
	}
	
	
}
