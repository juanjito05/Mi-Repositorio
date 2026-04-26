package DataBase;

import java.sql.*;
import java.util.ArrayList;

public class CoBD {

	ModeloBD bd;
	Connection conx;

	private ArrayList<ResultSet> rs;
	private ArrayList<Statement> st;

	public CoBD() throws SQLException {

		bd = new ModeloBD();
		conx = conectar();

		st = new ArrayList<>();
		rs = new ArrayList<>();

		crearStatement();

	}

	private void crearStatement() throws SQLException {

		setSt();
		setSt();
		setSt();

	}

	private Connection conectar() {

		try {
			conx = DriverManager.getConnection(bd.getUrl(), bd.getUser(), bd.getPass());
			System.out.println("¡Conectado!");
			return conx;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public ModeloBD getBd() {
		return bd;
	}

	public void setBd(ModeloBD bd) {
		this.bd = bd;
	}

	public Connection getConx() {
		return conx;
	}

	public void setConx(Connection conx) {
		this.conx = conx;
	}

	public ArrayList<ResultSet> getRs() {
		return rs;
	}

	public void setRs(int n, String sql) throws SQLException {
		ResultSet resultset = st.get(n).executeQuery(sql);

		if (n < rs.size()) {
			rs.set(n, resultset);
		} else {
			rs.add(resultset);
		}
	}

	public ArrayList<Statement> getSt() {
		return st;
	}

	public void setSt() throws SQLException {
		this.st.add(conx.createStatement());
	}

	public boolean saltarRegistro(int i) throws SQLException {
		return rs.get(i).next();
	}

}
