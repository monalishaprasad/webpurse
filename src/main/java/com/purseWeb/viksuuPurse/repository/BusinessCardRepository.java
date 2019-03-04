package com.purseWeb.viksuuPurse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purseWeb.viksuuPurse.model.BusinessCard;

@Repository
public interface BusinessCardRepository extends JpaRepository<BusinessCard, Integer> {

}
