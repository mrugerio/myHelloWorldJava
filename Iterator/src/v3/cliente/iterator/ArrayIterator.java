package v3.cliente.iterator;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
	
	T[] arreglo;
	int posicion = 0;
	
	public ArrayIterator(T[] arreglo) {
		this.arreglo = arreglo;
	}

	@Override
	public boolean hasNext() {
		if(posicion >= arreglo.length || arreglo[posicion] == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public T next() {
		T t = arreglo[posicion];
		posicion = posicion + 1;
		return t;
	}

}
