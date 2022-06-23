import javax.swing.JOptionPane;

public class Ejercicio50 {

	public static void main(String[] args) {
		String string = "Queue Operations Menu \n1.Insert\n2.Delete\n3.Display\n4.Exit\n\nEnter your option";
		String answer = JOptionPane.showInputDialog(string);
		
		switch (answer) {
			case "1":
				JOptionPane.showInternalMessageDialog(null, "Insert", "Input", 1);
				break;
			case "2": 
				JOptionPane.showInternalMessageDialog(null, "Delete ", "Input", 2);
				break;
			case "3": 
				JOptionPane.showInternalMessageDialog(null, "Display ", "Input", 3);
				break;
			default: 
				JOptionPane.showInternalMessageDialog(null, "Bye", "Input", -1);
				break;
		}
	}
}