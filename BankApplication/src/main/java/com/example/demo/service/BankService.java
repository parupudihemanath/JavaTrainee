package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Bank;
import com.example.demo.repositry.BankRepositry;

@Service
public class BankService {

	@Autowired
	BankRepositry bankrepositry;

	public void addBank(Bank bank) {
		bankrepositry.save(bank);

	}

	public List<Bank> getAllBanks() {
		return bankrepositry.findAll();
	}

	public List<String> getIfscCodeByBank(String name) {
		
		return bankrepositry.findByBankName(name); 
	}
	
	public Bank updateBankDetails(Bank bank)
	{
	  Optional<Bank> findById = bankrepositry.findById(bank.getBankId());
	  if(findById.isPresent())
	  {
		 return bankrepositry.save(bank);
	  }
	  return null;
	}
	
	
	public void deleteBank(String ifscCode)
	{
		bankrepositry.findByIfscCode(ifscCode);
	}

	public int updateBank(Bank bank) {
		Optional<Bank> findById = bankrepositry.findById(bank.getBankId());
		if(findById.isPresent())
		{
			return bankrepositry.updateBank(bank.getBankName(),bank.getBranchName(),bank.getBankAddress(),bank.getIfscCode());
		}
		return -1;
	}

	public Page<Bank> getTopicByPage(Optional<Integer> pageParam, Optional<String> sortBy) {
		return bankrepositry.findAll(PageRequest.of(
				pageParam.orElse(0),
				3,
				Direction.DESC,
				sortBy.orElse("bankId")));
	}

}
