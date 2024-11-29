package com.batuhankas.exception_management.repository;

import com.batuhankas.exception_management.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
