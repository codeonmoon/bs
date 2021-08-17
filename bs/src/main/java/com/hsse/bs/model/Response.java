package com.hsse.bs.model;

public class Response {
    private String message;
    private String transactionId;
    private PaymentStatus status;

    public Response() {
    }

    public Response(String message, PaymentStatus status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
