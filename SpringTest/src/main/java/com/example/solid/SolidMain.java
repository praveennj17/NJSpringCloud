package com.example.solid;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.example.solid.Product.COLOR;
import com.example.solid.Product.SIZE;

public class SolidMain {

	public static void main(String[] args) {

		Product car = new Product("Car", COLOR.red.toString(), SIZE.medium.toString());
		Product bike = new Product("Bike", COLOR.red.toString(), SIZE.medium.toString());
		Product house = new Product("House", COLOR.orange.toString(), SIZE.large.toString());
		Product dress = new Product("Dress", COLOR.Green.toString(), SIZE.large.toString());
		List<Product> products = Arrays.asList(car, bike, house, dress);

		Filter filter = new Filter();
		Stream<Product> stream = filter.filterbyColor(products, COLOR.red);

		// stream.forEach(e -> System.out.println("prodcut is" + e.getName()));

		// so when paramter increaeses methods increarese so not O open to extension
		// style

		BetterFilter bf = new BetterFilter();
		Stream<Product> bfStream = bf.filterByconditions(products, new ColorConditions(COLOR.Green));
		bfStream.forEach(e -> System.out.println("prodcut is" + e.getName()));

	}

}

interface Conditions<T> {

	boolean issatisfied(T t);

}

interface GenFilter<T> {

	Stream<T> filter(List<T> products, Conditions<T> cond);

}

class BetterFilter implements GenFilter {

	public Stream filterByconditions(List products, Conditions conditions) {

		return products.stream().filter(e -> conditions.issatisfied(e));

	}

	@Override
	public Stream filter(List products, Conditions cond) {
		products.stream().filter(e-> {
			cond.issatisfied(e)||
		});
		return null;
	}
}

class ColorConditions implements Conditions<Product> {
	private COLOR color;

	public ColorConditions(COLOR color) {
		this.color = color;
	}

	@Override
	public boolean issatisfied(Product product) {
		return product.getColor().equals(color.toString());
	}

}

class SizeConditions implements Conditions<Product> {
	private SIZE size;

	public SizeConditions(SIZE size) {
		this.size = size;
	}

	@Override
	public boolean issatisfied(Product product) {
		return product.getSize().equals(size.toString());
	}

}

class Product {

	public Product(String name, String color, String size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	enum COLOR {
		Green, red, orange
	}

	enum SIZE {
		small, medium, large
	}

	private String name;
	private String color;
	private String size;

}

@Override
public boolean multfilters(T t, T t1) {
	// TODO Auto-generated method stub
	return false;
}
