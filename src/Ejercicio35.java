

public class Ejercicio35 {

	public static void main(String[] args) {
	}
}

class Persona{
	String nombre;
	String apellidos;
	String documento;
	String tipo;
}

class Cliente extends Persona{
	String categoria;
	int codigo;
}

class Empleado extends Persona{
	String tipoContrato;
	int sueldo;
}