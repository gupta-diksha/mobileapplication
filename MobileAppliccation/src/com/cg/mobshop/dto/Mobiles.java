package com.cg.mobshop.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="mobiles")
public class Mobiles 
{
	@Id
	@Column(name="mobile_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int mobileId;
	
	
	private String name;
	private double price;
	private int quantity;
	
	
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + name
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	public Mobiles() {
		super();
		
	}
	public Mobiles(int mobileId, String name, double price, int quantity) {
		super();
		this.mobileId = mobileId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
