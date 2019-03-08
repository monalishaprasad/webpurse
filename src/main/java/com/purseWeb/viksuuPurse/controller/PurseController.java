package com.purseWeb.viksuuPurse.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.purseWeb.viksuuPurse.model.Purse;
import com.purseWeb.viksuuPurse.service.CalculatorBusinessService;
import com.purseWeb.viksuuPurse.utility.UserPurse;

@RestController
public class PurseController {
	 
	private CalculatorBusinessService service;
	
	@PostMapping("/addIntoPurse")
	 public Purse insertIntoPurse(@RequestBody UserPurse userPurse){
		
		Purse insidePurse = service.purseOperation(userPurse);
		
		return insidePurse;
		
	}

}
