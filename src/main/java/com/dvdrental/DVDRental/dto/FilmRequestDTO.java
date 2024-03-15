package com.dvdrental.DVDRental.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilmRequestDTO {

    private Integer releaseYear;
    private Integer length;
    private String rating;

}
