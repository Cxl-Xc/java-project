package com.example.cxl.utils;
import org.springframework.lang.Nullable;

public class Result {

    private Status status;
    private String message;
    private Object data;

    public Result() {
    }

    public Result(Status status, Object data) {
        this.status = status;
        this.data = data;
    }

    public Result(Status status, String message) {
        this.status = status;
        this.message = message;
    }

    public Result(Status status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public void resultSet(Status status, Object data) {
        this.status = status;
        this.data = data;
    }

    public void resultSet(Status status, String message) {
        this.status = status;
        this.message = message;
    }

    public Result resultSet(Status status, String message, @Nullable Object data) {
        this.status = status;
        this.message = message;
        if (data != null) {
        this.data = data;
        }
        return null;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
