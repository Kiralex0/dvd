package com.dvdrental.DVDRental.controller;

import com.dvdrental.DVDRental.model.Film;
import com.dvdrental.DVDRental.service.FilmService;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/film")
@AllArgsConstructor
public class FilmController {

    private final FilmService filmService;

//    @PostMapping("get")
//    public ResponseEntity<Film> getFilm(@RequestBody FilmRequestDTO filmRequestDTO){
//        Integer year = filmRequestDTO.getReleaseYear();
//        return null;
//    }

    @GetMapping("allFilm")
    public ResponseEntity<List<Film>> getFilms(@Parameter String orderColumn,@Parameter String orderDirection){
        return ResponseEntity.ok(filmService.getFilms(orderColumn, orderDirection));
    }

    @GetMapping("title/{title}")
    public ResponseEntity<Film> getFilm(@PathVariable String title){
        return ResponseEntity.ok(filmService.getFilm(title));
    }
}
