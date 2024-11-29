package com.batuhankas.exception_management.controller;

import com.batuhankas.exception_management.dto.DtoEmployee;
import com.batuhankas.exception_management.model.RootEntity;

public interface IEmployeeController {
    public RootEntity<DtoEmployee> findEmployeeById(int id);
}
