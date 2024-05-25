package com.bank.of.america.qry.account.usa.bo;


import jakarta.persistence.*;

import java.math.BigInteger;
@Entity
@Table(name = "BOA_ACCOUNT_DETAILS")
@Inheritance(strategy = InheritanceType.JOINED)
public class AccouontDetails {
    @Id
    private BigInteger accountNumber;
    private String accountHolderName;
    private String accountType;
    private String modeOfOperation;
    private String accountDescription;
    private String bankName;
    private String branchCode;
    private String branchName;
    private String bankCity;
    private String bankState;
    private String bankCountry;
    private String bankPincode;
    private String ifscCode;
    private String currencyCode;
    private String bankPhone;
    private String bankPhoneExtension;

    public AccouontDetails(){

    }

    public BigInteger getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(BigInteger accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public String getAccountDescription() {
        return accountDescription;
    }

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getBankState() {
        return bankState;
    }

    public void setBankState(String bankState) {
        this.bankState = bankState;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public String getBankPincode() {
        return bankPincode;
    }

    public void setBankPincode(String bankPincode) {
        this.bankPincode = bankPincode;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getBankPhoneExtension() {
        return bankPhoneExtension;
    }

    public void setBankPhoneExtension(String bankPhoneExtension) {
        this.bankPhoneExtension = bankPhoneExtension;
    }

    @Override
    public String toString() {
        return "AccouontDetails{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", modeOfOperation='" + modeOfOperation + '\'' +
                ", accountDescription='" + accountDescription + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", branchName='" + branchName + '\'' +
                ", bankCity='" + bankCity + '\'' +
                ", bankState='" + bankState + '\'' +
                ", bankCountry='" + bankCountry + '\'' +
                ", bankPincode='" + bankPincode + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", bankPhone='" + bankPhone + '\'' +
                ", bankPhoneExtension='" + bankPhoneExtension + '\'' +
                '}';
    }
}
