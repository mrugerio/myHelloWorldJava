package com.curso.conobserver.sub;

import java.util.ArrayList;
import java.util.List;
import com.curso.conobserver.obs.Observer;

public abstract class Subject {
	
	List<Observer> listaObservadores;
	
	Subject(){
		listaObservadores = new ArrayList();
	}
	
	public void attach(Observer o) {
		listaObservadores.add(o);
	}
	
	public void detach(Observer o) {
		listaObservadores.remove(o);
	}
	
	public void notificar() {
		for (Observer o: listaObservadores) {
			o.update();
		}
	}

}
