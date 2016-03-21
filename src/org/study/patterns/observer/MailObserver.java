package org.study.patterns.observer;

public class MailObserver extends Observer{

	public MailObserver(Subject subject) {
		this.subject = subject;
		this.subject.setObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("****Sending mails and calling some 3rd party system****");
		System.out.println(this.subject.getState() + " Mailed" );
	}

}
