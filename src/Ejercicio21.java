

public class Ejercicio21 {

	public static void main(String[] args) {
		Ejercicio21 ejercicio21 = new Ejercicio21();
		
		// Apartado 1
		System.out.println("Apartado 1: ");
		
		String var_string_1 = "string ejemplo";
		String var_string_2 = "java";
		
		ejercicio21.javaOrNull(var_string_1);
		ejercicio21.javaOrNull(var_string_2);
		
		System.out.println(" ");
		
		// Apartado 2
		System.out.println("Apartado 2: ");
		
		String var_login_1 = "string ejemplo";
		String var_login_2 = "admin";
		int var_pass_1 = 1234;
		int var_pass_2 = 5698;
		
		ejercicio21.login(var_login_1, var_pass_2);
		ejercicio21.login(var_login_2, var_pass_2);
		ejercicio21.login(var_login_1, var_pass_1);
		ejercicio21.login(var_login_2, var_pass_1);
		
		System.out.println(" ");
		
		// Apartado 3
		System.out.println("Apartado 3: ");
		
		ejercicio21.esParEsImpar();
		ejercicio21.esParEsImpar();
		ejercicio21.esParEsImpar();
		ejercicio21.esParEsImpar();
		
	}
	
	public void javaOrNull(String aux) {
		if(aux.equals("java")) {
			System.out.println("java");
		}else {
			System.out.println("null");
		};
	};
	
	public void login(String aux, int aux_2) {
		if(aux.equals("admin") && aux_2 == 1234) {
			System.out.println("Login true");
		}else {
			System.out.println("Login false");
		};
	};
	
	public void esParEsImpar() {
		int numero = (int) (Math.random()*25+18);
		if(numero%2 == 0) {
			System.out.println("El numero: " + numero + " es par dado que el resto al dividirlo entre dos es igual a 0");
		}else {
			System.out.println("El numero: " + numero + " es impar dado que el resto(" + numero%2 + ") al dividirlo entre dos es diferente a 0");
		};
	};
}
