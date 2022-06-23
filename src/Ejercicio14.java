

public class Ejercicio14 {

	public static void main(String[] args) {
		// NUEVA INSTANCIA
		Ejercicio14 ejercicio14 = new Ejercicio14();
		
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = false;
		
		ejercicio14.comparador(bool1, bool2);
		ejercicio14.comparador(bool2, bool3);

	}
	
	// METODO COMPARATIVO
	public void comparador(boolean aux1, boolean aux2) {
		if(aux1 != aux2) {
			System.out.println("Boolean: " + aux1 + " es el invertido de Boolean: " + aux2);
		}else if(aux1 == aux2) {
			System.out.println("Boolean: " + aux1 + " es igual a Boolean: " + aux2);
		};
	};
}
