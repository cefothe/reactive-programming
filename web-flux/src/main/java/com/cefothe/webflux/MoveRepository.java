package com.cefothe.webflux;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoveRepository extends ReactiveMongoRepository<Movie, String> {
}
