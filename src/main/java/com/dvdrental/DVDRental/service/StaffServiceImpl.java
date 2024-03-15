package com.dvdrental.DVDRental.service;

import com.dvdrental.DVDRental.dto.StaffRequestDTO;
import com.dvdrental.DVDRental.model.Staff;

import java.util.List;

public interface StaffServiceImpl {
    List<Staff> getStaffs(StaffRequestDTO staffDTO);
}
