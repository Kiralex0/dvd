package com.dvdrental.DVDRental.utils;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;

import java.util.List;

public class Util {
    public static Predicate combinePredicates(CriteriaBuilder criteriaBuilder, List<Predicate> predicates){
        Predicate result = predicates.get(0);
        for (int i = 1; i < predicates.size(); i++) {
            result = criteriaBuilder.and(result, predicates.get(i));
        }
        return result;
    }
}
