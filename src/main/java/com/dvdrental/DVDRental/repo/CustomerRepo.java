package com.dvdrental.DVDRental.repo;

import com.dvdrental.DVDRental.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    @Query(value = "select customer from Customer customer where firstName like %:name%")
    List<Customer> getCustomersByFirstName(@Param("name") String firstName);

    @Query(value = "select store_id from customer where customer_id = :id", nativeQuery = true)
    Integer getCustomerId(@Param("id") Integer id);
}
