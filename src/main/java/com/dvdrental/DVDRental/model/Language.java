package com.dvdrental.DVDRental.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.security.Timestamp;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "language", schema = "public")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private Integer languageId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_update", nullable = false, columnDefinition = "timestamp default now()")
    private Timestamp lastUpdate;

}
