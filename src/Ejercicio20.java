

public class Ejercicio20 {

	public static void main(String[] args) {
		// Apartado 1
		for(int i = 1; i < 10; i++) {
			if(i >= 3) {
				System.out.println("Iteracción numero: 3 donde se rompe el bucle.");
				break;
			}else{
				System.out.println("Iteracción numero: " + i);
			};
		};
		
		System.out.println("");
		
		// Apartado 2
		for(int i = 1; i < 10; i++) {
			if(i == 5) {
				continue;
			};
			System.out.println("Iteracción numero: " + i);
		};
	};
}
