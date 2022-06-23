

public class Ejercicio16 {

	public static void main(String[] args) {
		// Apartado 1
		int num = (int) (Math.random()*2);
		String color_red = "\u001B[31m";
		String color_black = "\u001B[30m";
		System.out.println(num==0?color_red + "true":color_black + "false");
		
		// Apartado 2
		//int temperatura = 0; // Polar
		//int temperatura = 7; // Alta Montaña
		//int temperatura = 11; // Oceanico
		//int temperatura = 15; // Mediterraneo
		//int temperatura = 19; // Continental
		//int temperatura = 22; // Ecuatorial
		//int temperatura = 25; // Tropical
		int temperatura = 30; // Desertico
		
		if(temperatura <5) {
			System.out.println("Clima: Polar");
		}else if(temperatura < 10 && temperatura >= 5) {
			System.out.println("Clima: Alta Montaña");
		}else if(temperatura < 13.5 && temperatura >= 10) {
			System.out.println("Clima: Oceanico");
		}else if(temperatura < 16.5 && temperatura >= 13.5) {
			System.out.println("Clima: Mediterraneo");
		}else if(temperatura < 20 && temperatura >= 16.5) {
			System.out.println("Clima: Continental");
		}else if(temperatura < 23.5 && temperatura >= 20) {
			System.out.println("Clima: Ecuatorial");
		}else if(temperatura < 26.5 && temperatura >= 23.5) {
			System.out.println("Clima: Tropical");
		}else{
			System.out.println("Clima: Desertico");
		};
	}
}
