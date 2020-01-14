package com.celiosato.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.celiosato.cursomc.domain.ItemPedido;

// Objeto da camada de acesso a dados referente ao tipo categoria

@Repository		         								//Objeto   , tipo do atributo identificador
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{
	

}
