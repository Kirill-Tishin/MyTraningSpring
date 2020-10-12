package com.example.TestSpring.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

@Data
@Slf4j
public class Employee {
    private String name;
    private int idEmployee;
}