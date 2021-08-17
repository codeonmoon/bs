package com.hsse.bs.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

public class Payment {
    public UUID transactionId;
    public String payerName;
    public String payeeName;
    public String valueDate;
    public BigDecimal amount;
    public Currency currency;
    public String payerCountryCode;
    public String payeeCountryCode;
    public String payerBank;
    public String payeeBank;
    public String paymentInstruction;

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getPayerCountryCode() {
        return payerCountryCode;
    }

    public void setPayerCountryCode(String payerCountryCode) {
        this.payerCountryCode = payerCountryCode;
    }

    public String getPayeeCountryCode() {
        return payeeCountryCode;
    }

    public void setPayeeCountryCode(String payeeCountryCode) {
        this.payeeCountryCode = payeeCountryCode;
    }

    public String getPayerBank() {
        return payerBank;
    }

    public void setPayerBank(String payerBank) {
        this.payerBank = payerBank;
    }

    public String getPayeeBank() {
        return payeeBank;
    }

    public void setPayeeBank(String payeeBank) {
        this.payeeBank = payeeBank;
    }

    public String getPaymentInstruction() {
        return paymentInstruction;
    }

    public void setPaymentInstruction(String paymentInstruction) {
        this.paymentInstruction = paymentInstruction;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "transactionId='" + transactionId + '\'' +
                ", payerName='" + payerName + '\'' +
                ", payeeName='" + payeeName + '\'' +
                ", valueDate='" + valueDate + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", payerCountryCode='" + payerCountryCode + '\'' +
                ", payeeCountryCode='" + payeeCountryCode + '\'' +
                ", payerBank='" + payerBank + '\'' +
                ", payeeBank='" + payeeBank + '\'' +
                ", paymentInstruction='" + paymentInstruction + '\'' +
                '}';
    }
}

