package com.purseWeb.viksuuPurse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purseWeb.viksuuPurse.model.BusinessCard;
import com.purseWeb.viksuuPurse.repository.BusinessCardRepository;

@Service
public class BusinessCardService {

	@Autowired
	private BusinessCardRepository repo;

	public BusinessCard addCard(BusinessCard addCards) {

		BusinessCard addBusinessCard = repo.save(addCards);
		return addBusinessCard;

	}

	public List<BusinessCard> getBusinessCard() {

		List<BusinessCard> newBusinessCard = repo.findAll();
		return newBusinessCard;
	}

}
