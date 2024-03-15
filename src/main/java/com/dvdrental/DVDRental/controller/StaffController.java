package com.dvdrental.DVDRental.controller;

import com.dvdrental.DVDRental.dto.StaffRequestDTO;
import com.dvdrental.DVDRental.model.Staff;
import com.dvdrental.DVDRental.service.StaffService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staff")
@AllArgsConstructor
public class StaffController {
    private final StaffService staffService;

    @PostMapping("staffs")
    public ResponseEntity<List<Staff>> getStaffs(@RequestBody StaffRequestDTO staffDTO){
        return ResponseEntity.ok(staffService.getStaffs(staffDTO));
    }
}
