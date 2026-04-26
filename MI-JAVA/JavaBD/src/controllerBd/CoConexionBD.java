package controllerBd;

import java.sql.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import model.ModeloBD;

public class CoConexionBD {

	Connection conn;
	ModeloBD modelo;

	ArrayList<Statement> st;
	ArrayList<ResultSet> rs;

	public CoConexionBD() throws SQLException {

		modelo = new ModeloBD();
		conn = getConnextion();

		st = new ArrayList<>();
		rs = new ArrayList<>();

	}

	public void asignarTablas(String texto) {
		modelo.setTabla(texto);
	}

	public Connection getConnextion() {

		try {
			conn = DriverManager.getConnection(modelo.getUrl(), modelo.getUser(), modelo.getPassword());
			return conn;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public Connection getConn() {
		return conn;
	}

	public ArrayList<Statement> getSt() {
		return st;
	}

	public void setSt(Connection conn) throws SQLException {
		this.st.add(conn.createStatement());
	}

	public ArrayList<ResultSet> getRs() {
		return rs;
	}

	public void setRs(int nst, int nSQL) throws SQLException {
		ResultSet rstemporal = st.get(nst).executeQuery(modelo.getConsultas().get(nSQL));
		this.rs.add(rstemporal);
	}

	public void setRs(int nst, String sSQL) throws SQLException {
		ResultSet rstemporal = st.get(nst).executeQuery(sSQL);
		this.rs.add(rstemporal);
	}

	public boolean saltarRegistro(int n) throws SQLException {
		return rs.get(n).next();

	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public ModeloBD getModelo() {
		return modelo;
	}

	public void setModelo(ModeloBD modelo) {
		this.modelo = modelo;
	}

}
