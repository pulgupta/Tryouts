package org.study.patterns;

public class FinalizerPattern {

	//This finalizerGurdian is a anonymous class
	//The purpose of this class is to contain the finalize logic
	//When the gurdian is finalized it performs finalization activity
	//desired for the enclosing class
	private final Object finalizerGurdian = new Object() {
		@Override
		protected void finalize() throws Throwable
		{
			//Finalize outer class
		}
		//Remember the below semi colon
	};
}
