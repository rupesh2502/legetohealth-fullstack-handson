package com.leagatohealth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leagatohealth.beans.TransactionDetails;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionDetails, Long> {

}
