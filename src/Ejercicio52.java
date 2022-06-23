import javax.swing.JOptionPane;

public class Ejercicio52 {

	public static void main(String[] args) {
		String[] options = {"mis dieses!", "Solid 5/7", "ni fu ni fa", "ni en revision", "bienvenido a Brazil"};
		String[] questions = {"¿Pizza con piña?", "¿concierto de Camela?", "¿besito de Juan y medio en la frente?", 
				"¿T-oficina?", "¿Star Wars?", "¿cruzcampo?", "¿patillas, cortijo, rebujito, spagnolo, gomina patras?"};
		
		int x = JOptionPane.showOptionDialog(null, questions[(int) (Math.random()*6)],
	                "Ejercicio 52", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	}
}
