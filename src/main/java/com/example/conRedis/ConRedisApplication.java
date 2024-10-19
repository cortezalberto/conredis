package com.example.conRedis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConRedisApplication.class, args);

		System.out.println("Funcionando");
	}

}
