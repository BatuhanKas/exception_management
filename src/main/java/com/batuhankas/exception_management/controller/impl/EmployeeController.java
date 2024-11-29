package com.batuhankas.exception_management.controller.impl;

import com.batuhankas.exception_management.controller.IEmployeeController;
import com.batuhankas.exception_management.dto.DtoEmployee;
import com.batuhankas.exception_management.model.RootEntity;
import com.batuhankas.exception_management.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController extends RootEntity implements IEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Override
    @GetMapping("/list/{id}")
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") int id) {
        return RootEntity.ok(employeeService.findEmployeeById(id));
    }
}
