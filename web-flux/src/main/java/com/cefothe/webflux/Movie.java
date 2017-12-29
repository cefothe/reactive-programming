package com.cefothe.webflux;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@ToString
@Data
public class Movie {

    @Id
    private String id;
    private String title;

    public Movie(String title) {
        this.title = title;
    }
}
