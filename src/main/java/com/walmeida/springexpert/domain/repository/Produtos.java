package com.walmeida.springexpert.domain.repository;

import com.walmeida.springexpert.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
