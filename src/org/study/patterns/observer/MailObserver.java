package org.study.patterns.observer;

/**
 * Observer instance knows for which subject instance it has to observe
 * This helps when the observer wants to get the state of the subject on which it is 
 * being called.
 * @author pulgupta
 */
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
