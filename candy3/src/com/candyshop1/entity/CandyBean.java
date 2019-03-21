package com.candyshop1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candyshop")
public class CandyBean {
	@Id
	@Column(name="candyId")
	private int candyId;
	@Column(name="candyName")
	private int candyName;
	@Column(name="price")
	private int price;
	public int getCandyId() {
		return candyId;
	}
	public void setCandyId(int candyId) {
		this.candyId = candyId;
	}
	public int getCandyName() {
		return candyName;
	}
	public void setCandyName(int candyName) {
		this.candyName = candyName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
