package DataBase;

import java.util.ArrayList;

/*
 * @author Juan Jose Ortiz Jimenez
 * 16/04/2026
 */

public class ModelDatabase {

	private String url;
	private String user;
	private String pass;

	private ArrayList<String> consultas;

	public ModelDatabase() {

//		url = "jdbc:mysql://192.168.33.214/i1i20?serverTimezone=UTC";
//		user = "sanjose";
//		pass = "SQL_2710_jsp";

		url = "jdbc:mysql://localhost/arreglodispositivos?serverTimezone=UTC";
		user = "root";
		pass = "";

		consultas = new ArrayList<>();
		consultas.add("INSERT INTO cliente VALUES ");
		consultas.add("SELECT * FROM cliente");
		consultas.add("INSERT INTO entrada(`nombre`, `modelo`, `dni_cliente`, `problema`) VALUES ");
		consultas.add("SELECT * FROM entrada WHERE dni_cliente = ");
		consultas.add("INSERT INTO expediente(`id_dispositivo`, `dni_cliente`, `observación`) VALUES ");
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public ArrayList<String> getConsultas() {
		return consultas;
	}

	public void setConsultas(ArrayList<String> consultas) {
		this.consultas = consultas;
	}

}
