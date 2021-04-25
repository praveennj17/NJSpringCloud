package com.example.designpatterns.builder;

public class Cash {

	@Override
	public String toString() {
		return "Cash [amount=" + amount + "]";
	}

	private Integer amount;

	private Cash(Integer amount) {
		this.amount = amount;
	}

	public static class Factory {

		public static Cash ConvertFromDollar(Integer amount) {
			return new Cash(amount * 60);
		}

		public static Cash ConvertFromEuro(Integer amount) {
			return new Cash(amount * 50);
		}

	}

}
