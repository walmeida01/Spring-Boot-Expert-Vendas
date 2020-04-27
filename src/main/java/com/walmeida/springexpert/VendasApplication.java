package com.walmeida.springexpert;

import ch.qos.logback.core.net.server.Client;
import com.walmeida.springexpert.domain.entity.Cliente;
import com.walmeida.springexpert.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return  args -> {
            System.out.println("Salvando Clientes");
            clientes.save(new Cliente("William"));
            clientes.save(new Cliente("Segundo Cliente"));

           List<Cliente> result = clientes.ecnontrarPorNome("William");
            result.forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}