package org.study.enums;
import org.study.enums.EnumInClass.myenum;
public class WhoIsBetter {
	
	public static void main(String args[]) {
		
		//Just for demo. You can ignore the next line
		System.out.println(myenum.DEMO_PRINT);
		System.out.println("lets see who is better");
		//String fistHero = (String)DC.BATMAN;
		String firstHero = (DC.BATMAN).toString();
		String SecondHero = (Marvel.IRONMAN).toString();
		
		if(firstHero.length() > SecondHero.length())
			System.out.println(firstHero);
		else
			System.out.println(SecondHero);
		
		//calling enum method - not able to call enum method
		DC.BATMAN.getDescription();
		
		System.out.println(Marvel.IRONMAN.attribute1);
		System.out.println(Marvel.CAPTAINAMERICA.attribute2);
		
		DC dc = DC.fromString("SUPERMAN");
		System.out.println("from string example " + dc);
		
		//ORDINAL TEST CLIENT
		
		System.out.println("Ordinal example " + OrdinalExample.DUET.number());
		System.out.println("Ordinal example " + OrdinalExample.DECTET.getNumber());
		
		System.out.println(BasicOperation.PLUS);
		Operation op = BasicOperation.PLUS;
		System.out.println(op.apply(10, 20));
		System.out.println(BasicOperation.MINUS.apply(10, 20));
		
	}
}
