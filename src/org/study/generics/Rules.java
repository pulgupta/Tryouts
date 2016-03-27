package org.study.generics;

public class Rules<T> {

	/**
	 * For the below method we will get the below error
	 * Name clash: The method equals(T) of type Rules<T> 
	 * has the same erasure as equals(Object) of type 
	 * Object but does not override it 
	 * @param a
	 * @return
	 */
	//public boolean equals(T a) {
		//return false;
	//}
}
