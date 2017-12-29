package com.cefothe.webflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.SynchronousSink;

import java.time.Duration;
import java.util.Date;

@Service
public class MovieService {

    @Autowired
    private MoveRepository moveRepository;

    public Flux<Movie> findAll(){
        return moveRepository.findAll();
    }

    public Mono<Movie> findById(String id){
        return moveRepository.findById(id);
    }

    public Flux<MovieEvent> findEvents(String id){
        return Flux.generate(  (SynchronousSink<MovieEvent> sinc)  ->sinc.next(new MovieEvent(id, new Date())))
                .delayElements(Duration.ofSeconds(1));
    }

}
