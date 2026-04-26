package DataBase;

import java.util.ArrayList;

public class ModeloBD {

	private String url;
	private String user;
	private String pass;

	private ArrayList<String> consultas;

	public ModeloBD() {

//		url = "jdbc:mysql://192.168.33.214/i1i20?serverTimezone=UTC";
//		user = "sanjose";
//		pass = "SQL_2710_jsp";

		url = "jdbc:mysql://localhost/jardineria?serverTimezone=UTC";
		user = "root";
		pass = "";

		consultas = new ArrayList<>();

		consultas.add("SHOW TABLES");
		consultas.add("SHOW COLUMNS FROM ");
		consultas.add("SELECT * FROM ");
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
