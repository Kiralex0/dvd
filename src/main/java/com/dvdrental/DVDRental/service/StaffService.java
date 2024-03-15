package com.dvdrental.DVDRental.service;

import com.dvdrental.DVDRental.dto.StaffRequestDTO;
import com.dvdrental.DVDRental.model.Staff;
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
public class StaffService implements StaffServiceImpl {
    private final EntityManager entityManager;


    @Override
    public List<Staff> getStaffs(StaffRequestDTO staffDTO) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Staff> query = criteriaBuilder.createQuery(Staff.class);
        Root<Staff> root = query.from(Staff.class);
//        Predicate predicate = criteriaBuilder.equal(root.get("addressId"), staffDTO);
//        Predicate predicate1 = criteriaBuilder.equal(root.get("email"), staffDTO);
        Predicate predicate2 = criteriaBuilder.equal(root.get("lastName"), staffDTO);
//        Predicate predicate3 = criteriaBuilder.equal(root.get("firstName"), staffDTO);
        List<Predicate> predicates  = new ArrayList<>();
//        predicates.add(predicate);
//        predicates.add(predicate1);
        predicates.add(predicate2);
//        predicates.add(predicate3);
        query.where(Util.combinePredicates(criteriaBuilder, predicates));
        return entityManager.createQuery(query).getResultList();
    }
}
