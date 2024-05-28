package com.bank.of.america.qry.account.usa.service;

import com.bank.of.america.qry.account.usa.bo.TransactionDetails;
import com.bank.of.america.qry.account.usa.repository.TransactionDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionDetailsService {
    private TransactionDetailsRepo transactionDetailsRepo;
    @Autowired
    public TransactionDetailsService(TransactionDetailsRepo transactionDetailsRepo){
        this.transactionDetailsRepo=transactionDetailsRepo;
    }

    public List<TransactionDetails> getTransactionDetailsByAccountNumber
            (final BigInteger accountNumber,final Integer pageNo,Integer pageSize){
        Pageable paging = PageRequest.of(pageNo,pageSize);
        Page<TransactionDetails> pageResults = transactionDetailsRepo.findTransactionDetailsByAccountNumber(accountNumber,paging);

        if(pageResults.hasContent()){
            return pageResults.getContent();
        }else{
            return new ArrayList<TransactionDetails>();
        }
    }

}
