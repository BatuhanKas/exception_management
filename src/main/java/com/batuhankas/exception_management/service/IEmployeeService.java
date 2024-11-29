package com.batuhankas.exception_management.service;

import com.batuhankas.exception_management.dto.DtoEmployee;
import com.batuhankas.exception_management.model.Employee;

public interface IEmployeeService {
    public DtoEmployee findEmployeeById(Integer id);
}
