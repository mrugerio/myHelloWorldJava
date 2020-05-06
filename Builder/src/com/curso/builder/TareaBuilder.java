package com.curso.builder;

import java.util.Date;

public class TareaBuilder {
	
	private final long id;
    private String tarea = "";
    private String descripcion = ""; 
    private String definidaPor = ""; 
    private String asignadaA = ""; 
    private boolean hecho = false;
    private Date fechaLimite = new Date();
    
    public TareaBuilder(long id) {
    	this.id = id;
    }

	public TareaBuilder setTarea(String tarea) {
		this.tarea = tarea;
		return this;
	}

	public TareaBuilder setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

	public TareaBuilder setDefinidaPor(String definidaPor) {
		this.definidaPor = definidaPor;
		return this;
	}

	public TareaBuilder setAsignadaA(String asignadaA) {
		this.asignadaA = asignadaA;
		return this;
	}

	public TareaBuilder setHecho(boolean hecho) {
		this.hecho = hecho;
		return this;
	}

	public TareaBuilder setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
		return this;
	}
	
	public Tarea build() {
		return new Tarea(id,tarea,descripcion, definidaPor,
				asignadaA,hecho,fechaLimite);
	}

}
