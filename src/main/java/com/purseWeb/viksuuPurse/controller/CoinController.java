package com.purseWeb.viksuuPurse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.purseWeb.viksuuPurse.model.Coins;
import com.purseWeb.viksuuPurse.service.CoinBusinessService;

@RestController
public class CoinController {

	@Autowired
	private CoinBusinessService service;

	@PostMapping("/addCoin")
	public Coins addTheCoin(@RequestBody Coins addCoins) {

		Coins coin = service.addCoin(addCoins);

		return coin;

	}
	
	@GetMapping("/getCoin")
	public List<Coins> allCoins(){
		
		List<Coins> coins = service.getCoin();
		return coins;
				
				
	}
}
