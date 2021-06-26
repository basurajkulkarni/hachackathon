package com.hcl.hackathon.FinancialExpenses.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.hcl.hackathon.FinancialExpenses.entity.Transaction;
import com.hcl.hackathon.FinancialExpenses.repository.TransactionInterface;

@Service
public class TransactionService {
	
	
	
	@Autowired
	TransactionInterface transactionInterface;
	
	public Integer createTransaction(Transaction transaction) {
		// TODO Auto-generated method stub

			
				Transaction newtransaction=transactionInterface.save(transaction);


		return newtransaction.getTransId();

		
	}

}
