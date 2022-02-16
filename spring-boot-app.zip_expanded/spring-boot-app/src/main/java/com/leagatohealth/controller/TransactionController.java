package com.leagatohealth.controller;

import org.omg.CORBA.portable.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leagatohealth.beans.TransactionDetails;
import com.leagatohealth.service.TransactionService;

@RestController
@RequestMapping("trans")
public class TransactionController {
	
	@Autowired
	private TransactionService transService;
    
	@PostMapping("/post")
	private ResponseEntity<Object> saveTransDetails(@RequestBody TransactionDetails transDetails){
		String respoane = transService.storeTransaction(transDetails);
		return new ResponseEntity<>(respoane, HttpStatus.OK);
	}
}
