package com.cefothe.webfluxclient;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;


@SpringBootApplication
public class WebFluxClientApplication {

	@Bean
	WebClient webClient(){
		return WebClient.create("http://localhost:8080/movies").mutate().build();
	}

	@Bean
	ApplicationRunner runner(WebClient webClient){
		return args ->  webClient.get().uri("")
				.retrieve()
				.bodyToFlux(Movie.class).filter(m->m.getTitle().equals("Silence of the Lambdas"))
				.flatMap(movie -> webClient.get().uri("/{id}/events",movie.getId())
						.retrieve()
						.bodyToFlux(MovieEvent.class))
						.subscribe(System.out::println);
	}

	public static void main(String[] args) {
		SpringApplication.run(WebFluxClientApplication.class, args);
	}

}
