package com.dvdrental.DVDRental.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "city", schema = "public")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Integer cityId;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country_id", nullable = false)
    private Integer countryId;

    @Column(name = "last_update", nullable = false, columnDefinition = "timestamp default now()")
    private Timestamp lastUpdate;

}
