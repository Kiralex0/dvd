package com.dvdrental.DVDRental.repo;

import com.dvdrental.DVDRental.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepo extends JpaRepository<Film, Integer> {
//    @Query(value = "select films from Film films where films.title like :title")
    @Query(value = "select films from Film films where films.title like '%:title%'")
    List<Film> getFilmsByTitle(@Param("title") String title);

//    List<Film> getFilmsByCustomer(@Param("first_name"));

}
