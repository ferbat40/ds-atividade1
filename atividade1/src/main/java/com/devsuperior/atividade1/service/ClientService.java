package com.devsuperior.atividade1.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.atividade1.dto.ClientDto;
import com.devsuperior.atividade1.entity.Client;
import com.devsuperior.atividade1.repository.ClientRepository;

@Service
public class ClientService {
  
	
	@Autowired
	ClientRepository repository;
	
	public ClientDto FindById(long id) {
		Client entity = repository.findById(id).get();
		return new ClientDto(entity);
	}

	public List<ClientDto> FindAll() {
		// TODO Auto-generated method stub
		return repository.findAll().stream().map(x->new ClientDto(x)).collect(Collectors.toList());
	}
 
}
