package com.walmeida.springexpert.exception;

public class PedidoNaoEncontradoException extends RuntimeException{

    public PedidoNaoEncontradoException() {
        super("Pedido não encontrado.");
    }
}
