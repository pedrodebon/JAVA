import java.awt.Color;

import javax.swing.*;

public class Ejercicio53 {

	public static void main(String[] args) {
		
		ImageIcon img = new ImageIcon("C:\\Users\\FORMACIÓN\\Pictures\\favicon.ico");
		
		JFrame frame = new JFrame();
		frame.setTitle("Fundación Esplai");
		frame.setSize(300, 400); // Tamaño/2 para poder centrarlo mejor
		frame.setVisible(true);
		frame.setLocation(600, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.MAGENTA);
		frame.setIconImage(img.getImage());
	}
}
