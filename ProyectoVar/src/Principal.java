import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {

		var list = new ArrayList<String>();
		
		var list1 = Arrays.asList("One", "Two", "Three", "Four", "Five");
		
		String e1 = list1.get(0);
		
		//Map<String, List<Alumno>> map = foo();
		
		var map = foo();
		
	}
	
	public static Map<String, List<Alumno>> foo() {
		return null;
	}

}
