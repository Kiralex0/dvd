package com.dvdrental.DVDRental.service;

import com.dvdrental.DVDRental.model.Customer;
import com.dvdrental.DVDRental.repo.CustomerRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepo customerRepo;

    @Override
    public List<Customer> getCustomersByFirstName(String firstName) {
        return customerRepo.getCustomersByFirstName(firstName);
    }
}
