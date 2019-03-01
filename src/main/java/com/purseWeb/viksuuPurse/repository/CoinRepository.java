package com.purseWeb.viksuuPurse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purseWeb.viksuuPurse.model.Coins;


	@Repository
	public interface CoinRepository  extends JpaRepository<Coins,Integer> {

	}



