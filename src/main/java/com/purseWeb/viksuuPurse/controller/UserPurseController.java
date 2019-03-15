package com.purseWeb.viksuuPurse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.purseWeb.viksuuPurse.model.Purse;
import com.purseWeb.viksuuPurse.service.CalculatorBusinessService;
import com.purseWeb.viksuuPurse.utility.UserPurse;

@RestController
public class UserPurseController {

	@Autowired
	private CalculatorBusinessService service;
	
	@PostMapping("/postUserPurse")
	public Purse userPurse(@RequestBody UserPurse addPurse){	
		
		Purse intoPurse = service.calculatePurse(addPurse);
	

		
		return intoPurse;
		
	}
}
