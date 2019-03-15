package com.purseWeb.viksuuPurse.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purseWeb.viksuuPurse.model.Card;
import com.purseWeb.viksuuPurse.model.Coins;
import com.purseWeb.viksuuPurse.model.DebitCard;
import com.purseWeb.viksuuPurse.model.Notes;
import com.purseWeb.viksuuPurse.model.Purse;
import com.purseWeb.viksuuPurse.repository.CoinRepository;
import com.purseWeb.viksuuPurse.repository.DebitCardRepository;
import com.purseWeb.viksuuPurse.repository.NoteRepository;
import com.purseWeb.viksuuPurse.repository.PurseRepository;
import com.purseWeb.viksuuPurse.utility.UserPurse;

@Service
public class CalculatorBusinessService {

	@Autowired
	private NoteRepository noteRepo;
	@Autowired
	private CoinRepository coinRepo;
	
	@Autowired
	private DebitCardRepository debitCardRepo;

	@Autowired
	private PurseRepository purseRepo;

	private static long amount = 0;

	public Purse calculatePurse(UserPurse userPurse) {

		Purse purse = new Purse();

		doNoteOperation(userPurse, purse);
		doCoinOperation(userPurse, purse);
		doCardOperation(userPurse, purse);

		// long purse = totalBalance(purse);
		// purse.setTotalBalance(totalBalance);
		return purse;

	}

	private Purse doNoteOperation(UserPurse userPurse, Purse purse) {
		// Purse purse = new Purse();
		purse.setPurseHolderName(userPurse.getPurseHolderName());

		StringBuilder strOfNote = new StringBuilder();
		List<Notes> allNotes = noteRepo.findAll();
		System.out.println(allNotes);

		String strArrNotes[] = userPurse.getNotes().split(",");
		for (String stNote : strArrNotes) {
			int x = Integer.parseInt(stNote);
			allNotes.forEach(repNote -> {

				System.out.println(repNote.getNum() + " ...  " + x);
				if (repNote.getNum() == x) {
					System.out.println(repNote.getNum() + "..." + x);
					amount = amount + x;

					strOfNote.append(x + ",");
				}
			});
		}
		String noteStr = strOfNote.toString();
		System.out.println(noteStr);
		noteStr = noteStr.substring(0, noteStr.length() - 1);

		System.out.println(noteStr);
		purse.setNotes(noteStr);

		return purse;
	}

	private Purse doCoinOperation(UserPurse userPurse, Purse purse) {

		StringBuilder strOfCoin = new StringBuilder();

		List<Coins> allCoins = coinRepo.findAll();

		System.out.println(allCoins);

		String strArrCoins[] = userPurse.getCoins().split(",");

		for (String stCoin : strArrCoins) {
			int x = Integer.parseInt(stCoin);
			allCoins.forEach(repCoin -> {
				if (repCoin.getNumber() == x) {
					System.out.println(repCoin.getNumber() + "..." + x);
					amount = amount + x;
					strOfCoin.append(x + ",");
					System.out.println(strOfCoin);
				}
			});
		}

		String coinStr = strOfCoin.toString();

		coinStr = coinStr.substring(0, coinStr.length() - 1);

		purse.setTotalBalance(amount);
		purse.setCoins(coinStr);

		System.out.println(purse);

		purse = purseRepo.save(purse);

		return purse;
	}

	private Purse doCardOperation(UserPurse userPurse, Purse purse) {

		StringBuilder cardStr = new StringBuilder();
		List<DebitCard> allDebitCard = debitCardRepo.findAll();
		
		String ArrofDebitCard[] = userPurse.getDebitCard().split(",");
		
		for(String stDebitCard : ArrofDebitCard){
			allDebitCard.forEach(repDebitCard->{
				if(repDebitCard.getNameOnCard()==stDebitCard){
					amount = amount + repDebitCard.getBalance();
					purse.setCards(stDebitCard);
					
				}
			});
		}
		

		return purse;
		
	
				
						
		


	
	}
}
