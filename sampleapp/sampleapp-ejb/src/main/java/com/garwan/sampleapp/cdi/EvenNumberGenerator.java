package com.garwan.sampleapp.cdi;

@Even
public class EvenNumberGenerator implements NumberGenerator {

	@Override
	public String generateNumber() {
		return "2";
	}
}
