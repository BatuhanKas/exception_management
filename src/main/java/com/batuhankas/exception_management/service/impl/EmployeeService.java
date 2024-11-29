package com.batuhankas.exception_management.service.impl;

import com.batuhankas.exception_management.dto.DtoEmployee;
import com.batuhankas.exception_management.exception.BaseException;
import com.batuhankas.exception_management.exception.ErrorMessage;
import com.batuhankas.exception_management.exception.MessageType;
import com.batuhankas.exception_management.model.Employee;
import com.batuhankas.exception_management.repository.EmployeeRepository;
import com.batuhankas.exception_management.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee findEmployeeById(Integer id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isEmpty()) {
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, id.toString()));
        }
        Employee employee = optional.get();

        DtoEmployee dtoEmployee = new DtoEmployee();
        BeanUtils.copyProperties(employee, dtoEmployee);
        BeanUtils.copyProperties(employee.getDepartment(), dtoEmployee.getDtoDepartment());

        return dtoEmployee;
    }
}
