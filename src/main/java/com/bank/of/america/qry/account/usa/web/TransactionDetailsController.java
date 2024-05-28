package com.bank.of.america.qry.account.usa.web;

import com.bank.of.america.qry.account.usa.bo.TransactionDetails;
import com.bank.of.america.qry.account.usa.response.TransactionDetailsResponse;
import com.bank.of.america.qry.account.usa.service.TransactionDetailsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.logging.LogManager;

@CrossOrigin
@RestController
@RequestMapping("v1/api/")
public class TransactionDetailsController {

    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger((TransactionDetailsController.class));

    private TransactionDetailsService transactionDetailsService;

    @Autowired
    public TransactionDetailsController(TransactionDetailsService transactionDetailsService){
        this.transactionDetailsService=transactionDetailsService;
    }

    @GetMapping("account/{accountNumber}/transactions")
    public TransactionDetailsResponse getTransactionDetails(@PathVariable(name = "accountNumber")BigInteger accountNumber,
                                                            @RequestParam(defaultValue = "0") Integer pageNo,
                                                            @RequestParam(defaultValue = "10") Integer pageSize){

        TransactionDetailsResponse transactionDetailsResponse= new TransactionDetailsResponse();
        LOGGER.debug("Entering into getTransactionDetails() to get Transaction List with accountNumber {}",accountNumber);
        List<TransactionDetails> transactionDetailsList= transactionDetailsService.getTransactionDetailsByAccountNumber(accountNumber,pageNo,pageSize);

        transactionDetailsResponse.setTransactionDetails(transactionDetailsList);
        LOGGER.debug("Returning the TransactionDetailsList to user for customer {} ",accountNumber);
        return transactionDetailsResponse;

    }
}
