package com.garwan.sampleapp.cdi;

import javax.inject.Inject;

public class BookService {

	@Inject @Odd
	private NumberGenerator numberGenerator;

	public Book createBook(String name, String description) {
		Book book = new Book(name, numberGenerator.generateNumber(), description);
		return book;
	}
}
