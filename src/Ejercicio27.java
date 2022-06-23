

public class Ejercicio27 {
	
	public static void main(String[] args) {
		Ejercicio27 ejercicio27 = new Ejercicio27();
		
		// Apartado 1
		System.out.println("Apartado 1: ");
		
		double var_1 = 123456789;
		double var_2 = 987654321;
		double var_3 = 147258369;
		
		ejercicio27.escaleraDecreciente(var_1);
		ejercicio27.escaleraDecreciente(var_2);
		ejercicio27.escaleraDecreciente(var_3);
		
		System.out.println(" ");
		
		// Apartado 2
		System.out.println("Apartado 2: ");
		
		byte var_4 = 1;
		byte var_5 = 2;
		byte var_6 = 3;
		
		ejercicio27.escaleraDecreciente(var_4);
		ejercicio27.escaleraDecreciente(var_5);
		ejercicio27.escaleraDecreciente(var_6);
		
		System.out.println(" ");
		
		// Apartado 3
		System.out.println("Apartado 3: ");
		
		byte var_7 = 100;
		var_7 = (byte) (var_7 *2);
		System.out.println(var_7);
		
		byte var_8 = 100;
		short var_8_short = var_8;
		System.out.println(var_8_short*2);
	};
	
	public void escaleraDecreciente(double aux) {
		float aux_float = 0;
		long aux_long = 0;
		int aux_int = 0;
		short aux_short = 0;
		byte aux_byte = 0;
		
		aux_float = (float) aux;
		aux_long = (long) aux_float;
		aux_int = (int) aux_long;
		aux_short = (short) aux_int;
		aux_byte = (byte) aux_short;
		
		System.out.println(aux_byte);
	};
	
	public void escaleraCreciente(byte aux) {
		double aux_double = 0;
		float aux_float = 0;
		long aux_long = 0;
		int aux_int = 0;
		short aux_short = 0;
		
		aux_short = aux;
		aux_int = aux_short;
		aux_long = aux_int;
		aux_float = aux_long;
		aux_double = aux_float;
		
		System.out.println(aux_double);
	};
}
