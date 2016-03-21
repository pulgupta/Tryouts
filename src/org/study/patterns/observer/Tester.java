package org.study.patterns.observer;

public class Tester {
	public static void main(String[] args) {
		Subject subject = new Subject();
		new LogObserver(subject);
		new MailObserver(subject);
		subject.setState("Pulkit");
		System.out.println(subject.getState());
		subject.setState("Gargi");
		System.out.println(subject.getState());
	}
}
