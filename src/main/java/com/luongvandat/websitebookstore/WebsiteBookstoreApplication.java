package com.luongvandat.websitebookstore;

import com.luongvandat.entities.Department;
import com.luongvandat.entities.Employee;
import com.luongvandat.services.DepartmentServices;
import com.luongvandat.services.EmployeeServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication(scanBasePackages = "com.luongvandat")
public class WebsiteBookstoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebsiteBookstoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner sampleRecords(EmployeeServices employeeServices, DepartmentServices departmentServices) {
        return args -> {
//            departmentServices.saveDepartment(new Department("hehehehehe"));
//            Department dept2 = new Department("hhahahahhhh");
//            departmentServices.saveDepartment(dept2);
            Department dept5= new Department("hohoho");
            departmentServices.saveDepartment(dept5);

//            employeeServices.saveEmployee(new Employee("luongvandat", dept2));
//            employeeServices.saveEmployee(new Employee("popopopoandat222444", dept5));
//            List<Department> departmentList = departmentServices.findAllDepartment();
//            System.out.println(departmentList);
        };
    }
}