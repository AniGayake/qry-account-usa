package com.bank.of.america.qry.account.usa.repository;

import com.bank.of.america.qry.account.usa.bo.SalaryAccountDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
@Repository
public interface SalaryAccountDetailsRepository extends CrudRepository<SalaryAccountDetails, BigInteger> {
}
