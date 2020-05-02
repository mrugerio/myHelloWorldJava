package com.curso.variable;

public class PcLinux implements Pc {
	
	private String version;

	public PcLinux(String version) {
		this.version = version;
	}
	
	@Override
	public void encender() {
		System.out.println("Enciende pc: "+version);
	}
	
}
