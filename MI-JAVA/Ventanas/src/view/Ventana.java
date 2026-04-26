package view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.*;

public class Ventana extends JFrame {

	private ArrayList<JButton> botones;
	private ArrayList<JPanel> paneles;

	public Ventana(int n) {

		botones = new ArrayList<>();
		paneles = new ArrayList<>();
		crearVentana(n);
		crearPanel();
		crearBotones(n);
		// pack();
	}

	private void crearPanel() {

		JPanel panel = new JPanel();
		paneles.add(panel);
		add(panel, BorderLayout.CENTER);

	}

	private void crearBotones(int n) {

		JButton boton = new JButton("" + n);
		botones.add(boton);
		paneles.get(0).add(boton);

	}

	public void hacerVisible(boolean b) {

		setVisible(b);
	}

	private void crearVentana(int n) {

		setLocationRelativeTo(null);
		setTitle("" + n);
		setSize(200, 100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());

	}

	public ArrayList<JButton> getBotones() {
		return botones;
	}

	public void setBotones(ArrayList<JButton> botones) {
		this.botones = botones;
	}

}
