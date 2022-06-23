



public class Ejercicio31 {

	public static void main(String[] args) {
		Ejercicio31 ejercicio31 = new Ejercicio31();
		
		// Apartado 1
		int contador = 0;
		ejercicio31.funcionRecurrente(contador);
		System.out.println("");
		
		// Apartado 2
		int contador_html = -1;
		ejercicio31.funcionRecurrenteHTML(contador_html);
		System.out.println("");
		
		// Apartado 3
		int num_1 = 1;
		int num_2 = 1;
		int num_resultado = 99;
		int contador_fibbo = 0;
		ejercicio31.fibbonacci(num_1, num_2, num_resultado, contador_fibbo);
		System.out.println("");
		
		// Apartado 4
		String str_res = "";
		String str = "prueba";
		ejercicio31.inversion(str, str_res);
		System.out.println("");
		
		// Apartado 5
		int numero = 123456789;
		int sumatorio = 0;
		ejercicio31.sumaNumeros(numero, sumatorio);
	}
	
	public void funcionRecurrente(int contador) {
		String[] tecnologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
		System.out.println("Iteracción numero: " + contador + " con resultado: " + tecnologies[contador]);
		contador++;
		if (contador < 7) {
			funcionRecurrente(contador);
		};
	};
	
	public void funcionRecurrenteHTML(int contador) {
		String[] tecnologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
		contador++;
		System.out.println("Iteracción numero: " + contador + " con resultado: " + tecnologies[contador]);
		if (!tecnologies[contador].equals("HTML")) {
			funcionRecurrenteHTML(contador);
		};
	};
	
	public void fibbonacci(int num_1, int num_2, int num_parametro, int contador) {
		System.out.println("Iteracción " + contador + ": " + num_1 + " & " + num_2);
		contador ++;
		
		if(contador%2 == 0) {
			num_1 = num_1 + num_2;
		}else {
			num_2 = num_1 + num_2;
		};
		
		if (num_1 < num_parametro) {
			fibbonacci(num_1, num_2, num_parametro, contador);
		};
	};
	
	public void inversion(String str, String str_res) {
		int iteracciones = str.length();
		if(iteracciones > 0) {
			str_res = str_res.concat(str.substring(iteracciones-1, iteracciones));
			str = str.substring(0, iteracciones-1);
			inversion(str, str_res);
		}else{
			System.out.println("Palabra invertida: " + str_res);
		};
	}
	
	public void sumaNumeros(int numero, int sumatorio) {
		String str_num = numero+"";
		int int_num = Integer.parseInt(str_num.substring(str_num.length()-1, str_num.length()));
		sumatorio = sumatorio + int_num;
		numero = numero/10;
		if(numero > 0) {
			sumaNumeros(numero, sumatorio);
		}else {
			System.out.println("La suma del numero introducido es: " + sumatorio);
		};
	};

}
