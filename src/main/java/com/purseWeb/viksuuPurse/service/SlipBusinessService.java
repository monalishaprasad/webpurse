package com.purseWeb.viksuuPurse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purseWeb.viksuuPurse.model.Slip;
import com.purseWeb.viksuuPurse.repository.SlipRepository;

@Service
public class SlipBusinessService {
	
	@Autowired
	private SlipRepository repo;
	
	public Slip addSlip(Slip slip){
		
		Slip slips = repo.save(slip);
		
		return slips;
		
	}
	
	
	

}
