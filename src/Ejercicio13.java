

public class Ejercicio13 {
	public static void main(String[] args) {
		// NUEVA INSTANCIA
		Ejercicio13 ejercicio13 = new Ejercicio13();
		
		// INICIALIZACIÓN DE LAS VARIABLES
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 2;
		
		// COMRPOBACIONES
		ejercicio13.comparador(num4, num2);
		ejercicio13.comparador(num2, num3);
		ejercicio13.comparador(num1, num3);
		ejercicio13.comparador(num2, num2);
		ejercicio13.comparador(num4, num3);
		ejercicio13.comparador(num3, num1);
		ejercicio13.comparador(num1, num3);
		ejercicio13.comparador(num2, num4);
		ejercicio13.comparador(num2, num3);
		ejercicio13.comparador(num2, num3);
		ejercicio13.comparador(num2, num4);
		ejercicio13.comparador(num2, num1);
		ejercicio13.comparador(num1, num2);
		ejercicio13.comparador(num2, num1);
		ejercicio13.comparador(num2, num2);
	}
	
	// METODO COMPARATIVO
	public void comparador(int aux1, int aux2) {
		if(aux1 > aux2) {
			System.out.println("Numero: " + aux1 + " es mayor que Numero: " + aux2);
		}else if(aux1 < aux2){
			System.out.println("Numero: " + aux1 + " es menor que Numero: " + aux2);
		}else if(aux1 == aux2) {
			System.out.println("Numero: " + aux1 + " es igual que Numero: " + aux2);
		};
	};
}
