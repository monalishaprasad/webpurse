package com.purseWeb.viksuuPurse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purseWeb.viksuuPurse.model.Purse;
@Repository
public interface PurseRepository extends JpaRepository<Purse,Integer>{

}
