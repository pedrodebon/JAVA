

public class Ejercicio22 {

	public static void main(String[] args) {
		Ejercicio22 ejercicio22 = new Ejercicio22();
		
		// Bandera de España
		ejercicio22.banderaSpain();
		
		// Bandera de Francia
		ejercicio22.banderaFrance();
		
		// Bandera de Grecia
		ejercicio22.banderaGreece();
	}
	
	public void banderaSpain() {
		System.out.println("Bandera de España: ");
		for(int i = 0; i < 10; i++) {
			String bandera = "                                                  ";
			if(i > 6 || i < 3) {
			System.out.println("\u001B[41m" + bandera);
			}else {
			System.out.println("\u001B[43m" + bandera);
			};
		};
	}
	
	public void banderaFrance() {
		System.out.println("\u001B[47m Bandera de Francia: ");
		for(int i = 0; i < 10; i++) {
			String bandera_1 = "               ";
			String bandera_2 = "               ";
			String bandera_3 = "               ";
			System.out.println("\u001B[44m" + bandera_1 + "\u001B[47m" + bandera_2 + "\u001B[41m" + bandera_3);
		};
	};
	
	public void banderaGreece() {
		System.out.println("\u001B[47m Bandera de Grecia: ");
		String bandera_1 = "      ";
		String bandera_2 = "   ";
		String bandera_3 = "      ";
		String bandera_4 = "                              ";
		String bandera_5 = "                                             ";
		System.out.println("\u001B[44m" + bandera_1 + "\u001B[47m" + bandera_2 + "\u001B[44m" + bandera_3 + "\u001B[44m" + bandera_4);
		System.out.println("\u001B[44m" + bandera_1 + "\u001B[47m" + bandera_2 + "\u001B[44m" + bandera_3 + "\u001B[47m" + bandera_4);
		System.out.println("\u001B[47m" + bandera_1 + "\u001B[47m" + bandera_2 + "\u001B[47m" + bandera_3 + "\u001B[44m" + bandera_4);
		System.out.println("\u001B[44m" + bandera_1 + "\u001B[47m" + bandera_2 + "\u001B[44m" + bandera_3 + "\u001B[47m" + bandera_4);
		System.out.println("\u001B[44m" + bandera_1 + "\u001B[47m" + bandera_2 + "\u001B[44m" + bandera_3 + "\u001B[44m" + bandera_4);
		for(int i = 0; i < 4; i++) {
			if(i%2 == 0) {
				System.out.println("\u001B[47m" + bandera_5);
			}else {
				System.out.println("\u001B[44m" + bandera_5);
			};
		};
	};

}
 