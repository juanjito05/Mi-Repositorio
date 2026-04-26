package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import DataBase.CoBD;
import model.Modelo;
import vista.Vista;

public class ListadoTablas implements ActionListener {

	Vista v2;
	Modelo modelo;
	CoBD conn;

	public ListadoTablas(Vista v2, Modelo modelo, CoBD conn) {

		this.v2 = v2;
		this.modelo = modelo;
		this.conn = conn;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < v2.getBotones().size(); i++) {
			if (e.getSource() == v2.getBotones().get(i)) {

				Vista vTabla = new Vista(v2.getTitle(), 1);

				String consulta = conn.getBd().getConsultas().get(2) + v2.getTitle();

				try {
					conn.setRs(2, consulta);
				} catch (SQLException e1) {
					System.out.println("Errror de registro" + e1.getMessage());
				}

				for (int j = 0; j < modelo.getNombreColumnas().size(); j++) {
					vTabla.getColumnas().add(modelo.getNombreColumnas().get(j));
				}
				try {
					while (conn.saltarRegistro(2)) {
						vTabla.getDatos()
								.add(new Object[] { conn.getRs().get(2).getString(1), conn.getRs().get(2).getString(2),
										conn.getRs().get(2).getString(3), conn.getRs().get(2).getString(4) });
					}

				} catch (SQLException e1) {
					System.out.println("Errror de registro " + e1.getMessage());
				}

				vTabla.crearTabla(0);
				vTabla.pack();
				vTabla.hacerVisible(true);
			}

		}

	}

}
