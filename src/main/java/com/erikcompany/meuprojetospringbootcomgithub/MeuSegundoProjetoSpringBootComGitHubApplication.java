package com.erikcompany.meuprojetospringbootcomgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Classe principal que de fato executa o projeto.

@SpringBootApplication //Anotacao do Spring Boot que faz tudo acontecer. Inicializa o Spring Boot, componentes, entre um monte de outras coisas.
public class MeuSegundoProjetoSpringBootComGitHubApplication {

	public static void main(String[] args) {
		
		System.out.println("\n\nErik - Executando o metodo main e apos isso o metodo SpringApplication.run, que roda a aplicacao literalmente!\n\n");
		
		SpringApplication.run( MeuSegundoProjetoSpringBootComGitHubApplication.class, args );
		
		System.out.println("\n\nErik - Finalizando a execucao do metodo main \n\n");	
	}
}
