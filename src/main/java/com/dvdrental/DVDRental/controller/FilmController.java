package com.dvdrental.DVDRental.controller;

import com.dvdrental.DVDRental.model.Film;
import com.dvdrental.DVDRental.service.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/film")
@AllArgsConstructor
public class FilmController {

    private final FilmService filmService;

//    @PostMapping("get")
//    public ResponseEntity<Film> getFilm(@RequestBody Map<String,String> map){
//        return null;
//    }

    @PostMapping("get")
    public ResponseEntity<List<Film>> getFilm(@RequestBody String title){
        return ResponseEntity.ok(filmService.getFilm(title));
    }
}
