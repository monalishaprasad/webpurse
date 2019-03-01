package com.purseWeb.viksuuPurse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purseWeb.viksuuPurse.model.Coins;
import com.purseWeb.viksuuPurse.repository.CoinRepository;

@Service
public class CoinBusinessService {

	@Autowired
	private CoinRepository rep;
	public Coins addCoin(Coins coin){
		
		Coins newCoin = rep.save(coin);
		return newCoin;
	}
	

}
