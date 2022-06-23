

public class Ejercicio19 {

	public static void main(String[] args) {
		Ejercicio19 ejercicio19 = new Ejercicio19();
		
		System.out.println("Apartado 1: ");
		int num = 40;
		ejercicio19.divisiblePorDos(num);
		System.out.println(" ");
		
		System.out.println("Apartado 2: ");
		int[] array_numeros = {2, 3, 78, 58, 64, 96, 73, 22, 44, 51, 69};
		ejercicio19.divisiblePorTres(array_numeros);
		System.out.println(" ");
		
		System.out.println("Apartado 3: ");
		int num3 = 1;
		ejercicio19.saludos(num3);
		System.out.println(" ");
		
		System.out.println("Apartado 4: ");
		ejercicio19.abc();
		System.out.println(" ");
	}
	
	public void divisiblePorDos(int aux) {
		System.out.println(aux%2==0?"El numero " + aux +" es divisible por 2.":"El numero " + aux +" NO es divisible por 2.");
	}
	
	public void divisiblePorTres(int[] aux) {
		int numero = 0;
		for(int i = 0; i < aux.length; i++) {
			numero = aux[i];
			if(numero%3==0) {
				System.out.println("El numero " + numero +" es divisible por 3.");
			};
		};
	};
	
	public void saludos(int aux) {
		int inter = 0;
		do {
			System.out.println("Hola, que tal?");
			inter++;
		}while(inter < aux);
	};
	
	public void abc() {
		char[] array_char = {'Z','Y','X','W','V','U','T','S','R','Q','P','O','N','M','L','K','J','I','H','G','F','E','D','C','B','A',};
		String abece = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
		System.out.println(abece);
		int aux = array_char.length-1;
		for(int i = 1; i < array_char.length; i++) {
			abece = abece.substring(1, abece.length());
			System.out.println(abece);
			if(abece.equals("A")) {
				for(int j = array_char.length-1; j > 0; j--) {
					aux--;
					abece = abece + array_char[aux];
					System.out.println(abece);
				};
			};
		};
	};
}