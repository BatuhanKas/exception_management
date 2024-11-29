package com.batuhankas.exception_management.service.impl;

import com.batuhankas.exception_management.controller.IDepartmentController;
import com.batuhankas.exception_management.dto.DtoDepartment;
import com.batuhankas.exception_management.model.Department;
import com.batuhankas.exception_management.repository.DepartmentRepository;
import com.batuhankas.exception_management.service.IDepartmentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService  implements IDepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
//    @Transactional
    public ResponseEntity<String> saveDepartment(DtoDepartment dtoDepartment) {
        if (dtoDepartment.getName().isEmpty() ||
            dtoDepartment.getLocation().isEmpty() || dtoDepartment == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Empty Department!");
        }

        Department department = new Department();
        BeanUtils.copyProperties(dtoDepartment, department);
        Department dbDepartment = departmentRepository.save(department);

        if (dbDepartment == null) {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Database Save Error!");
        }

        return ResponseEntity.status(HttpStatus.OK).body("Department Saved!");
    }
}
