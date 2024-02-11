package com.dvdrental.DVDRental.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @Entity
    @Table(name = "film", schema = "public")
    public class Film {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "film_id")
        private Integer filmId;

        @Column(name = "title", nullable = false)
        private String title;

        @Column(name = "description")
        private String description;

        @Column(name = "release_year")
        private Integer releaseYear;

        @Column(name = "language_id", nullable = false)
        private Integer languageId;

        @Column(name = "rental_duration", nullable = false, columnDefinition = "int2 default 3")
        private Integer rentalDuration;

        @Column(name = "rental_rate", nullable = false, columnDefinition = "numeric(4, 2) default 4.99")
        private BigDecimal rentalRate;

        @Column(name = "length")
        private Integer length;

        @Column(name = "replacement_cost", nullable = false, columnDefinition = "numeric(5, 2) default 19.99")
        private BigDecimal replacementCost;

        @Column(name = "rating", columnDefinition = "mpaa_rating default 'G'")
        private String rating;

        @Column(name = "last_update", nullable = false, columnDefinition = "timestamp default now()")
        private Timestamp lastUpdate;

        @Column(name = "special_features")
        private String[] specialFeatures;

        @Column(name = "fulltext", nullable = false)
        private String fulltext;

    }
