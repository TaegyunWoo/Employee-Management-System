package com.management.employee.ems.domain;

import java.util.Optional;

public class Employee {
    Long employeeNumber;
    String name;
    String email;
    int age;
    int rate;
    Department department;
    Rank rank;
    Optional<User> userInfo;
}
