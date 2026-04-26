package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import DataBase.CoBD;
import model.Modelo;
import vista.Vista;

public class Oyente implements ActionListener {

	Vista v1;
	CoBD conn;
	Modelo modelo;

	public Oyente(Vista v1, CoBD conn, Modelo modelo) {

		this.v1 = v1;
		this.conn = conn;
		this.modelo = modelo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == v1.getBotones().get(0)) {

			for (int i = 0; i < v1.getEtiquetas().size(); i++) {

				Vista v2 = new Vista(v1.getEtiquetas().get(i).getText());
				String sql = conn.getBd().getConsultas().get(1) + v2.getTitle();

				modelo.getNombreColumnas().clear();

				try {
					conn.setRs(1, sql);
				} catch (SQLException e1) {

					System.out.println("Error de consulta" + e1.getMessage());
				}

				try {
					while (conn.saltarRegistro(1)) {
						modelo.getNombreColumnas().add(conn.getRs().get(1).getString(1));
					}
				} catch (SQLException e1) {

					System.out.println("Error de registro" + e1.getMessage());
				}

				for (int f = 0; f < modelo.getNombreColumnas().size(); f++) {
					v2.crearBotones(0, modelo.getNombreColumnas().get(f));
				}
				
				for (int j = 0; j < v2.getBotones().size(); j++) {
					v2.getBotones().get(j).addActionListener(new ListadoTablas(v2,modelo,conn));
				}
				v2.pack();
				v2.hacerVisible(true);
			}
		}

	}

}
