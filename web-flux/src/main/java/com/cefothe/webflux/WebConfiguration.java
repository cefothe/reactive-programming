package com.cefothe.webflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class WebConfiguration {

    @Autowired
    private MovieService movieService;

    @Bean
    public RouterFunction<?> routes(){
       return route(RequestPredicates.GET("/movies"),
               serverRequest -> ServerResponse.ok().body(movieService.findAll(),Movie.class))
               .andRoute(RequestPredicates.GET("/movies/{id}"),
                       serverRequest -> ServerResponse.ok()
                               .body(movieService.findById(serverRequest.pathVariable("id")), Movie.class))
                .andRoute(RequestPredicates.GET("/movies/{id}/events"),
                        serverRequest -> ServerResponse.ok().contentType(MediaType.TEXT_EVENT_STREAM)
                                .body(movieService.findEvents(serverRequest.pathVariable("id")), MovieEvent.class));
    }

}
