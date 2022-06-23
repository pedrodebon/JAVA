

public class Ejercicio17 {

	public static void main(String[] args) {
		// Apartado 1
		int num = 11;
		switch(num) {
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("Cuatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		case 6:
			System.out.println("Seis");
			break;
		case 7:
			System.out.println("Siete");
			break;
		case 8:
			System.out.println("Ocho");
			break;
		case 9:
			System.out.println("Nueve");
			break;
		default: 
			System.out.println("Caso no contemplado. Introduce un numero del 1 al 9");
		};
		
		// Apartado 2
		double number = -0;
		System.out.println(number>0?"¡Es positivo!":(number<0?"¡Es negativo!":"¡Es cero!"));
	};
}
