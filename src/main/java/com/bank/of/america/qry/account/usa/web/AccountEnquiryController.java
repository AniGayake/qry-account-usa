package com.bank.of.america.qry.account.usa.web;

import com.bank.of.america.qry.account.usa.bo.SavingAccountDetails;
import com.bank.of.america.qry.account.usa.service.SalaryAccountDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/")
public class AccountEnquiryController {


    private SalaryAccountDetailsService salaryAccountDetailsService;
    @Autowired
    public AccountEnquiryController(SalaryAccountDetailsService salaryAccountDetailsService){
        this.salaryAccountDetailsService=salaryAccountDetailsService;
    }
    @GetMapping("account/{accountNumber}")
    public SavingAccountDetails getAccountDetails(@PathVariable(name = "accountNumber") BigInteger accountNumber){
        Optional<SavingAccountDetails> savingAccountDetails = salaryAccountDetailsService.getSalaryAccountDetails(accountNumber);
        return savingAccountDetails.orElse(null);
    }

}
