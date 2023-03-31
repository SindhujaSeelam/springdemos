package com.examples.S06SpringORMDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product2 {

@Override
	public String toString() {
		return "product2 [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}

@Id	
private int id;
	
	private String name;
	
	private String description;
	
	private double price;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
}
