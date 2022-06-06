package com.base.web.enums;

public enum Value {

    IMPLICIT_WAIT_TIME(20);

    private int value;

    Value(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }
}
