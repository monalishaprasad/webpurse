package com.purse;

import java.util.ArrayList;
import java.util.List;

import com.cards.BusinessCard;
import com.cards.Card;
import com.cards.CreditCard;
import com.cards.DebitCard;
import com.currency.Coins;
import com.currency.Notes;
import com.service.Calculator;
import com.slips.Slip;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// object of notes
		Notes tenRs = new Notes();
		tenRs.setColor("Yellow");
		tenRs.setImage("Gandhi");
		tenRs.setNum(10);
		tenRs.setPaper("plane");

		Notes fiftyRs = new Notes();
		fiftyRs.setColor("Yellow");
		fiftyRs.setImage("Gandhi");
		fiftyRs.setNum(50);
		fiftyRs.setPaper("plane");

		// Adding the notes to the object of the list notes
		List<Notes> notes = new ArrayList<>();
		notes.add(tenRs);
		notes.add(fiftyRs);

		// making object of coins and setting the values
		Coins coinFive = new Coins();
		coinFive.setImage("GandhiPic");
		coinFive.setNumber(5);
		coinFive.setRadius(1);

		Coins coinOne = new Coins();
		coinOne.setImage("GandhiPic");
		coinOne.setNumber(1);
		coinOne.setRadius(1);

		// Adding the coins to the list of coins
		List<Coins> coins = new ArrayList<>();
		coins.add(coinFive);
		coins.add(coinOne);

		// Making object of slip and setting the values
		Slip mySlip = new Slip();
		mySlip.setBillAmount(1000);
		mySlip.setDesccription("Shopping");
		mySlip.setSlipType("ShoppingType");

		Slip mySlipTwo = new Slip();
		mySlipTwo.setBillAmount(1500);
		mySlipTwo.setDesccription("Medical");
		mySlipTwo.setSlipType("Medicine");

		// Adding the object of the slip to the list of Slips
		List<Slip> slips = new ArrayList<>();
		slips.add(mySlip);
		slips.add(mySlip);

		// Making the object of debitcard and setting the values
		DebitCard axisDebitCard = new DebitCard();
		axisDebitCard.setBalance(5000);
		axisDebitCard.setBankName("Axis Bank");
		axisDebitCard.setCardNo(123445455);
		axisDebitCard.setCvv(453);
		axisDebitCard.setDebitCardType("Visa");
		axisDebitCard.setExpirayDate("May10");
		axisDebitCard.setNameOnCard("Vikash");

		DebitCard sbiDebitCard = new DebitCard();
		sbiDebitCard.setBalance(8000);
		sbiDebitCard.setBankName("SBI Bank");
		sbiDebitCard.setCardNo(1239785455);
		sbiDebitCard.setCvv(953);
		sbiDebitCard.setDebitCardType("Rupay");
		sbiDebitCard.setExpirayDate("April10");
		sbiDebitCard.setNameOnCard("Vikash");

		// Making the object of Credit Card and setting the values
		CreditCard axisCreditCard = new CreditCard();
		axisCreditCard.setBankName("Axis bank");
		axisCreditCard.setCardNo(12345678);
		axisCreditCard.setCreditCardType("visa");
		axisCreditCard.setExpirayDate("24 feb");
		axisCreditCard.setNameOnCard("Viaksh");

		CreditCard sbiCreditCard = new CreditCard();
		sbiCreditCard.setBankName("SBI bank");
		sbiCreditCard.setCardNo(123437678);
		sbiCreditCard.setCreditCardType("Rupay");
		sbiCreditCard.setExpirayDate("21/02");
		sbiCreditCard.setNameOnCard("Viaksh");

		// making the object of businessCard
		BusinessCard bCard = new BusinessCard();
		bCard.setAddress("101 laal street");
		bCard.setCompanyName("Akash Press");
		bCard.setMobileNumber(97788987);
		bCard.setName("Prakash");

		BusinessCard bCard2 = new BusinessCard();
		bCard2.setAddress("101 blue street");
		bCard2.setCompanyName("Akash Enterprises");
		bCard2.setMobileNumber(97978987);
		bCard2.setName("Akash");

		// Adding the object of card to the list
		List<Card> card = new ArrayList<>();
		card.add(axisDebitCard);
		card.add(sbiDebitCard);
		card.add(axisCreditCard);
		card.add(sbiCreditCard);
		card.add(bCard);
		card.add(bCard2);

		// Adding the list of notes, coins, slips,and cards to the object of
		// purse
		Purse vikashPurse = new Purse();
		vikashPurse.setNotes(notes);
		vikashPurse.setCoins(coins);
		vikashPurse.setSlips(slips);
		vikashPurse.setCard(card);

		// Making the object of the calculator class to call the methods
		Calculator calculate = new Calculator();

		// calculate.calculateCash(vikashPurse);
		calculate.bankbalance(vikashPurse);

		// Gives the number of cards in the purse
		calculate.numberOfDebitCards(vikashPurse);
		calculate.numberOfCreditCard(vikashPurse);
		calculate.numberOfBusinessCard(vikashPurse);
		calculate.totalCards(vikashPurse);

		// Gives the number of slips in the card
		calculate.numberOfSlips(vikashPurse);
		
		System.out.println(vikashPurse.getNotes().size());
	}

}
