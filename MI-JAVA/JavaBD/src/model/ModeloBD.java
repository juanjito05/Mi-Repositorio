package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloBD {

	private String url;
	private String user;
	private String password;

	private ArrayList<String> consultas;

	String tabla;

	public ModeloBD() {

		url = "jdbc:mysql://192.168.33.214/i1i20?serverTimezone=UTC";
		user = "sanjose";
		password = "SQL_2710_jsp";

//		this.url = "jdbc:mysql://localhost/vueloslite?serverTimezone=UTC";
//		this.user = "root";
//		this.password = "";
		
		tabla = new String();
		consultas = new ArrayList<String>();
		consultas.add("SHOW TABLES");
		consultas.add("SHOW COLUMNS FROM ");
		consultas.add("SELECT * FROM ");
		/*
		 * consultas.add("SELECT COUNT(*) " + "FROM information_schema.columns " +
		 * "WHERE table_name = 'datlic'AND table_schema = 'i1i20'");
		 */
		// consultas.add("SHOW TABLES FROM i1i22");

	}

	public String getTabla() {
		return tabla;
	}

	public void setTabla(String tabla) {
		this.tabla = tabla;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<String> getConsultas() {
		return consultas;
	}

	public void setConsultas(ArrayList<String> consultas) {
		this.consultas = consultas;
	}

}
