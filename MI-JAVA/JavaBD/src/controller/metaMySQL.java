package controller;

import java.sql.*;

/**
 * Clase de prueba de conexion con una base de datos MySQL
 */
public class metaMySQL {

	Connection conexion;
	Statement s;
	ResultSet rs;

	public metaMySQL() {

		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName("com.mysql.jdbc.Driver");

			// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver);
			conexion = DriverManager.getConnection("jdbc:mysql://192.168.33.214/i1i20?serverTimezone=UTC", "sanjose",
					"SQL_2710_jsp");
			s = conexion.createStatement();
			DatabaseMetaData meta = conexion.getMetaData();
			rs = meta.getTables(null, null, null, new String[] { "TABLE" });
			System.out.println("Lista de cuadros:");

			System.out.println("Lista de cuadros:");
			while (rs.next()) {
				System.out.println("   " + rs.getString("TABLE_CAT") + ", " + rs.getString("TABLE_SCHEM") + ", "
						+ rs.getString("TABLE_NAME") + ", " + rs.getString("TABLE_TYPE") + ", "
						+ rs.getString("REMARKS"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//************* proceso

	// *********************** metodo

	public static void main(String[] args) {
		metaMySQL programa = new metaMySQL();
	}

}
