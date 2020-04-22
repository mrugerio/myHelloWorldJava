package com.curso.conobserver.obs;

import com.curso.conobserver.sub.Subject;

public abstract class Observer {
	
	Subject sub;
	
	public Observer(Subject sub) {
		this.sub = sub;
		sub.attach(this);
	}

	public abstract void update();

}
