
import javax.swing.JOptionPane;

public class Ejercicio51 {

	public static void main(String[] args) {
		Object [] colores ={"perro","gato","caballo","lobo"}; 
		String str= "Esto es una foto de un lobo";
		Object opcion = JOptionPane.showInputDialog(null,"¿Cual es tu animal favorito?", "Animal Quiz",JOptionPane.QUESTION_MESSAGE,null,colores, colores[3]);
		switch (opcion.toString()) {
			case "perro":
				str= "Esto es una foto de un perro";
				JOptionPane.showInternalMessageDialog(null, str, "Animal Quiz", 2);
				break;
			case "gato":
				str= "Esto es una foto de un gato";
				JOptionPane.showInternalMessageDialog(null, str, "Animal Quiz", 2);
				break;
			case "caballo":
				str= "Esto es una foto de un caballo";
				JOptionPane.showInternalMessageDialog(null, str, "Animal Quiz", 2);
				break;
			default:
				JOptionPane.showInternalMessageDialog(null, str, "Animal Quiz", 2);
				break;
		}
	}
}