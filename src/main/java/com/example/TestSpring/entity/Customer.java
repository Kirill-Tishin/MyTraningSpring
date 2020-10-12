package com.example.TestSpring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@AllArgsConstructor
public class Customer {
    private String title;
    private int idCustomer;
}
