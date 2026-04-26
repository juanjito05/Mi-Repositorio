package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * @author Juan Jose Ortiz Jimenez
 * 16/04/2026
 */

public class CoConexion {

	Connection conx;
	ModelDatabase moDb;

	ArrayList<Statement> st;
	ArrayList<ResultSet> rs;

	public CoConexion() throws SQLException {

		moDb = new ModelDatabase();
		conx = conexToDb();

		st = new ArrayList<>();
		rs = new ArrayList<>();

		createStatement();

		// insert();

	}

//	CREAR LOS STATEMENTS
	private void createStatement() throws SQLException {

		setSt();
		setSt();
		setSt();
		setSt();
		setSt();

	}

	private Connection conexToDb() {
		try {
			conx = DriverManager.getConnection(moDb.getUrl(), moDb.getUser(), moDb.getPass());
			return conx;
		} catch (Exception e) {
			System.out.println("Error al conectarse " + e.getMessage());
			return null;
		}

	}

	public Connection getConx() {
		return conx;
	}

	public void setConx(Connection conx) {
		this.conx = conx;
	}

	public ArrayList<Statement> getSt() {
		return st;
	}

	public void setSt() throws SQLException {
		Statement state = conx.createStatement();
		this.st.add(state);
	}

	public ArrayList<ResultSet> getRs() {
		return rs;
	}

//  CREAR RESULTSETS
	public void setRs(int n, String sql) throws SQLException {
		ResultSet res = st.get(n).executeQuery(sql);

		if (n < rs.size()) {
			rs.set(n, res);
		} else {
			rs.add(res);
		}
	}

//	EJECUTAR INSERTS,
	public void setRsInsert(int n, String sql) {
		try {
			st.get(n).executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al introducir: " + e.getMessage());
		}
	}

	public ModelDatabase getMoDb() {
		return moDb;
	}

	public void setMoDb(ModelDatabase moDb) {
		this.moDb = moDb;
	}

}
