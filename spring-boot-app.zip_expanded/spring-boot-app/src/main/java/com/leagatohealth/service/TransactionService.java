package com.leagatohealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leagatohealth.beans.TransactionDetails;
import com.leagatohealth.beans.TransactionType;
import com.leagatohealth.dao.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository repository;
	
     public String storeTransaction(TransactionDetails transDeatils) {
    	 String referenceNo = "BANKID"+"ACCOUNTNO"+"CurrentTIME";
    	 TransactionDetails t1= new TransactionDetails(referenceNo,transDeatils.getAccNo(),TransactionType.CR,transDeatils.getBankId(),transDeatils.getIfsc());
    	 TransactionDetails t2= new TransactionDetails(referenceNo,transDeatils.getAccNo(),TransactionType.DR,transDeatils.getBankId(),transDeatils.getIfsc());

    	 repository.save(t1);
    	 repository.save(t2);
    	 return "Data is Saved";
     }
}
