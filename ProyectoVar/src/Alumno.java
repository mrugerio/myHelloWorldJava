
public class Alumno {
	
	String nombre = "Sin asignar";
	
	public void estudiar(String tutor) {
		var materia = "Mate";
		materia = "Filosofia";
		//materia = null;
		var horas = 2;
		System.out.println("Estudiar: "+materia);
		System.out.println("Horas: "+horas);
	}
	
	//Reglas
	/*
	A var is used as a local variable in a 
	  constructor, method, or initializer block.
	
	A var cannot be used in constructor parameters, 
	  method parameters, instance variables, 
	  or class variables.
	  
	A var is always initialized on the same line 
	  (or statement) where it is declared.
	  
	The value of a var can change, but the type cannot.
	
	A var cannot be initialized with a null value 
	  without a type.
	  
	A var is not permitted in a multiple-variable 
	declaration.
	
	*/

}
