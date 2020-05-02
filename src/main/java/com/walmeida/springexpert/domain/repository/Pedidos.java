package com.walmeida.springexpert.domain.repository;

import com.walmeida.springexpert.domain.entity.Cliente;
import com.walmeida.springexpert.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
