package com.crud.generic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.crud.generic.entity.baseEntity.BaseEntity;

@Entity
@Table(name = "books")
public class Books extends BaseEntity{
	
	@Column
	private String author;
	
	@Column
	private Long price;
	

	public Books() {
		super();		
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

}
