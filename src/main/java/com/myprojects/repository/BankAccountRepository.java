package com.myprojects.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer>{

	BankAccount findByMobileNumber(String mobileNumber);

}
