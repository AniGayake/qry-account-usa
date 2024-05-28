package com.bank.of.america.qry.account.usa.web;

import com.bank.of.america.qry.account.usa.bo.SalaryAccountDetails;
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
    public SalaryAccountDetails getAccountDetails(@PathVariable(name = "accountNumber") BigInteger accountNumber){
        Optional<SalaryAccountDetails> savingAccountDetails = salaryAccountDetailsService.getSalaryAccountDetails(accountNumber);
        return savingAccountDetails.orElse(null);
    }

}
