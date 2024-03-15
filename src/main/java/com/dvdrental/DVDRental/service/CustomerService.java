package com.dvdrental.DVDRental.service;

import com.dvdrental.DVDRental.dto.CustomerAddressRequestDTO;
import com.dvdrental.DVDRental.model.Customer;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomerService {
//    Customer getCustomersByFirstName(String firstName);
    Integer getCustomerId(Integer id);
    List<Customer> getCustomersByFirstName(String firstName);
    Customer getCustomerById(Integer id);
    List<Customer> getCustomers(String orderColumn, String orderDirection);
    List<Customer> getCustomersByAddress(CustomerAddressRequestDTO customerDTO);
    List<Customer> getCustomersByAddressAndActiveBool(Integer addressId, Boolean activeBool);
}
