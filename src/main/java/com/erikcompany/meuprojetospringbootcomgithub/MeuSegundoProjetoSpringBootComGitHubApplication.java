package com.erikcompany.meuprojetospringbootcomgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Anotacao do Spring Boot que faz tudo acontecer. Inicializa o Spring Boot, componentes, entre um monte de outras coisas.
public class MeuSegundoProjetoSpringBootComGitHubApplication {

	public static void main(String[] args) {
		
		System.out.println("Erik - Essa eh a classe que executa o projeto em si");
		
		SpringApplication.run( MeuSegundoProjetoSpringBootComGitHubApplication.class, args );
	}
}
