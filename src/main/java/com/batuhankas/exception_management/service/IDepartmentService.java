package com.batuhankas.exception_management.service;

import com.batuhankas.exception_management.dto.DtoDepartment;
import org.springframework.http.ResponseEntity;

public interface IDepartmentService {
    public ResponseEntity<String> saveDepartment(DtoDepartment dtoDepartment);
}
