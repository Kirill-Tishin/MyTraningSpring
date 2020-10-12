package com.example.TestSpring.controllers;

import com.example.TestSpring.entity.Customer;
import com.example.TestSpring.entity.Employee;
import com.example.TestSpring.validators.CustomerValidator;
import com.example.TestSpring.validators.EmployeeValidator;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;

@Controller
@Slf4j
public class ControllerV1 {
    private final CustomerValidator customerValidator;
    private final EmployeeValidator employeeValidator;

    @Autowired
    public ControllerV1(CustomerValidator customerValidator, EmployeeValidator employeeValidator) {
        this.customerValidator = customerValidator;
        this.employeeValidator = employeeValidator;
    }

    public String getNameForEmployee(@Valid Employee employee){
        log.debug("start method getNameForEmployee");
        return employee.getName();
    }

    public int getIDForEmployee(@Valid Employee employee){
        log.debug("start method getIDForEmployee");
        return employee.getIdEmployee();
    }

    public String getTitleForCustomer(@Valid Customer customer){
        log.debug("start method getTitleForCustomer");
        return customer.getTitle();
    }

    public int getIDForCustomer(@Valid Customer customer){
        log.info("start method getIDForCustomer");
        log.debug("start method getIDForCustomer");
        return customer.getIdCustomer();
    }
}