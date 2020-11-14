package com.pontosAlelo.Alelo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pontosAlelo.Alelo.model.Cliente;
import com.pontosAlelo.Alelo.model.Produto;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	public List<Cliente> findAllByNomeContainingIgnoreCase (String nome);

}
