package com.purseWeb.viksuuPurse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purseWeb.viksuuPurse.model.Notes;

@Repository
public interface NoteRepository  extends JpaRepository<Notes,Integer> {

}
