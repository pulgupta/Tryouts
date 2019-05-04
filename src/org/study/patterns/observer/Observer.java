package org.study.patterns.observer;

/**
 * Observer instance knows for which subject instance it has to observe
 * This helps when the observer wants to get the state of the subject on which it is 
 * being called.
 * @author pulgupta
 */
public abstract class Observer {

	// This helps when the observer needs to get the state of the object.
	Subject subject;
	public abstract void update();

}
