

import java.sql.*;

public class Ejercicio45 {

	public static void main(String[] args) {
		Connection connection;
		final String url = "jdbc:mysql://localhost:3306/db_test";
		final String user = "root";
		final String pass = "admin";
		
		try {
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Success. ");
			System.out.println(" ");
			
			// SELECT
			System.out.println("SELECT: ");
			Statement statement = connection.createStatement();
			ResultSet resultadoSelect = statement.executeQuery("SELECT * FROM db_test.usuarios;");
			while(resultadoSelect.next()) {
				int id = resultadoSelect.getInt("id_usuarios");
				String nombre =  resultadoSelect.getString("nombre");
				int edad = resultadoSelect.getInt("edad");
				String nacionalidad =  resultadoSelect.getString("nacionalidad");
				System.out.println(id + " " + nombre + " " + edad + " " + nacionalidad);
			}
			
			// INSERT 
			statement.executeUpdate("INSERT INTO db_test.usuarios VALUES (null, 'Pedro', 31, 'España');");
			
			
			// UPDATE
			PreparedStatement statementPrep = connection.prepareStatement("UPDATE db_test.usuarios SET nombre = 'Divad' WHERE id_usuarios = 1;");
			statementPrep.executeUpdate();
			
			// DELETE
			statement.executeUpdate("DELETE FROM db_test.usuarios WHERE id_usuarios > 4;");
			
			// SELECT despues de los cambios
			System.out.println(" ");
			System.out.println("SELECT tras el CRUD: ");
			statement = connection.createStatement();
			ResultSet resultadoSelectCRUD = statement.executeQuery("SELECT * FROM db_test.usuarios;");
			while(resultadoSelectCRUD.next()) {
				int id = resultadoSelectCRUD.getInt("id_usuarios");
				String nombre =  resultadoSelectCRUD.getString("nombre");
				int edad = resultadoSelectCRUD.getInt("edad");
				String nacionalidad =  resultadoSelectCRUD.getString("nacionalidad");
				System.out.println(id + " " + nombre + " " + edad + " " + nacionalidad);
			}
			System.out.println(" ");
			
			resultadoSelect.close();
			resultadoSelectCRUD.close();
			statement.close();
			connection.close();
			System.out.println("Connection Close. ");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}