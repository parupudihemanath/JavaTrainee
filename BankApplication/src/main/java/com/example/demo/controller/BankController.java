package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bank;
import com.example.demo.service.BankService;

@RestController
public class BankController {
	
	@Autowired
	BankService bankservice;
	
	@PostMapping("/newbank")
	public void createBank(@RequestBody Bank bank)
	{
		bankservice.addBank(bank);
	}
	
	@GetMapping("/AllBanks")
	public List<Bank> getAllBanks()
	{
		return bankservice.getAllBanks();
	}
	
	@GetMapping("/bank/{name}")
	public List<String> getIfscCodeByBank(@PathVariable String name)
	{
		 return bankservice.getIfscCodeByBank(name);
	}
	
	@PutMapping("/update")
	public Bank updateBankDetails(@RequestBody Bank bank)
	{
		return bankservice.updateBankDetails(bank);
	}
       
	@PutMapping("/delete/{ifscCode}")
	public void deleteBank(@PathVariable String ifscCode)
	{
		bankservice.deleteBank(ifscCode);
	}
	
	@PutMapping("updatebank")
	public int updateBank(@RequestBody Bank bank)
	{
		return bankservice.updateBank(bank);
	}
	
	@GetMapping("/bank/page")
	public Page<Bank> getTopicsByPage(@RequestParam("pageNo") Optional<Integer> pageParam,@RequestParam("sort") Optional<String> sortBy)
	{
		return bankservice.getTopicByPage(pageParam,sortBy);
	}
}
