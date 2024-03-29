package com.example.TestSpring.validators;

import com.example.TestSpring.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
@Slf4j
public class CustomerValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Customer.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Customer customer = (Customer) o;

        log.debug("Start validate customer");

        if (customer.getIdCustomer() == 1) {
            log.info("Id is can't be 1");
            log.error("Id is can't be 1");
        }
        if (!customer.getTitle().equals("Name2")) {
            log.debug("Name is can't be 'Name2'");
        }
    }
}
