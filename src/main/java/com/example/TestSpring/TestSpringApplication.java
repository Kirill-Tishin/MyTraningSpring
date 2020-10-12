package com.example.TestSpring;

import com.example.TestSpring.controllers.ControllerV1;
import com.example.TestSpring.entity.Customer;
import com.example.TestSpring.validators.CustomerValidator;
import com.example.TestSpring.validators.EmployeeValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringApplication.class, args);

        CustomerValidator customerValidator = new CustomerValidator();
        EmployeeValidator employeeValidator = new EmployeeValidator();
        ControllerV1 controllerV1 = new ControllerV1(customerValidator, employeeValidator);

        System.out.println(controllerV1.getIDForCustomer(new Customer("Test1", 1)));
    }
}