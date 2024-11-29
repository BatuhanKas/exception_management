package com.batuhankas.exception_management.controller.impl;

import com.batuhankas.exception_management.controller.IDepartmentController;
import com.batuhankas.exception_management.dto.DtoDepartment;
import com.batuhankas.exception_management.service.impl.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/department")
public class DepartmentController implements IDepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Override
    @PostMapping("/save")
    public ResponseEntity<String> saveDepartment(@RequestBody DtoDepartment dtoDepartment) {
        return departmentService.saveDepartment(dtoDepartment);
    }
}
