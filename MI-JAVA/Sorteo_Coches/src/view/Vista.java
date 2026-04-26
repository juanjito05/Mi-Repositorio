package view;

import java.awt.*;
import java.util.*;

import javax.swing.*;

public class Vista extends JFrame {

	private ArrayList<JPanel> paneles;
	private ArrayList<JTextField> cajas;
	private ArrayList<JLabel> etiquetas;
	private ArrayList<JButton> botones;
	private ArrayList<JComboBox> combos;
	private ArrayList<JCheckBox> checks;

	public Vista() {

		paneles = new ArrayList<>();
		cajas = new ArrayList<>();
		etiquetas = new ArrayList<>();
		botones = new ArrayList<>();
		combos = new ArrayList<>();
		checks = new ArrayList<>();

		crearVentana();
		crearPaneles(BorderLayout.NORTH);
		crearPaneles(BorderLayout.CENTER);
		crearPaneles(BorderLayout.SOUTH);
	}

	public void crearChecks(int i) {

		JCheckBox check = new JCheckBox();
		checks.add(check);
		paneles.get(i).add(check);

	}

	public Vista(String texto) {

		paneles = new ArrayList<>();
		etiquetas = new ArrayList<>();
		botones = new ArrayList<>();

		crearVentana();
		this.setTitle(texto);
		crearPaneles(BorderLayout.NORTH);
		crearEtiquetas(0);
		crearBotones(0);

	}

	public void crearJComboBox(int i) {

		JComboBox<String> combo = new JComboBox<>();
		combos.add(combo);
		paneles.get(i).add(combo);
	}

	public void crearBotones(int i) {

		JButton boton = new JButton();
		botones.add(boton);
		paneles.get(i).add(boton);

	}

	public void crearEtiquetas(int i) {

		JLabel etiqueta = new JLabel();
		etiquetas.add(etiqueta);
		paneles.get(i).add(etiqueta);

	}

	public void crearCajas(int i) {

		JTextField caja = new JTextField(15);
		cajas.add(caja);
		paneles.get(i).add(caja);

	}

	public void hacerVisible(boolean b) {

		setVisible(b);
	}

	private void crearVentana() {

		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private void crearPaneles(String north) {

		JPanel panelNorte = new JPanel();
		paneles.add(panelNorte);
		panelNorte.setPreferredSize(new Dimension(500, 100));
		add(panelNorte, north);

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

	public ArrayList<JComboBox> getCombos() {
		return combos;
	}

	public void setCombos(ArrayList<JComboBox> combos) {
		this.combos = combos;
	}

	public ArrayList<JCheckBox> getChecks() {
		return checks;
	}

	public void setChecks(ArrayList<JCheckBox> checks) {
		this.checks = checks;
	}

}
