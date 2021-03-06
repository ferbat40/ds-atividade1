package com.devsuperior.atividade1.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.devsuperior.atividade1.entity.Client;



public class ClientDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;
	private String cpf;
	private Double income;
	private Instant birthDate;
	private int children;
	
	public ClientDto()  {
		
	}
	
	public ClientDto(Client client) {
		this.name=client.getName();
		this.cpf=client.getCpf();
		this.income=client.getIncome();
		this.birthDate=client.getBirthDate();
		this.children=client.getChildren();
	}
	
	
	


	
	public ClientDto(Long id, String name, String cpf, Double income, Instant birthDate, int children) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	}
	public Instant getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientDto other = (ClientDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}