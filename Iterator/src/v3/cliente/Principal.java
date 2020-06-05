package v3.cliente;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import pojos.*;
import v3.cliente.iterator.ArrayIterator;

public class Principal {
	
	public static void main(String[] args) {
		
		Alumno[] alumnos = {new Alumno("Patrobas"),new Alumno("Tercio"),
				new Alumno("Andronico"),new Alumno("Rolas")};
		
		ArrayList<Profesor> profesores = new ArrayList<>();
		profesores.add(new Profesor("Epeneto"));
		profesores.add(new Profesor("Junias"));
		profesores.add(new Profesor("Amplias"));
		profesores.add(new Profesor("Urbano"));
		
		Hashtable<String,String> egresados = new Hashtable<>();
		egresados.put("x01", "Estaquis");
		egresados.put("x02", "Apeles");
		egresados.put("x03", "Aristobulo");
		egresados.put("x04", "Herodion");

		Iterator<Alumno> alumnosIterator = createIterator(alumnos);
		Iterator<Profesor> profesoresIterator = profesores.iterator();
		Iterator<String> egresadosIterator = egresados.values().iterator();
		
		mostrar(alumnosIterator);
		mostrar(profesoresIterator);
		mostrar(egresadosIterator);
	}
	
	static <T> void mostrar(Iterator<T> iterator) {
		while(iterator.hasNext()) {
			T t = iterator.next();
			System.out.println(t);
		}
	}
	
	static<T> Iterator<T> createIterator(T[] array){
		Iterator<T> iterator = new ArrayIterator<>(array);
		return iterator;
	}
	
	
}

