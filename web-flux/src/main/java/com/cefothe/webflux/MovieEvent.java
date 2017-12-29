package com.cefothe.webflux;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class MovieEvent {
    private  String movieId;
    private Date date;

    public MovieEvent(String movieId, Date date) {
        this.movieId = movieId;
        this.date = date;
    }
}
