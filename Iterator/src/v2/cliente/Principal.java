package v2.cliente;

import java.util.ArrayList;

import pojos.*;
import v2.cliente.iterator.ArrayIterator;
import v2.cliente.iterator.ArrayListIterator;
import v2.cliente.iterator.Iterator;

public class Principal {
	
	public static void main(String[] args) {
		
		Alumno[] alumnos = {new Alumno("Patrobas"),new Alumno("Tercio"),
				new Alumno("Andronico"),new Alumno("Rolas")};
		
		ArrayList<Profesor> profesores = new ArrayList<>();
		profesores.add(new Profesor("Epeneto"));
		profesores.add(new Profesor("Junias"));
		profesores.add(new Profesor("Amplias"));
		profesores.add(new Profesor("Urbano"));
		
		Iterator<Alumno> alumnosIterator = createIterator(alumnos);
		Iterator<Profesor> profesoresIterator = createIterator(profesores);
		
		mostrar(alumnosIterator);
		mostrar(profesoresIterator);
		
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
	
	static<T> Iterator<T> createIterator(ArrayList<T> arrayList){
		Iterator<T> iterator = new ArrayListIterator<>(arrayList);
		return iterator;
	}
	
}

