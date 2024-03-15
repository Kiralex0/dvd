package com.dvdrental.DVDRental.service;

import com.dvdrental.DVDRental.dto.CustomerAddressRequestDTO;
import com.dvdrental.DVDRental.model.Customer;
import com.dvdrental.DVDRental.repo.CustomerRepo;
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
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepo customerRepo;
    private final EntityManager entityManager;

//    @Override
//    public Customer getCustomersByFirstName(String firstName) {
//        return customerRepo.getCustomersByFirstName(firstName);
//    }

    @Override
    public Integer getCustomerId(Integer id) {
        return customerRepo.getCustomerId(id);
    }

    @Override
    public List<Customer> getCustomersByFirstName(String firstName) {
        return customerRepo.getCustomersByFirstName(firstName);
    }

    @Override
    public Customer getCustomerById(Integer id) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Customer> query = criteriaBuilder.createQuery(Customer.class);
        Root<Customer> root = query.from(Customer.class);
        Predicate predicate = criteriaBuilder.equal(root.get("customerId"), id);
        query.where(predicate);
        return entityManager.createQuery(query).getSingleResult();
    }

//    select Customer from Customer.class order by name asc
//    asc по порядку в алфавитном
//    desc в обратную сторону
    @Override
    public List<Customer> getCustomers(String orderColumn, String orderDirection) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Customer> query = criteriaBuilder.createQuery(Customer.class);
        Root<Customer> root = query.from(Customer.class);
        if (orderDirection.equals("asc")){
            query.orderBy(criteriaBuilder.asc(root.get(orderColumn)));
        } else {
            query.orderBy(criteriaBuilder.desc(root.get(orderColumn)));
        }
//        query.orderBy(criteriaBuilder.asc(root.get(orderColumn)));
//        query.orderBy(criteriaBuilder.desc(root.get("firstName")));
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Customer> getCustomersByAddress(CustomerAddressRequestDTO customerDTO) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Customer> query = criteriaBuilder.createQuery(Customer.class);
        Root<Customer> root = query.from(Customer.class);
        Predicate predicate = criteriaBuilder.equal(root.get("addressId"), customerDTO.getAddressId());
        Predicate predicate1 = criteriaBuilder.equal(root.get("activeBool"), customerDTO.getActiveBool());
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(predicate);
        predicates.add(predicate1);
        query.where(Util.combinePredicates(criteriaBuilder, predicates));
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Customer> getCustomersByAddressAndActiveBool(Integer addressId, Boolean activeBool) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Customer> query = criteriaBuilder.createQuery(Customer.class);
        Root<Customer> root = query.from(Customer.class);
        Predicate predicate = criteriaBuilder.equal(root.get("addressId"), addressId);
        Predicate predicate1 = criteriaBuilder.equal(root.get("activeBool"), activeBool);
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(predicate);
        predicates.add(predicate1);
        query.where(Util.combinePredicates(criteriaBuilder, predicates));
        return entityManager.createQuery(query).getResultList();
    }
}
