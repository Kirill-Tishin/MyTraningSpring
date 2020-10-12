package com.example.TestSpring.validators;

import com.example.TestSpring.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
@Slf4j
public class EmployeeValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return EmployeeValidator.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Employee employee = (Employee)o;

        log.debug("Start validate employee");

        if (employee.getIdEmployee() == 0) {
            log.error("Id is can't be 0");
        }
        if (!employee.getName().equals("Name1")) {
            log.debug("Name is can't be 'Name1'");
        }
    }
}