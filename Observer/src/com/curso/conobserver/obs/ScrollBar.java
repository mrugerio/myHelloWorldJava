package com.curso.conobserver.obs;

import com.curso.conobserver.sub.Subject;

public class ScrollBar extends Observer {

	public ScrollBar(Subject sub) {
		super(sub);
	}

	void deslizarScrollBar(){
		System.out.println("Deslizar scrollbar");
	}

	@Override
	public void update() {
		deslizarScrollBar();
	}
}
