


public class Ejercicio44 {

	public static void main(String[] args) {
		Developer junior_01 = new Developer("Alberto", "Cidoncha", 29, "77889944L", Profesiones.BackEndDeveloper);
		Developer junior_02 = new Developer("Josema", "Perez", 30, "33557744D", Profesiones.FrontEndDeveloper);
		Developer junior_03 = new Developer("Isaias", "Garcia", 28, "11559966K", Profesiones.FullStackDeveloper);
		
		junior_01.backEnd(junior_01);
		junior_02.backEnd(junior_02);
		junior_03.backEnd(junior_03);
	}
}

class Developer{
	String nombre;
	String apellidos;
	int edad;
	String dni;
	Profesiones rolTecnologico;
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getDni() {
		return dni;
	}
	
	public Profesiones getRolTecnologico() {
		return rolTecnologico;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setRolTecnologico(Profesiones rolTecnologico) {
		this.rolTecnologico = rolTecnologico;
	}
	
	public Developer(String nombre, String apellidos, int edad, String dni, Profesiones rolTecnologico) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
		this.rolTecnologico = rolTecnologico;
	}
	
	public void backEnd(Developer devop) {
		if(devop.rolTecnologico.equals(Profesiones.BackEndDeveloper) || devop.rolTecnologico.equals(Profesiones.FullStackDeveloper)){
			System.out.println("¡¡¡Viva el BackEnd!!!");
		}else {
			System.out.println("Pasate a TypeScript porque soy un hater de JS. ");
		}
	}
	
}