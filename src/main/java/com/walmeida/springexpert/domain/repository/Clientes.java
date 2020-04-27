package com.walmeida.springexpert.domain.repository;

import com.walmeida.springexpert.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente, Integer> {

    @Query(value = " select * from cliente c where c.nome like '%:nome%' ", nativeQuery = true)
    List<Cliente> ecnontrarPorNome(@Param("nome") String nome);
    //List<Cliente> findByNomeLike(String nome);

    List<Cliente> findByNomeOrIdOrderById(String nome, Integer id);

    @Query(" delete from Cliente c where c.nome = :nome ")
    @Modifying
    void deleteByNome(String nome);

    boolean existsByNome(String nome);

}
