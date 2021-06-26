package com.hcl.hackathon.FinancialExpenses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.hackathon.FinancialExpenses.entity.Transaction;

@Repository
public interface TransactionInterface extends JpaRepository<Transaction, Integer>{

} 
