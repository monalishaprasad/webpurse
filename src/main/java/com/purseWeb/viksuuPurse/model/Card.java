package com.purseWeb.viksuuPurse.model;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
@EntityListeners(EntityListeners.class)
public abstract class Card {

	/*@Id
	@GeneratedValue(straterdfgy=GenerationType.IDENTITY)
	@Column(name="id",unique=true,nullable=false)
	public int id;*/
	public String cardName ;
	public String cardType;
	
	

}


