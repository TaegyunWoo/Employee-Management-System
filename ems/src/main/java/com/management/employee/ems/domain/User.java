package com.management.employee.ems.domain;

import java.util.Optional;

public class User {
    String userId;
    String password;
    UserAuthority userAuthority;
    Optional<Employee> employeeInfo;
}
