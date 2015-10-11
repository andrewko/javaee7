package com.garwan.sampleapp.cdi;

@Odd
public class OddNumberGenerator implements NumberGenerator {

	@Override
	public String generateNumber() {
		return "1";
	}
}
