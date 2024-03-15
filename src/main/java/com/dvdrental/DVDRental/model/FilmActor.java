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
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "film_actor", schema = "public")
public class FilmActor {
    @Id
    @Column(name = "actor_id")
    private Short actorId;

    @Id
    @Column(name = "film_id")
    private Short filmId;

    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;
}



