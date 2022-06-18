package com.karthikeyan.department;

import com.karthikeyan.department.entity.Department;
import com.karthikeyan.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentServiceApplication implements CommandLineRunner {

    @Autowired
    private DepartmentService departmentService;

    public static void main(String[] args) {
        SpringApplication.run(DepartmentServiceApplication.class, args);
    }


    @Override
    public void run(String... args) {
        Department department = new Department();
        department.setDepartmentId(1L);
        department.setDepartmentName("Kannan Department");
        department.setDepartmentAddress("Address hgdhfgjgds");
        department.setDepartmentCode("111");
        departmentService.saveDepartment(department);
    }
}
