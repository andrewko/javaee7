package com.garwan.sampleapp.cdi;

public class Book {

	private String name;
	private String description;
	private String number;

	public Book(String name, String number, String description) {
		this.name = name;
		this.number = number;
		this.description = description;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
}
