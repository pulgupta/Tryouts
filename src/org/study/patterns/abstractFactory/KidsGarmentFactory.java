package org.study.patterns.abstractFactory;

public class KidsGarmentFactory implements GarmentFactory {

	@Override
	public Suit createSuit() {
		return new KidsSuit();
	}

	@Override
	public Jeans createJeans() {
		return new KidsJeans();
	}

}
