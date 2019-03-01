package com.purseWeb.viksuuPurse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purseWeb.viksuuPurse.model.Slip;

@Repository
public interface SlipRepository extends JpaRepository<Slip,Integer>  {

}
