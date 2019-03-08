package com.purseWeb.viksuuPurse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.purseWeb.viksuuPurse.model.Slip;
import com.purseWeb.viksuuPurse.service.SlipBusinessService;

@RestController
public class SlipController {

	@Autowired
	private SlipBusinessService service;

	@PostMapping("/insertSlip")
	public Slip createSlip(@RequestBody Slip addSlips) {

		Slip slip = service.addSlip(addSlips);
		return slip;

	}

	@GetMapping("/getSlips")
	public List<Slip> allSlip() {
		List<Slip> slips = service.getSlip();

		return slips;
	}

}
