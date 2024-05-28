package com.bank.of.america.qry.account.usa.service;

import com.bank.of.america.qry.account.usa.bo.SalaryAccountDetails;
import com.bank.of.america.qry.account.usa.repository.SalaryAccountDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class SalaryAccountDetailsService {
    @Autowired
    private SalaryAccountDetailsRepository salaryAccountDetailsRepository;

    public Optional<SalaryAccountDetails> getSalaryAccountDetails(BigInteger accountNumber){
        Optional<SalaryAccountDetails> salaryAccountDetails = salaryAccountDetailsRepository.findById(accountNumber);
        salaryAccountDetails.ifPresent(accountDetails -> System.out.println(accountDetails.getAccountNumber()+" "+accountDetails.getAccountHolderName()));
        return salaryAccountDetails;
    }
}
