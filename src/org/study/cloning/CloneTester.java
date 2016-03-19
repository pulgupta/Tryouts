package org.study.cloning;
/**
 * Using this case we can see that constructor is not called when we are doing cloning
 * @author pulgupta
 *
 */
public class CloneTester {
	public static void main(String[] args) {
		Student st = new Student();
		st.setRollNumber("10");
		st.setName("Pulkit");
		System.out.println("cloning object now");
		Student  st2 = null;
		
		try {
			st2 = (Student)st.clone();
			System.out.println("cloning done");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(st2);
	}
}
