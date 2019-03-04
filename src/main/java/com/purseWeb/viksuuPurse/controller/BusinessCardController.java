package com.purseWeb.viksuuPurse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purseWeb.viksuuPurse.model.BusinessCard;
import com.purseWeb.viksuuPurse.service.BusinessCardService;

@RestController
public class BusinessCardController {
	
	@Autowired
	private BusinessCardService service;
	
	@PostMapping("/addBusinessCard")
	public BusinessCard insertBusinessCard(BusinessCard addCard){
		
		BusinessCard addBusinessCard = service.addCard(addCard);
		return addBusinessCard;
		
	}

	@GetMapping("/getBusinessCard")
	public List<BusinessCard> getTheBusinessCard(){
		List<BusinessCard> businessCard = service.getBusinessCard();
		
		return businessCard;
	}
}
