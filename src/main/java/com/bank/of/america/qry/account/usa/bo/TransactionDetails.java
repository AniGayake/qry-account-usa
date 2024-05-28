package com.bank.of.america.qry.account.usa.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "BOA_TRANSACTION_DETAILS")
public class TransactionDetails {
    @Id
    @Column(name = "transaction_reference_number")
    private BigInteger transactionReferenceNumber;

    @Column(name = "account_number")
    private BigInteger accountNumber;
    @Column(name = "transaction_details")
    private String transactionDetails;
    @Column(name = "transaction_date_time")
    private LocalDateTime transactionDateTime;
    @Column(name = "transaction_amount")
    private BigDecimal transactionAmount;

    public TransactionDetails() {
    }

    public BigInteger getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(BigInteger accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(String transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public BigInteger getTransactionReferenceNumber() {
        return transactionReferenceNumber;
    }

    public void setTransactionReferenceNumber(BigInteger transactionReferenceNumber) {
        this.transactionReferenceNumber = transactionReferenceNumber;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(LocalDateTime transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
