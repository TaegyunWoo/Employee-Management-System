package com.management.employee.ems.domain;

public enum Department {
    ADMINISTRATION("관리부"),
    MANAGEMENT("경영재무부"),
    MARKETING("마케팅부"),
    SALES("영업부"),
    CUSTOMER("고객부");

    private final String value;

    Department(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
