package com.purseWeb.viksuuPurse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purseWeb.viksuuPurse.model.Notes;
import com.purseWeb.viksuuPurse.repository.NoteRepository;

@Service
public class NoteBusinessService {

	@Autowired
	private NoteRepository repo;
	public Notes addNotes(Notes note){
		
		Notes newNote = repo.save(note);
		return newNote;
	}
	
	
public List<Notes> getNotes(){
		
		List<Notes> newNote = repo.findAll();
		return newNote;
	}
}
