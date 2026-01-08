package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vista extends JFrame {

	private ArrayList<JButton> botones;
	private ArrayList<JLabel> ventanas;
	private ArrayList<JPanel> paneles;

	public Vista() {

		botones = new ArrayList<>();
		ventanas = new ArrayList<>();
		paneles = new ArrayList<>();

		configurarVentana("Hola");
		crearPaneles();
		crearPantalla();
		

	}

	public void actualizarPantalla(String texto) {
		
		ventanas.get(0).setText("Planta: "+texto);
	}

	public void crearPantalla() {

		JPanel panelPantalla = paneles.get(0);

		JLabel pantalla = new JLabel("Planta:");
		ventanas.add(pantalla);
		add(pantalla);
		panelPantalla.add(pantalla);
	}

	private void crearPaneles() {

		JPanel panelPantalla = new JPanel();
		paneles.add(panelPantalla);
		add(panelPantalla);

		JPanel panelBotones = new JPanel(new GridLayout(3, 3));
		paneles.add(panelBotones);
		add(panelBotones);

	}

	public void hacerBotones(String texto) {

		JPanel panelBotones = paneles.get(1);

		JButton boton = new JButton(texto);
		botones.add(boton);
		add(boton);
		panelBotones.add(boton);

	}

	public void hacerVisible(boolean b) {
		setVisible(b);

	}

	private void configurarVentana(String texto) {

		setTitle(texto);
		setSize(500,300);
		setLayout(new GridLayout(1, 2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public ArrayList<JButton> getBotones() {
		return botones;
	}

	public void setBotones(ArrayList<JButton> botones) {
		this.botones = botones;
	}

}
