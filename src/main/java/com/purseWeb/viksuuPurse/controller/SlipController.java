package com.purseWeb.viksuuPurse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.purseWeb.viksuuPurse.model.Slip;
import com.purseWeb.viksuuPurse.service.SlipBusinessService;

@RestController
public class SlipController {
	
	@Autowired
	private SlipBusinessService service;
	
	@PostMapping
	public Slip getTheSlip(@RequestBody Slip addSlips){
		
		Slip slip = service.addSlip(addSlips);
		return slip;
		
	}
	
	
}
