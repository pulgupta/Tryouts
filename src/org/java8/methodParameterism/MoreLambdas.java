package org.java8.methodParameterism;

//Functional Interfaces
interface Execute {
	int run(int a);
}

interface ExecuteString {
	int run (String a);
}

//Runner Class which will run the lambdas
class Runner {

	public void run(Execute a, int param) {
		System.out.println("calling int method");
		int value  = a.run(param);
		System.out.println(value);
	}

	public void run(ExecuteString a, String param) {
		System.out.println("calling String method " + param);
		int value = a.run(param);
		System.out.println(value);
	}
	
}
//Main class passing the lambdas
public class MoreLambdas {
	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.run((a) -> a+10  , 15);
		runner.run((a) -> a*10  , 15);
		runner.run((a) -> a/10  , 15);
		runner.run((a) -> a-10  , 15);
		runner.run((a) -> a.length() +10  , "Hello");
		//Example of method reference 
		runner.run(String::length  , "Hello");
	}
}
