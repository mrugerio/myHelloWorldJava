package com.curso.constructor;

public class Inyector {
	
	static Becario getBecario() {
		Pc pcLinux = new PcLinux("Ubuntu 18.04");
		Pc pcWindows = new PcWindows("Windows 10");
		return new Becario("Patrobas",pcLinux);
		
	}

}
