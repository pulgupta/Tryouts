package org.study.patters.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	String state;
	List<Observer> observers = new ArrayList<Observer>();

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		updateAll();
	}
	
	public void setObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void updateAll() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
}
