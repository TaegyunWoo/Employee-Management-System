package com.management.employee.ems.domain;

public enum Rank {
    PRESIDENT("사장"),
    DIRECTOR("이사"),
    MANAGER("과장"),
    ASSISTANT_MANAGER("대리"),
    STAFF("사원");

    private final String value;

    Rank(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
