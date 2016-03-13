package org.study.corejava;

public class SwitchWithString {
	
	public static void main(String[] args) {
		String value = "Pulkit";
		switch (value) {
		case "pulkit":
			System.out.println("This is not case senstive");
			break;
		case "Pulkit":
			System.out.println("This is case senstive");
			break;
		default:
			break;
		}
		//Ternary operators in Java
		String data = value.equals("Pulkit") ? "This is true" : "This is false";
		System.out.println(data);
	}
}
