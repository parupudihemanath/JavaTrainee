package com.example.demo.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Bank;

import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;

public interface BankRepositry extends JpaRepository<Bank, Integer> {

	@Transactional
	@Modifying
	@Query("select b.ifscCode from Bank b where b.bankName=:name")
     public List<String> findByBankName(String name);

	@Transactional
	@Modifying
	@Query("delete from Bank b where b.ifscCode=:ifscCode")
	public void findByIfscCode(String ifscCode);

	@Transactional
	@Modifying
	@Query("update Bank b set b.bankName=:name,b.branchName=:branchname,b.bankAddress=:bankaddress where b.ifscCode=:ifscCode")
	int updateBank(@PathParam("name")String name,@PathParam("branchname")String branchname,@PathParam("bankaddress")String bankaddress,@PathParam("ifscCode")String ifscCode );



//	@Query("update Bank b set b.bankname=:name, b.address=:address, b.branch=:branch where b.ifsccode=:ifsccode")
//    int updateByBankIfscCode(@PathParam("name")String name,@PathParam("address")String address,@PathParam("branch")String branch,@PathParam("ifsccode")String ifsccode);
//	@Query("update Bank b set b.bankName=name from Bank b where b.bankId=:bankId")
//	public Bank updateBankDetails(Bank bank, int bankId);

	

}
