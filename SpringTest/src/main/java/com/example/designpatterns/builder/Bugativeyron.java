package com.example.designpatterns.builder;

public class Bugativeyron implements Imoveable {

	@Override
	public String toString() {
		return "Bugativeyron [getSpeed()=" + getSpeed() + "]";
	}

	@Override
	public Integer getSpeed() {

		return 300;
	}

}
