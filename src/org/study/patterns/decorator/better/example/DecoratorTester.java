package org.study.patterns.decorator.better.example;

public class DecoratorTester {
	public static void main(String[] args) {
                
        BasicCar bc = new BasicCar();
        bc.setEngineCapacity(1200);
        bc.setWheelSize(15);
        LuxuryCar lc = new LuxuryCar(bc);
        lc.setLeatherMake("premium");
        SportsCar sc = new SportsCar(lc);
        sc.setDrivingModes(4);
        sc.setPeakTorqueMods(2);
        Car sportsLuxuryCar = sc;
        sportsLuxuryCar.assemble();
        
    }
}
