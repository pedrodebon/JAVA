

public class Ejercicio11 {
	public static void main(String[] args) {
		Ejercicio11 ejercicio11 = new Ejercicio11(); // Nueva instancia del ejercicio11
		ejercicio11.decremento(); // Llamamos al metodo decremento
		System.out.println(ejercicio11.numero); // Mostramos por pantalla
	}
	
	int numero = 0;
	
	public void incremento(){
		numero++;
	}
	
	public void decremento() {
		numero -=2;// equivalente  numero-- * 2
	}
	
	
	
}
