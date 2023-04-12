package com.luongvandat.repositories;

import com.luongvandat.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query("select d from Department d")
    List<Department> findAllDepartment();

    @Query("select d from Department d where d.departmentName = ?1")
    List<Department> findDepartmentByDepartmentName(String deptName);

    List<Department> findByDepartmentNameOrderByDepartmentNameDesc(String departmentName);

    List<Department> findDepartmentByDepartmentIdAndAndDepartmentName(String deptId, String deptName);
}