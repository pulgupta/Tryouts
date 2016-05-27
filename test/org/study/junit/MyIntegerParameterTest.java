package org.study.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.study.corejava.MyInteger;

/**
 * In this class we will look at the parameterized junit tests
 * @author pulgupta
 *
 */
@RunWith(Parameterized.class)
public class MyIntegerParameterTest {

	private int num;
	private int expectedResult;
	
	public MyIntegerParameterTest(int num, int expectedResult) {
		this.num = num;
		this.expectedResult = expectedResult;
	}
	
	/**
	 * This will be used to pass parameters to the test methods.
	 * We will pass a collection of integer arrays.
	 * Each array will hold the elements we defined in this class
	 * This method should always be static as this method will be used by 
	 * JUNIT to get the data and then create the instance of the test class in which
	 * this is defined.
	 * @return
	 */
	@Parameters
	public static Collection<Integer[]> data(){
		return Arrays.asList(new Integer[][]{{2,2},{1,1},{2,2}});
	}
	
	@Test
	public void test() {
		assertEquals(expectedResult, MyInteger.modify(num));
	}

}
