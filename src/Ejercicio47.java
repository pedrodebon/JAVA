import javax.swing.*;

public class Ejercicio47 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("¿Como te llamas?");
		JOptionPane.showInternalMessageDialog(null, str, "JAVA", 2);
	}
}