

public class Ejercicio23 {

	public static void main(String[] args) {
		Ejercicio23 ejercicio23 = new Ejercicio23();
		
		ejercicio23.arcoiris();
	}

	public void arcoiris() {
		String[] array_colores_bandera = {"", "", "", "", ""}; 
		String fila = "                                                                                                    ";
		String color = "";
		int contador = 0;
		
		for(int i = 0; i < 5;) {
			color = random_color();
			if(color_repetido(color, array_colores_bandera) == (false)) {
				System.out.println(color + fila);
				System.out.println(color + fila);
				array_colores_bandera[contador] = color;
				contador ++;
				i++;
			};
		};
		
	};
	
	public boolean color_repetido(String color, String[] array_colores_bandera) {
		boolean respuesta = false;
		
		for(int i = 0; i < array_colores_bandera.length; i++) {
			if(color.equals(array_colores_bandera[i])) {
				respuesta = true;
			};
		};
		return respuesta; 
	}
	
	public String random_color() {
		int random = (int) (Math.random()*5+0);
		String color_random = "";

		switch(random) {
			case 1:
				color_random = "\u001B[41m";
				break;
			case 2:
				color_random = "\u001B[42m";
				break;
			case 3:
				color_random = "\u001B[43m";
				break;
			case 4:
				color_random = "\u001B[44m";
				break;
			default: 
				color_random = "\u001B[45m";
				break;
		};
		
		return color_random;
	}
}
