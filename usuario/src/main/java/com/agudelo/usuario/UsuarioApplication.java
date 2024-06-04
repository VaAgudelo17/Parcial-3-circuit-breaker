package com.agudelo.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.agudelo.usuario.repository", "com.agudelo.usuario.services"})
@EnableJpaRepositories(basePackages = "com.agudelo.usuario.repository")
@SpringBootApplication
public class UsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioApplication.class, args);
	}

}
