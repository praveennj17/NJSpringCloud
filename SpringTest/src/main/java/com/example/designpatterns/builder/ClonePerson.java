package com.example.designpatterns.builder;

import java.io.Serializable;

public class ClonePerson implements Serializable {

	public ClonePerson(String name, String age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "ClonePerson [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private String name;
	private String age;
	private Address address;

	
}
