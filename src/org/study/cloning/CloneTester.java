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
		
		
		//
		System.out.println("****Clone and inheritance****");
		//We already have a student object from above "st"
		SubStudent t1 =  new SubStudent();
		t1.setRollNumber("10");
		t1.setName("Pulkit");
		t1.setMoney(100);
		
		try {
			SubStudent t2 = (SubStudent) t1.clone();
			System.out.println(t2.name + " " + t2.money + "  " + t2.rollNumber);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		NotRelatedStudent a = new NotRelatedStudent();
		a.something =100;
		
	}
}
