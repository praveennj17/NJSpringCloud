package com.example.solid;

import java.util.List;
import java.util.stream.Stream;

import com.example.solid.Product.COLOR;
import com.example.solid.Product.SIZE;

public class Filter {
	Filter() {

	}

	public Stream filterbyColor(List<Product> products, COLOR color) {
		return products.stream().filter(e -> e.getColor().equals(color.toString()));
	}

	public Stream filterbySize(List<Product> products, SIZE size) {
		return products.stream().filter(e -> e.getSize().equals(size.toString()));
	}

	public Stream filterbySizeAndColor(List<Product> products, SIZE size, COLOR color) {
		return products.stream()
				.filter(e -> (e.getSize().equals(size.toString()) && e.getSize().equals(size.toString())));
	}
}