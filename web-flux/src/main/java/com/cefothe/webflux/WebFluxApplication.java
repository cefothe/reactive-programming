package com.cefothe.webflux;

import lombok.ToString;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.config.EnableWebFlux;
import reactor.core.publisher.Flux;

@SpringBootApplication
@EnableWebFlux
public class WebFluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFluxApplication.class, args);
	}

//	@Bean
//	public ApplicationRunner commandLineRunner(MoveRepository moveRepository){
//		return new ApplicationRunner() {
//			@Override
//			public void run(ApplicationArguments args) throws Exception {
//				Flux<Movie> movies = Flux.just("Silence of the Lambdas", "AEon Flux", "Back to the Future")
//						.flatMap(it -> moveRepository.save(new Movie(it)));
//				moveRepository.deleteAll()
//						.thenMany(movies)
//						.thenMany(moveRepository.findAll())
//						.subscribe(it -> System.out.println(it));
//			}
//		};
//	}


}
