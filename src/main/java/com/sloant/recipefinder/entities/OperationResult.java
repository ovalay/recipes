package com.sloant.recipefinder.entities;

public class OperationResult<T> {


    private int statusCode;
    private T payload;
    private String errorMessage;

    public OperationResult(int statusCode, T payload, String errorMessage) {
        this.statusCode = statusCode;
        this.payload = payload;
        this.errorMessage = errorMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
