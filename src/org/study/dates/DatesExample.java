package org.study.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatesExample {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
		System.out.println(gc.get(Calendar.HOUR_OF_DAY));
		System.out.println(gc.getTime());
		Date date = gc.getTime();
		System.out.println(date);
	}
	
}
