package org.study.patterns.observer;

public class LogObserver extends Observer{

	public LogObserver(Subject subject) {
		this.subject = subject;
		this.subject.setObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("****Sending Logs and calling some 3rd party system****");
		System.out.println(this.subject.getState() + " logged");
		
	}

}
