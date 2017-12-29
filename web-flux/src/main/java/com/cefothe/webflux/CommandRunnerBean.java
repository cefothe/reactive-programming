package com.cefothe.webflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class CommandRunnerBean  implements ApplicationRunner{

    @Autowired
    private MoveRepository moveRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Flux<Movie> movies = Flux.just("Silence of the Lambdas", "AEon Flux", "Back to the Future")
                .flatMap(it -> moveRepository.save(new Movie(it)));
        moveRepository.deleteAll()
                .thenMany(movies)
                .thenMany(moveRepository.findAll());
                //.subscribe(it -> System.out.println(it));
    }
}
