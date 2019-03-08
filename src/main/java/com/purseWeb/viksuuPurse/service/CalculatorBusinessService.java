package com.purseWeb.viksuuPurse.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purseWeb.viksuuPurse.model.Notes;
import com.purseWeb.viksuuPurse.model.Purse;
import com.purseWeb.viksuuPurse.repository.NoteRepository;
import com.purseWeb.viksuuPurse.repository.PurseRepository;
import com.purseWeb.viksuuPurse.utility.UserPurse;

@Service
public class CalculatorBusinessService {

	@Autowired
	private PurseRepository repo;
	private static long amount = 0;

	@Autowired
	public NoteRepository reps;
	
	public Purse purseOperation(UserPurse userPurse){
		
		
		Purse purse = userSpecificToApplicationSpecific(userPurse);
		long totalBal = calculateCash(purse);
		purse.setTotalBalance(totalBal);
		
		
		//total bankbalance
		
		
		
		
		return purse;
		
	}
	
	private long calculateCash(Purse purse){
		
		purse.getNotes().forEach(e-> {
			
		}	
				);
		
		return 0;
		
 	}
   private Purse  userSpecificToApplicationSpecific(UserPurse userPurse) {
	
	Purse purse = new Purse();
	
	List<Notes> addingList = new ArrayList<>();
//	Get all types of note -> 
	 
	
	
	List<Notes> allNotes = reps.findAll();
	
	
	allNotes.forEach(realNote-> {
		userPurse.getNotes().forEach(userType->{
			if(realNote.getNum()==(Integer)userType){
				addingList.add(realNote); //purse me add
				
				
			}
		});
	});
	
	purse.setNotes(addingList);
	

	
	
			
	//match the amount of userPurse with List of note purse
	 // if match >> add that object into purse note list
	
	//match the amount of usercoins with the list of Coin purse
	  // if match >> add to coin object into purse coin list
	
	
	
	// after adding all note and purse return it to purse 
	
	return purse;
}// end
	
	/*public long calculateCash(Purse purse) {

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
		return tCard;
		
	}

	public int numberOfSlips(Purse purse) {
		int nOS = 0;
		nOS = purse.getSlips().size();

		System.out.println("Total number of Slips in vikash's purse " + nOS);

		return purse.getSlips().size();
	}*/

}