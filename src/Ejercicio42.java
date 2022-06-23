

import java.io.InputStream;
import java.util.*;

public class Ejercicio42 {

	public static void main(String[] args) {
		try {
			InputStream inputStream = System.in;
			Scanner sc = new Scanner(inputStream);
			System.out.println("Introduzca un numero integer: ");
			System.out.println("El dato introducido es: " + sc.nextInt());
		}catch (Exception e) {
			System.out.println("Ha ocurrido el siguiente error: " + e + " pruebe otra vez. ");
		};
		
		try {
			InputStream inputStream = System.in;
			Scanner sc = new Scanner(inputStream);
			System.out.println("Introduzca un numero real: ");
			System.out.println("El dato introducido es: " + sc.nextLine());
		}catch (Exception e) {
			System.out.println("Ha ocurrido el siguiente error: " + e + " pruebe otra vez. ");
		};
	}
}
