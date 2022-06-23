

public class Ejercicio32 {

	public static void main(String[] args) {
		Car car_1 = new Car();
		Car car_2 = new Car(0, 0);
		Car car_3 = new Car(100, 200);
	}
}	

class Car {
	// Atributos
	private int fuel;
	private int maxspeed;
	
	// Metodos GET
	public int getFuel() {
		return this.fuel;
	};
	
	public int getMaxspeed() {
		return this.maxspeed;
	};
	
	// Metodos SET
	public int setFuel(int fuel) {
		return this.fuel = fuel;
	};
	
	public int setMaxspeed(int maxspeed) {
		return this.maxspeed = maxspeed;
	};
	
	// Otros Metodos
	public int refuel(int fuel, int cantidad_repostada) {
		return this.fuel = fuel + cantidad_repostada;
	};
	
	// Constructores
	public Car () {
		System.out.println("Objeto Car instanciado sin parametros. ");
	};
	
	public Car (int fuel, int maxspeed) {
		this.fuel = fuel;
		this.maxspeed = maxspeed;
		System.out.println("Objeto Car instanciado con los siguientes parametros: " + fuel + " & " + maxspeed);
	};
	
}
