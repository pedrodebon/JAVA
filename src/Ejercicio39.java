

public class Ejercicio39 {

	public static void main(String[] args) {
	}
}

class Vehiculo{
	int velocidad;
	String matricula;
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Vehiculo(String matricula) {
		this.velocidad = 0;
		this.matricula = matricula;
	}
	
	public String toString() {
		return "El vehiculo con matrocula " + matricula + " va a velocidad " + velocidad;
	}
	
	public void acelerar(int cantidad){
	    velocidad += cantidad;
	}
	
}

class Coche extends Vehiculo{
	private int numeroPuertas;
	
	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	
	public Coche(int velocidad, String matricula) {
		super(matricula);
	}
}

class Camion extends Vehiculo{
	boolean remolque;
	
	public void ponRemolque(Camion camion) {
		camion.remolque = true;
	}
	 
	public void quitaRemolque(Camion camion) {
	    camion.remolque = false;
	}
	
	public Camion(String matricula) {
		super(matricula);
	}

	public void acelerar(int cantidad) {
	    if (remolque = false) {
	    	super.acelerar(cantidad);
	    }else {
	    	super.acelerar(cantidad/2);
	    }
	}

	public String toString() {
	    if (remolque = true) {
	        return super.toString() + ". Lleva un remolque. ";
	    } else {
	        return super.toString();
	    }
	}
}


