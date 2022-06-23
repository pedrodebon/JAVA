

public class Ejercicio24 {

	public static void main(String[] args) {
		System.out.println(" ");
		String str = "";
		String str2 = "          ";
		for(int j = 0; j < 8; j++) {
			str = "\u001B[43m*" + str + "\u001B[43m*\u001B[47m";
			str2 = str2.substring(0, str2.length()-1);
			System.out.println(str2 + str);
		};
		for(int i = 0; i < 2; i++) {
			System.out.println("        \u001B[41m****\u001B[47m        ");
		};
	};
}