package com.hcl.hackathon.FinancialExpenses.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.hcl.hackathon.FinancialExpenses.dto.TransactionDetails;
import com.hcl.hackathon.FinancialExpenses.dto.TransactionResponse;
import com.hcl.hackathon.FinancialExpenses.entity.Account;
import com.hcl.hackathon.FinancialExpenses.entity.Transaction;
import com.hcl.hackathon.FinancialExpenses.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	TransactionService transactionService;
	
	@RequestMapping(method = RequestMethod.POST,value="/customertransactions")
	public ResponseEntity<String>  createTransaction(@RequestBody Object transaction)
	{
         ObjectMapper objectMapper=new ObjectMapper();
         String jsonString = null;
		try {
			jsonString = objectMapper.writeValueAsString(transaction);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         JSONObject jsonObject=new JSONObject(jsonString);
         
         String transDes=(String) jsonObject.get("transDesc");
         Double amount=(Double) jsonObject.get("amount");
        // String PaymentType=(String) jsonObject.get("paymentType");
         String PaymentType=null;
         
         if(PaymentType==null)
         {
        	 return ResponseEntity.badRequest().body("Payment Type cannot be null");
         }
         else if(amount<0.0)
         {
        	 return ResponseEntity.badRequest().body("Amount should not be less than 0");
         }
         
         Transaction transact=new Transaction();
         transact.setTransDesc(transDes);
         transact.setPaymentType(PaymentType);
         transact.setAmount(amount);
         
		
		Integer transactionId=transactionService.createTransaction(transact);
		
		
                 return ResponseEntity.accepted().body("Transaction id"+transactionId);
		
	}
}
