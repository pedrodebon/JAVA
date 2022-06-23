

public class Ejercicio26 {

	public static void main(String[] args) {
		// Apartado 1
		System.out.println("Apartado 1: ");
		
		Long var_Long = (long) 1000000000;
		byte var_byte = 3;
		short var_short = 17;
		Integer var_Integer = 97;
		
		System.out.println("La variable: " + var_Long + " es del tipo: " + var_Long.getClass().getName());
		System.out.println("La variable: " + var_byte + " es del tipo: " + ((Byte) var_byte).getClass().getName());
		System.out.println("La variable: " + var_short + " es del tipo: " + ((Short) var_short).getClass().getName());
		System.out.println("La variable: " + var_Integer + " es del tipo: " + var_Integer.getClass().getName());
		
		System.out.println(" ");
		
		// Apartado 2
		System.out.println("Apartado 2: ");
		Ejercicio26 ejercicio26 = new Ejercicio26();
		
		ejercicio26.metodoWrapper(var_Long);
		ejercicio26.metodoWrapper(var_byte);
		ejercicio26.metodoWrapper(var_short);
		ejercicio26.metodoWrapper(var_Integer);
		
	};
	
	public void metodoWrapper(Object aux) { 
		String resultado = aux.getClass().getName();
		resultado = resultado.substring(10, resultado.length());
		System.out.println("La variable " + aux + " pertenece al tipo: " + resultado);
	};

}
