package com.devsuperior.atividade1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.atividade1.entity.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

}
