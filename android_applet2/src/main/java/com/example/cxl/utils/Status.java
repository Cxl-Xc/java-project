package com.example.cxl.utils;

public enum Status {

    SUCCESS(200,true), FAILURE(300,false);

    private Integer code;
    private Boolean state;

    Status() {
    }

    Status(Integer code, Boolean state) {
        this.code = code;
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Status{" +
                "code=" + code +
                ", state=" + state +
                '}';
    }
}
