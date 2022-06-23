

import java.sql.*;
import java.io.InputStream;
import java.util.Scanner;

public class Ejercicio46 {

	public static void main(String[] args) {
		Connection connection;
		final String url = "jdbc:mysql://localhost:3306/db_test";
		final String user = "root";
		final String pass = "admin";
		
		// SELECT * FROM db_test.usuarios;
		// INSERT INTO db_test.usuarios VALUES (null, 'Pedro', 31, 'España');
		// UPDATE db_test.usuarios SET nombre = 'Divad' WHERE id_usuarios = 1;
		// DELETE FROM db_test.usuarios WHERE id_usuarios > 4;
		
		try {
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Success. ");
			System.out.println(" ");
			
			// SELECT
			System.out.println("Introduzca la query SELECT: ");
			InputStream inputStreamLine = System.in;
			Scanner sc = new Scanner(inputStreamLine);
			String string = sc.nextLine();
			
			Statement statement = connection.createStatement();
			ResultSet resultadoSelect = statement.executeQuery(string);
			while(resultadoSelect.next()) {
				int id = resultadoSelect.getInt("id_usuarios");
				String nombre =  resultadoSelect.getString("nombre");
				int edad = resultadoSelect.getInt("edad");
				String nacionalidad =  resultadoSelect.getString("nacionalidad");
				System.out.println(id + " " + nombre + " " + edad + " " + nacionalidad);
			}
			
			
			// INSERT 
			System.out.println(" ");
			System.out.println("Introduzca la query INSERT: ");
			inputStreamLine = System.in;
			sc = new Scanner(inputStreamLine);
			string = sc.nextLine();
			statement.executeUpdate(string);
			
			
			// UPDATE
			System.out.println(" ");
			System.out.println("Introduzca la query UPDATE: ");
			inputStreamLine = System.in;
			sc = new Scanner(inputStreamLine);
			string = sc.nextLine();
			PreparedStatement statementPrep = connection.prepareStatement(string);
			statementPrep.executeUpdate();
			
			
			// DELETE
			System.out.println(" ");
			System.out.println("Introduzca la query DELETE: ");
			inputStreamLine = System.in;
			sc = new Scanner(inputStreamLine);
			string = sc.nextLine();
			statement.executeUpdate(string);
			
			
			// SELECT despues de los cambios
			System.out.println(" ");
			System.out.println("Introduzca la query SELECT: ");
			inputStreamLine = System.in;
			sc = new Scanner(inputStreamLine);
			string = sc.nextLine();
			
			statement = connection.createStatement();
			resultadoSelect = statement.executeQuery(string);
			while(resultadoSelect.next()) {
				int id = resultadoSelect.getInt("id_usuarios");
				String nombre =  resultadoSelect.getString("nombre");
				int edad = resultadoSelect.getInt("edad");
				String nacionalidad =  resultadoSelect.getString("nacionalidad");
				System.out.println(id + " " + nombre + " " + edad + " " + nacionalidad);
			}
			
			
			resultadoSelect.close();
			statement.close();
			connection.close();
			System.out.println("Connection Close. ");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}