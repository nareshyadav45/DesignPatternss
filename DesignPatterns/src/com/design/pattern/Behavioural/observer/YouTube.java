package com.design.pattern.Behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTube implements Subject {
	List<Observer> subcribers=new ArrayList<>();

	@Override
	public void subscribe(Observer observer) {
		this.subcribers.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.subcribers.remove(observer);
	}

	@Override
	public void updates(String updateName) {
		for(Observer obs:this.subcribers) {
			obs.notified(updateName);
		}

	}

}
