package com.curso.variable;

public class Inyector {
	
	static void inyectarPc(Becario bec) {
		bec.myPc = new PcLinux("Ubuntu 18.04");
	}

}
