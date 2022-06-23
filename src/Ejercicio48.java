import javax.swing.JOptionPane;

public class Ejercicio48 {

	public static void main(String[] args) {
		String str01 = "El total es:\n\t120 € (IVA 10% no incl.)\n\t132 (con IVA incl.)";
		String str02 = "Ticket";
		JOptionPane.showInternalMessageDialog(null, str01, str02, 1);
	}
}