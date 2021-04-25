package com.example.designpatterns.builder;

import java.io.Serializable;

public class Address implements Serializable {

	public Address(String street, String road) {
		this.street = street;
		this.road = road;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", road=" + road + "]";
	}

	public String getStreet() {
		return street;
	}

	public String getRoad() {
		return road;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	private String street;
	private String road;
}
