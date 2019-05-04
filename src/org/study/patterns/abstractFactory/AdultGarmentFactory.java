package org.study.patterns.abstractFactory;

public class AdultGarmentFactory implements GarmentFactory {

	@Override
	public Suit createSuit() {
		return new AdultSuit();
	}

	@Override
	public Jeans createJeans() {
		return new AdultJeans();
	}

}
