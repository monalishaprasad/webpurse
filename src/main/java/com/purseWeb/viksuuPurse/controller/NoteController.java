package com.purseWeb.viksuuPurse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.purseWeb.viksuuPurse.model.Notes;
import com.purseWeb.viksuuPurse.service.NoteBusinessService;

@RestController
public class NoteController {

	

	@Autowired
	private NoteBusinessService service;


	@PostMapping("/insertNote")
	public Notes addTheNotes(@RequestBody Notes addNotes) {
		Notes notes = service.addNotes(addNotes);
		return notes;

	}

	@GetMapping("/getNote")
	public List<Notes> allNotes() {
		
		List<Notes> notes = service.getNotes();
		return notes;
	}

}
