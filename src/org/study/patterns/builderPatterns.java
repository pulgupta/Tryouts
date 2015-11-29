package org.study.patterns;

public class builderPatterns {
//Assume this class if for Nutrition facts - This is a immutable class
	
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbs;
	
	public static class Builder{
		//required params
		private final int servingSize;
		private final int servings;
		
		//optional params
		private int calories = 0;
		private int fat =0;
		private int carbs =0;
		private int sodium =0;
		
		//Normal constructor initializing the required parameters
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
			
		}
		
		//Separate function which will set the corresponding params
		public Builder calories(int val) {
			calories = val;
			return this;
		}
		public Builder fat(int val) {
			fat = val;
			return this;
		}
		public Builder carbs(int val) {
			carbs = val;
			return this;
		}
		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
		
		//This build method will be the last in the chain
		//This will take the Builder object and then will create the parent class object
		public builderPatterns build() {
			return new builderPatterns(this);
		}
	}
	
	//Private constructor of the parent class which take the object of the build class
	//Now in this we will transfer the data from the builder class instance to the main class.
	private builderPatterns(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		carbs = builder.carbs;
		sodium = builder.sodium;
		
		//We can check the invariants here
		//if any of the invariants fails then the build method should throw a illegalStateException
		
	}
	
	public String toString(){
		return ("The values are " + this.servings);
	}
}

class tester1 {
	public static void main(String args[]){
		builderPatterns bp = new builderPatterns.Builder(10,10).calories(20).build();
		System.out.println(bp);
	}
}
