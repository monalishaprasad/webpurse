package com.purseWeb.viksuuPurse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purseWeb.viksuuPurse.model.DebitCard;
import com.purseWeb.viksuuPurse.repository.DebitCardRepository;

@Service
public class DebitCardBusinessService {

	@Autowired
	private DebitCardRepository repo;

	public DebitCard addDebitCard(DebitCard debitCard) {

		DebitCard debitCards = repo.save(debitCard);
		return debitCards;

	}

	public List<DebitCard> getDebitCard() {

		List<DebitCard> newDebitCard = repo.findAll();

		return newDebitCard;
	}

}
