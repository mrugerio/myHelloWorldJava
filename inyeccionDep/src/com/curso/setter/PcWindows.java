package com.curso.setter;

public class PcWindows implements Pc {
	
	private String version;

	public PcWindows(String version) {
		this.version = version;
	}
	
	@Override
	public void encender() {
		System.out.println("Enciende pc: "+version);
	}
	
}
