package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
@RestController
public class AccountController {
	
	ArrayList<Accounts> accountList = new ArrayList<Accounts>();
	@GetMapping("/")
	ArrayList<Accounts>getAllUserDetails() {
		return accountList;
	}
	@GetMapping("/{name}")
	public Accounts getAccount(@PathVariable String name) {
		
		System.out.println(name);
		for(Accounts account : accountList) {
			System.out.println(account.getOwnername() + " -- ");
			if(account.getOwnername().equals(name))
				return account;
		}
		
		System.out.println("Acccount Not found");
		return null;
	}
	
	@PostMapping()
	public String addAccount(@RequestBody Accounts account) {
		if(account.equals(null))
			return "Cannot enter null values";
		
		accountList.add(account);
		return "Account successfully added !";
	}
}
