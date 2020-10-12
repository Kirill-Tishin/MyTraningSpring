package com.example.TestSpring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

@Data
@Slf4j
@AllArgsConstructor
public class Employee {
    private String name;
    private int idEmployee;
}