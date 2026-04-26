package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.*;

public class Vista extends JFrame {

	private ArrayList<JPanel> paneles;
	private ArrayList<JTextField> cajas;
	private ArrayList<JLabel> etiquetas;
	private ArrayList<JButton> botones;
	private ArrayList<JRadioButton> radios;

	public Vista() {

		paneles = new ArrayList<>();
		cajas = new ArrayList<>();
		etiquetas = new ArrayList<>();
		botones = new ArrayList<>();

		configurarVentana();
		crearPaneles();

	}

	public Vista(String texto) {

		paneles = new ArrayList<>();
		radios = new ArrayList<>();
		etiquetas = new ArrayList<>();

		configurarVentana();
		crearPaneles();

	}

	private void configurarVentana() {

		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void crearCajas(int n) {

		JTextField caja = new JTextField(15);
		cajas.add(caja);
		paneles.get(n).add(caja);

	}

	private void crearPaneles() {

		JPanel panel1 = new JPanel();
		paneles.add(panel1);
		add(panel1, BorderLayout.NORTH);

		JPanel panel2 = new JPanel();
		paneles.add(panel2);
		add(panel2, BorderLayout.CENTER);

		JPanel panel3 = new JPanel();
		paneles.add(panel3);
		add(panel3, BorderLayout.SOUTH);

	}

	public void hacerVisible(boolean b) {
		setVisible(b);

	}

	public void crearBotones(int i, String texto) {

		JButton boton = new JButton(texto);
		botones.add(boton);
		paneles.get(i).add(boton);

	}

	public void crearEtiquetas(int i, String texto) {

		JLabel etiqueta = new JLabel(texto);
		etiquetas.add(etiqueta);
		paneles.get(i).add(etiqueta);

		revalidate();
		repaint();

	}

	public void crearRadios(int i) {

		JRadioButton radio = new JRadioButton();
		radios.add(radio);
		paneles.get(i).add(radio);

	}

	public ArrayList<JPanel> getPaneles() {
		return paneles;
	}

	public void setPaneles(ArrayList<JPanel> paneles) {
		this.paneles = paneles;
	}

	public ArrayList<JTextField> getCajas() {
		return cajas;
	}

	public void setCajas(ArrayList<JTextField> cajas) {
		this.cajas = cajas;
	}

	public ArrayList<JLabel> getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(ArrayList<JLabel> etiquetas) {
		this.etiquetas = etiquetas;
	}

	public ArrayList<JButton> getBotones() {
		return botones;
	}

	public void setBotones(ArrayList<JButton> botones) {
		this.botones = botones;
	}

}
