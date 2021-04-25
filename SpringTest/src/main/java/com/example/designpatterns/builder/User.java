package com.example.designpatterns.builder;

public final class User {

	private final String firstName;
	private final String lastName;
	private final Integer age;
	private final String address;

	private User(UserBuilder userBuilder) {
		this.firstName = userBuilder.firstName;
		this.lastName = userBuilder.lastName;
		this.age = userBuilder.age;
		this.address = userBuilder.address;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ "]";
	}

	public static class UserBuilder {

		private final String firstName;
		private final String lastName;
		private Integer age;
		private String address;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder addAge(Integer age) {
			this.age = age;
			return this;
		}

		public UserBuilder addAddress(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			User user = new User(this);
			return user;
		}

	}

}
