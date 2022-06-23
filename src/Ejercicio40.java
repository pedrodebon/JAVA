

import java.io.InputStream;
import java.util.Scanner;

public class Ejercicio40 {

	public static void main(String[] args) {
		Ejercicio40 ejercicio40 = new Ejercicio40();
		ejercicio40.datos();
		
	}
	
	public void datos() {
		System.out.println("Introduce los siguientes datos: ");
		
		InputStream inputStream = System.in;
		Scanner sc = new Scanner(inputStream);
		System.out.println("Integer: ");
		System.out.println("El dato introducido es: " + sc.nextInt());
		System.out.println(" ");
		
		InputStream inputStreamLong = System.in;
		sc = new Scanner(inputStreamLong);
		System.out.println("Long: ");
		System.out.println("El dato introducido es: " + sc.nextLong());
		System.out.println(" ");
		
		InputStream inputStreamShort = System.in;
		sc = new Scanner(inputStreamShort);
		System.out.println("Short: ");
		System.out.println("El dato introducido es: " + sc.nextShort());
		System.out.println(" ");
		
		InputStream inputStreamDouble = System.in;
		sc = new Scanner(inputStreamDouble);
		System.out.println("Double: ");
		System.out.println("El dato introducido es: " + sc.nextDouble());
		System.out.println(" ");
		
		InputStream inputStreamByte = System.in;
		sc = new Scanner(inputStreamByte);
		System.out.println("Byte: ");
		System.out.println("El dato introducido es: " + sc.nextByte());
		System.out.println(" ");
		
		InputStream inputStreamBoolean = System.in;
		sc = new Scanner(inputStreamBoolean);
		System.out.println("Boolean: ");
		System.out.println("El dato introducido es: " + sc.nextBoolean());
		System.out.println(" ");
		
		InputStream inputStreamLine = System.in;
		sc = new Scanner(inputStreamLine);
		System.out.println("Line: ");
		System.out.println("El dato introducido es: " + sc.nextLine());
		System.out.println(" ");
	}
}
