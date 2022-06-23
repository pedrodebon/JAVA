

public class Ejercicio06 {
	
	public static void main(String[] args) {
		byte aux1 = (byte) 132; 
		short aux2 = (short) 32792; 
		int aux3 = (int) 2147493647L;
		long aux4 = (long) 9223372036874775.807; 
		
		System.out.println("Desborde de 5 posiciones en un byte: " + aux1);
		System.out.println("Desborde de 25 posiciones en un short: " + aux2);
		System.out.println("Desborde de 10.000 posiciones en un nt: " + aux3);
		System.out.println("Desborde de 20.000 posiciones en un long: " + aux4);
	}

}
