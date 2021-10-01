package com.devsuperior.atividade1.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.atividade1.dto.ClientDto;
import com.devsuperior.atividade1.service.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	private ClientService service;
	
	
	@GetMapping
	public ResponseEntity<List<ClientDto>> findAll(){
		List<ClientDto> dto = service.FindAll();
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ClientDto> findId(@PathVariable long id) {
		ClientDto dto = service.FindById(id);
		return ResponseEntity.ok(dto);
	}

	
	
	
	
	
}
