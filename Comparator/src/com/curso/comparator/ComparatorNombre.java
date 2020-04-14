package com.curso.comparator;

import java.util.Comparator;
import com.curso.pojo.Empleado;

public class ComparatorNombre implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
