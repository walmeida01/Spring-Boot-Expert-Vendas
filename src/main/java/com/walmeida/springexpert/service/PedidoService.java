package com.walmeida.springexpert.service;


import com.walmeida.springexpert.domain.entity.Pedido;
import com.walmeida.springexpert.domain.enums.StatusPedido;
import com.walmeida.springexpert.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);

}
