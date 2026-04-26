package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Ventana;

public class Oyente implements ActionListener {

	Ventana vista;

	public Oyente(Ventana vista) {

		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.getBotones().get(0)) {
			Ventana vistaNueva = new Ventana(Integer.parseInt(vista.getTitle()) + 1);
			vista.setVisible(false);
			vistaNueva.hacerVisible(true);
			vistaNueva.setLocation(vista.getLocation().x + 185, vista.getLocation().y);
			vistaNueva.getBotones().get(0).addActionListener(new Oyente(vistaNueva));
		}

	}

}
