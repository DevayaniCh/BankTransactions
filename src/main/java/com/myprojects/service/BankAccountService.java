package com.myprojects.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.myprojects.dto.BankAccountDTO;
import com.myprojects.entity.BankAccount;
import com.myprojects.exceptions.CustomerExceptions;

public interface BankAccountService 
{
 String addCustomer(BankAccountDTO dto) throws CustomerExceptions;

 BankAccountDTO viewCustomerDetails(Integer accNumber) throws CustomerExceptions;

ResponseEntity<String> depositAmount(Integer accNumber, double depositAmount) throws CustomerExceptions;

ResponseEntity<String> withdrawAmount(Integer accNumber, double withdrawfund) throws CustomerExceptions;

List<BankAccount> findAllAccounts() throws CustomerExceptions;

String deleteCustomer(Integer Id) throws CustomerExceptions;

ResponseEntity<String> transferAmount(Integer fromAccNumber, Integer toAccNumber, double transferFund) throws CustomerExceptions;

BankAccountDTO updateMobileNumber(Integer accNumber,String mobileNumber) throws CustomerExceptions;

}
