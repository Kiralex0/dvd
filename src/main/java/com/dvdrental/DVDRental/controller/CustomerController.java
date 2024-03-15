package com.dvdrental.DVDRental.controller;

import com.dvdrental.DVDRental.dto.CustomerAddressRequestDTO;
import com.dvdrental.DVDRental.model.Customer;
import com.dvdrental.DVDRental.service.CustomerService;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
//
//    @GetMapping("/customer/firstName/{firstName}")
//    public ResponseEntity<Customer> getCustomersByFirstName(@PathVariable String firstName){
//        return ResponseEntity.ok(customerService.getCustomersByFirstName(firstName));
//    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Integer> getCustomerId(@PathVariable Integer id){
        return ResponseEntity.ok(customerService.getCustomerId(id));
    }


    @GetMapping("/customer/firstName/{firstName}")
    public ResponseEntity<List<Customer>> getCustomersByFirstName(@PathVariable String firstName){
        return ResponseEntity.ok(customerService.getCustomersByFirstName(firstName));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Integer id){
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    @GetMapping("all")
    public ResponseEntity<List<Customer>> getCustomers(@Parameter String orderColumn, @Parameter String orderDirection){
        return ResponseEntity.ok(customerService.getCustomers(orderColumn, orderDirection));
    }

    @PostMapping("address")
    public ResponseEntity<List<Customer>> getCustomersByAddress(@RequestBody CustomerAddressRequestDTO customerDTO){
        return ResponseEntity.ok(customerService.getCustomersByAddress(customerDTO));
    }

    @GetMapping("addressId")
    public ResponseEntity<List<Customer>> getCustomersByAddressAndActiveBool(@Parameter Integer addressId,@Parameter Boolean activeBool){
        return ResponseEntity.ok(customerService.getCustomersByAddressAndActiveBool(addressId, activeBool));
    }
}
