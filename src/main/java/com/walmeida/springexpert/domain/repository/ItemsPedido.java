package com.walmeida.springexpert.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.walmeida.springexpert.domain.entity.ItemPedido;

public interface ItemsPedido  extends JpaRepository<ItemPedido, Integer> {
}
