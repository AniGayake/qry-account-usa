package com.bank.of.america.qry.account.usa.repository;

import com.bank.of.america.qry.account.usa.bo.TransactionDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface TransactionDetailsRepo extends CrudRepository<TransactionDetails, BigInteger>, PagingAndSortingRepository<TransactionDetails,BigInteger> {
    Page<TransactionDetails> findTransactionDetailsByAccountNumber(BigInteger accountNumber, Pageable pageable);
}
