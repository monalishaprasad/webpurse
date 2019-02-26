package com.service;

import com.cards.BusinessCard;
import com.cards.Card;
import com.cards.CreditCard;
import com.cards.DebitCard;
import com.purse.Purse;

public class Calculator {

	private static long amount = 0;

	public long calculateCash(Purse purse) {

		System.out.println("doing");
		purse.getNotes().forEach(e -> {
			amount = amount + e.getNum();
		});

		purse.getCoins().forEach(e -> {
			amount = amount + e.getNumber();
		});

		System.out.println("Total cash in vikash's Purse = " + amount);
		return amount;
	}

	public long bankbalance(Purse purse) {

		calculateCash(purse);

		purse.getCard().forEach(e -> {

			if (e instanceof DebitCard) {
				DebitCard dc = (DebitCard) e;
				amount = amount + dc.getBalance();
			}

		});

		System.out.println("In debitCard");
		System.out.println("Total bank balance with the cash in vikash's Purse = " + amount);

		return amount;
	}

	public int numberOfDebitCards(Purse purse) {

		int count = 0;
		for (Card card : purse.getCard()) {
			if (card instanceof DebitCard)
				count++;

		}

		System.out.println("Total number of debit cards in vikash's purse "+count);
		return count;
	}

	public int numberOfCreditCard(Purse purse) {

		int count = 0;
		for (Card card : purse.getCard()) {
			if (card instanceof CreditCard)
				count++;
		}

		System.out.println("Total number of credit cards in vikash's purse "+count);
		return count;
	}

	public int numberOfBusinessCard(Purse purse) {
		int count = 0;
		for (Card card : purse.getCard()) {
			if (card instanceof BusinessCard)
				count++;
		}

		System.out.println("Total number of business cards in vikash's purse "+count);
		return count;
	}
	
	public int totalCards(Purse purse){
		
		int tCard=0;
		tCard=purse.getCard().size();
		
		System.out.println("Total number of cards in vikash's purse "+tCard);
		return 0;
		
	}

	public int numberOfSlips(Purse purse) {
		int nOS = 0;
		nOS = purse.getSlips().size();

		System.out.println("Total number of Slips in vikash's purse " + nOS);

		return purse.getSlips().size();
	}

}