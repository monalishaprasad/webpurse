package com.purseWeb.viksuuPurse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purseWeb.viksuuPurse.model.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard,Integer> {

}
