package v1.cliente;

import java.util.*;

import pojos.*;

public class Principal {
	
	public static void main(String[] args) {
		
		Alumno[] alumnos = {new Alumno("Patrobas"),new Alumno("Tercio"),
				new Alumno("Andronico"),new Alumno("Rolas")};
		
		ArrayList<Profesor> profesores = new ArrayList<>();
		profesores.add(new Profesor("Epeneto"));
		profesores.add(new Profesor("Junias"));
		profesores.add(new Profesor("Amplias"));
		profesores.add(new Profesor("Urbano"));
		
		mostrar(alumnos);
		mostrar(profesores);
		
	}
	
	static void mostrar(Alumno[] alumnos) {
		for (int i=0; i<alumnos.length; i++) {
			Alumno a = alumnos[i];
			System.out.println(a);
		}
	}
	
	static void mostrar(List<Profesor> profesores) {
		for (int i=0; i<profesores.size(); i++) {
			Profesor p = profesores.get(i);
			System.out.println(p);
		}
	}
	
}

