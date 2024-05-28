package com.bank.of.america.qry.account.usa.bo;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "BOA_SALARY_ACCOUNT_DETAILS")
@PrimaryKeyJoinColumn(name = "salary_account_number")
public class SalaryAccountDetails extends AccouontDetails{

    private String organisationName;
    @Column(name = "interest_rate_on_savings")
    private BigDecimal rateOfInterestOnSalaryAccount;
    @Column(name = "interest_rate_on_fd")
    private BigDecimal rateOfInterestOnFD;
    @Column(name = "account_balance")
    private BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public SalaryAccountDetails() {
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public BigDecimal getRateOfInterestOnSalaryAccount() {
        return rateOfInterestOnSalaryAccount;
    }

    public void setRateOfInterestOnSalaryAccount(BigDecimal rateOfInterestOnSalaryAccount) {
        this.rateOfInterestOnSalaryAccount = rateOfInterestOnSalaryAccount;
    }

    public BigDecimal getRateOfInterestOnFD() {
        return rateOfInterestOnFD;
    }

    public void setRateOfInterestOnFD(BigDecimal rateOfInterestOnFD) {
        this.rateOfInterestOnFD = rateOfInterestOnFD;
    }

    @Override
    public String toString() {
        return "SalaryAccountDetails{" +
                "organisationName='" + organisationName + '\'' +
                ", rateOfInterestOnSalaryAccount=" + rateOfInterestOnSalaryAccount +
                ", rateOfInterestOnFD=" + rateOfInterestOnFD +
                ", balance=" + balance +
                '}';
    }
}
