package com.curso.setter;

public class Inyector {
	
	static void inyectarPc(Becario bec) {
		//bec.myPc = new PcLinux("Ubuntu 18.04");
		bec.setMyPc(new PcWindows("Windows XP"));
	}

}
