

public class Ejercicio28 {

	public static void main(String[] args) {
		
		System.out.println("Apartado 1: ");
		System.out.printf("%s %30s %15s", "NOMBRE", "APELLIDO1", "APELLIDO2");
		System.out.println(" ");
		
		System.out.println("Apartado 2: ");
		System.out.printf("%s \t%s%s", "NOMBRE", "apellido1", "apellido2");
		System.out.println(" ");
		
		System.out.println("Apartado 3: ");
		System.out.printf("%3$s %2$s %1$s", "Nombre", "apellido1", "apellido2");
		System.out.println(" ");
		
		System.out.println("Apartado 4: ");
		System.out.printf("\t%s", "22");
		System.out.println(" ");
		
		System.out.println("Apartado 5: ");
		System.out.printf("%010d%n", 22);
		System.out.println(" ");
		
		System.out.println("Apartado 6: ");
		System.out.printf("%09.2f%n", 17.1829327);
		System.out.println(" ");
		
		System.out.println("Apartado 7: ");
		System.out.printf("%s\b%s", "Hola ", "Mundo");
	}

}
