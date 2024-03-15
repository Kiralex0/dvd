package com.dvdrental.DVDRental.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomerAddressRequestDTO {
    private Integer addressId;
    private Boolean activeBool;
}
