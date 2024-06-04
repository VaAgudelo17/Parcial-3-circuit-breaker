package com.agudelo.reservacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.agudelo.reservacion")
@EnableJpaRepositories(basePackages = "com.agudelo.reservacion.repository")
@EntityScan(basePackages = "com.agudelo.reservacion.entity")
@ComponentScan
public class ReservacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservacionApplication.class, args);
	}

}
