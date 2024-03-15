package com.dvdrental.DVDRental.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "film_category", schema = "public")
public class FilmCategory {
    @Id
    @Column(name = "film_id")
    private Short filmId;

    @Id
    @Column(name = "category_id")
    private Short categoryId;

    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;
}
