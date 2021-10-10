package com.management.employee.ems.domain;

public enum UserAuthority {
    NORMAL("일반"),
    ADMIN("관리자");

    private final String value;

    UserAuthority(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
