//package com.cefothe.webflux;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//@RestController
//public class MovieRestController {
//
//    @Autowired
//    private MovieService movieService;
//
//    @GetMapping("/movies/{id}")
//    public Mono<Movie> findById(@PathVariable("id") String id){
//        return  movieService.findById(id);
//    }
//
//    @GetMapping("/movies")
//    public Flux<Movie> findAll(){
//        return movieService.findAll();
//    }
//
//    @GetMapping(value = "/movies/{id}/events", produces = {MediaType.TEXT_EVENT_STREAM_VALUE})
//    public Flux<MovieEvent>  findElement( @PathVariable("id")  String id){
//        return  movieService.findEvents(id);
//    }
//}
