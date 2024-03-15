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

        @Column(name = "rental_duration", columnDefinition = "int2")
        private Integer rentalDuration;

        @Column(name = "rental_rate", columnDefinition = "numeric")
        private BigDecimal rentalRate;

        @Column(name = "length")
        private Integer length;

        @Column(name = "replacement_cost", columnDefinition = "numeric")
        private BigDecimal replacementCost;

        @Column(name = "rating", columnDefinition = "mpaa_rating default 'G'")
        private String rating;

        @Column(name = "last_update", columnDefinition="timestamp default current_timestamp")
        private Timestamp lastUpdate;

        @Column(name = "special_features")
        private String[] specialFeatures;

        @Column(name = "fulltext", columnDefinition = "tsvector")
        private String fulltext;

    }


//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Entity
//@Table(name = "film")
//public class Film {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "film_id")
//    private Integer filmId;
//
//    @Column(name = "title", nullable = false)
//    private String title;
//
//    @Column(name = "description")
//    private String description;
//
//    @Column(name = "release_year")
//    private Integer releaseYear;
//
//    @ManyToOne
//    @JoinColumn(name = "language_id", referencedColumnName = "language_id", nullable = false)
//    private Language language;
//
//    @Column(name = "rental_duration", nullable = false)
//    private Integer rentalDuration;
//
//    @Column(name = "rental_rate", nullable = false)
//    private BigDecimal rentalRate;
//
//    @Column(name = "length")
//    private Integer length;
//
//    @Column(name = "replacement_cost", nullable = false)
//    private BigDecimal replacementCost;
//
//    @Column(name = "last_update")
//    private LocalDateTime lastUpdate;
//
//    @Column(name = "special_features")
//    private String[] specialFeatures;
//
//    @Column(name = "fulltext", nullable = false, columnDefinition = "tsvector")
//    private String fulltext;
//
//}
