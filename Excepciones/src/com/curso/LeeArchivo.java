package com.curso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeeArchivo {

	public static void main(String[] args){
		
		File file = new File("E://archivo.txt");
		try {
			leerArchivo(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void leerArchivo(File file) 
			throws FileNotFoundException {
		FileReader fr = new FileReader(file);
	}

}
