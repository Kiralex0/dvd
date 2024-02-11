package com.dvdrental.DVDRental.service;

import com.dvdrental.DVDRental.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomersByFirstName(String firstName);
}
