package com.celiosato.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.celiosato.cursomc.domain.Estado;

// Objeto da camada de acesso a dados referente ao tipo categoria

@Repository		         								//Objeto   , tipo do atributo identificador
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
	@Transactional(readOnly = true)
	public List<Estado> findAllByOrderByNome();
}
