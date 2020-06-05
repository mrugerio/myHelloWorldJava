package v2.cliente.iterator;

import java.util.ArrayList;

public class ArrayListIterator<T> implements Iterator<T> {
	
	ArrayList<T> arrayList;
	int posicion = 0;
	
	public ArrayListIterator(ArrayList<T> arrayList) {
		this.arrayList = arrayList;
	}

	@Override
	public boolean hasNext() {
		if(posicion >= arrayList.size() || arrayList.get(posicion) == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public T next() {
		T t = arrayList.get(posicion);
		posicion = posicion + 1;
		return t;
	}

}
