package com.bank.of.america.qry.account.usa.response;

import com.bank.of.america.qry.account.usa.bo.TransactionDetails;

import java.util.List;

public class TransactionDetailsResponse {
    private String type = "Transaction_Details_list";
    private List<TransactionDetails> transactionDetails;

    public TransactionDetailsResponse() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<TransactionDetails> getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(List<TransactionDetails> transactionDetails) {
        this.transactionDetails = transactionDetails;
    }
}
