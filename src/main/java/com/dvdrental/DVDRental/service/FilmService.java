package com.dvdrental.DVDRental.service;

import com.dvdrental.DVDRental.model.Film;

import java.util.List;

public interface FilmService {
    List<Film> getFilm(String title);
}
