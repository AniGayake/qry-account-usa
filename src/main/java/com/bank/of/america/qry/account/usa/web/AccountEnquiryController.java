package com.bank.of.america.qry.account.usa.web;

import com.bank.of.america.qry.account.usa.bo.SavingAccountDetails;
import com.bank.of.america.qry.account.usa.service.SalaryAccountDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Optional;
@CrossOrigin
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
