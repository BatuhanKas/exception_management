package com.batuhankas.exception_management.controller;

import com.batuhankas.exception_management.dto.DtoDepartment;
import org.springframework.http.ResponseEntity;

public interface IDepartmentController {
        public ResponseEntity<String> saveDepartment(DtoDepartment dtoDepartment);
}
