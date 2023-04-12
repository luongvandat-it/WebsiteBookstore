package com.luongvandat.services;

import com.luongvandat.entities.Department;
import com.luongvandat.repositories.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServices {
    DepartmentRepository departmentRepository;

    public DepartmentServices(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> findAllDepartment() {
        return departmentRepository.findAllDepartment();
    }
}