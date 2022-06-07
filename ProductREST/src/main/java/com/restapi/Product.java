package com.restapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String city, String status) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.status = status;
	}

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private String name;

	private String city;

	private String status;
}
