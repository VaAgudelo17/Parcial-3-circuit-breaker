package com.agudelo.viaje;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.agudelo.viaje", "com.agudelo.usuario", "com.agudelo.reservacion", "com.agudelo.usuario.repository.UsuarioRepository", "com.agudelo.usuario.services.UsuarioServiceImpl", })
@EnableJpaRepositories(basePackages = "com.agudelo.viaje.repository")
@EntityScan(basePackages = {"com.agudelo.viaje.entity" , "com.agudelo.usuario.entity"})

@SpringBootApplication
public class ViajeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViajeApplication.class, args);
	}

}
