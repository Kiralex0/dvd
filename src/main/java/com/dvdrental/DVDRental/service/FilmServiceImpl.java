package com.dvdrental.DVDRental.service;

import com.dvdrental.DVDRental.model.Film;
import com.dvdrental.DVDRental.repo.FilmRepo;
import com.dvdrental.DVDRental.utils.Util;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class FilmServiceImpl implements FilmService {
    private final FilmRepo filmRepo;
    private final EntityManager entityManager;

    @Override
    public List<Film> getFilms(String orderColumn, String orderDirection) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Film> query = criteriaBuilder.createQuery(Film.class);
        Root<Film> root = query.from(Film.class);
        if (orderDirection.equals("asc")){
            query.orderBy(criteriaBuilder.asc(root.get(orderColumn)));
        } else {
            query.orderBy(criteriaBuilder.desc(root.get(orderColumn)));
        }
        return entityManager.createQuery(query).getResultList();
    }

//    select Film from Film.class where title=title
    @Override
    public Film getFilm(String title) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Film> criteriaQuery = criteriaBuilder.createQuery(Film.class);
        Root<Film> root = criteriaQuery.from(Film.class);
        Predicate predicate = criteriaBuilder.equal(root.get("title"), title);
        Predicate predicate1 = criteriaBuilder.equal(root.get("rating"), "R");
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(predicate);
        predicates.add(predicate1);
        criteriaQuery.where(Util.combinePredicates(criteriaBuilder, predicates));
        return entityManager.createQuery(criteriaQuery).getSingleResult();
    }
}

