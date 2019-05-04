package org.study.patterns.factory;

public class PolygonFactory {

	public Polygon getPolygon(int numberOfSides) {
		if (numberOfSides == 3) {
			return new Triangle();
		}
		if (numberOfSides == 4) {
			return new Square();
		}
		if (numberOfSides == 5) {
			return new Pentagon();
		} else if (numberOfSides == 8) {
			return new Octagon();
		}
		return null;
	}
}
