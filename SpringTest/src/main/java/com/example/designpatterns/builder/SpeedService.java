package com.example.designpatterns.builder;

public class SpeedService implements ImoveAdaptor {

	@Override
	public String toString() {
		return "SpeedService [cars=" + cars + ", getSpeed()=" + getSpeed() + "]";
	}

	private Imoveable cars;

	public SpeedService(Imoveable cars) {
		this.cars = cars;
	}

	@Override
	public Integer getSpeed() {
		return this.cars.getSpeed() - 50;

	}

}
