package com.example.designpatterns.builder;

public class Person {

	private Integer id;
	private String name;

	private Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	static class PersonFactory {
		static Integer i = 0;

		public static Person createPerson(String name) {
			Person person = new Person(i, name);
			i++;
			System.out.println(person.toString());
			return person;
		}

	}

}
