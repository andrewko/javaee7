package com.garwan.sampleapp.cdi;

import javax.enterprise.inject.Alternative;

@Alternative @Odd
public class MockedNumberGenerator implements NumberGenerator {

	@Override
	public String generateNumber() {
		return "mocked number";
	}

}
