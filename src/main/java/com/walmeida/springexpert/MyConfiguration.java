package com.walmeida.springexpert;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import  org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class MyConfiguration {

    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("Rodando a configuração de desenvolvimento");
        };
    }

}
