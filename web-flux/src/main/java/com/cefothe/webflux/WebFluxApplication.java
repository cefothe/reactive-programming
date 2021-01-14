package com.cefothe.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

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
