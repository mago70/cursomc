package com.celiosato.cursomc.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.celiosato.cursomc.domain.Cliente;
import com.celiosato.cursomc.domain.Pedido;

// Objeto da camada de acesso a dados referente ao tipo categoria

@Repository		         								//Objeto   , tipo do atributo identificador
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	
	@Transactional(readOnly=true)
	Page<Pedido> findByCliente(Cliente cliente, Pageable pageRequest);

}
