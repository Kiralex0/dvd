package com.dvdrental.DVDRental.service;

import com.dvdrental.DVDRental.model.Film;
import com.dvdrental.DVDRental.repo.FilmRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FilmServiceImpl implements FilmService {
    private final FilmRepo filmRepo;

    @Override
    public List<Film> getFilm(String title) {
        return filmRepo.getFilmsByTitle(title);
    }
}
