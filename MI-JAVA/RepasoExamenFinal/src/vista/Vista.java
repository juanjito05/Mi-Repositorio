package vista;

import java.awt.*;
import java.util.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Vista extends JFrame {

	private ArrayList<JPanel> paneles;
	private ArrayList<JLabel> etiquetas;
	private ArrayList<JButton> botones;
	private ArrayList<JTable> tablas;

	private ArrayList<String> columnas;
	private ArrayList<Object[]> datos;

	public Vista() {

		paneles = new ArrayList<>();
		etiquetas = new ArrayList<>();
		botones = new ArrayList<>();

		crearVentana();
		crearPaneles(BorderLayout.NORTH);
		crearPaneles(BorderLayout.CENTER);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public Vista(String texto) {

		paneles = new ArrayList<>();
		etiquetas = new ArrayList<>();
		botones = new ArrayList<>();

		crearVentana();
		crearPaneles(BorderLayout.NORTH);

		setTitle(texto);

	}

	public Vista(String texto, int i) {

		paneles = new ArrayList<>();
//		etiquetas = new ArrayList<>();
//		botones = new ArrayList<>();

		tablas = new ArrayList<>();

		columnas = new ArrayList<>();
		datos = new ArrayList<>();

		crearVentana();
		crearPaneles(BorderLayout.NORTH);

		setTitle(texto);

	}

	public void crearTabla(int n) {

		DefaultTableModel modelotabla = new DefaultTableModel();

		for (int i = 0; i < columnas.size(); i++) {
			modelotabla.addColumn(columnas.get(i));
		}

		for (int i = 0; i < datos.size(); i++) {
			modelotabla.addRow(datos.get(i));
		}

		JTable tabla = new JTable(modelotabla);
		JScrollPane scroll = new JScrollPane(tabla);
		tablas.add(tabla);
		paneles.get(n).setLayout(new BorderLayout());
		paneles.get(n).add(scroll,BorderLayout.CENTER);

	}

	public void crearBotones(int n, String texto) {

		JButton boton = new JButton(texto);
		botones.add(boton);
		paneles.get(n).add(boton);

	}

	public void crearEtiquetas(int n, String texto) {

		JLabel etiqueta = new JLabel(texto);
		etiquetas.add(etiqueta);
		paneles.get(n).add(etiqueta);

	}

	public void crearPaneles(String borderlayout) {

		JPanel panel = new JPanel();
		paneles.add(panel);
		add(panel, borderlayout);

	}

	public void crearVentana() {

		setLayout(new BorderLayout());
		// setSize(400,400);
		setLocationRelativeTo(null);

	}

	public void hacerVisible(boolean b) {

		setVisible(true);

	}

	public ArrayList<JPanel> getPaneles() {
		return paneles;
	}

	public void setPaneles(ArrayList<JPanel> paneles) {
		this.paneles = paneles;
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

	public ArrayList<JTable> getTablas() {
		return tablas;
	}

	public void setTablas(ArrayList<JTable> tablas) {
		this.tablas = tablas;
	}

	public ArrayList<String> getColumnas() {
		return columnas;
	}

	public void setColumnas(ArrayList<String> columnas) {
		this.columnas = columnas;
	}

	public ArrayList<Object[]> getDatos() {
		return datos;
	}

	public void setDatos(ArrayList<Object[]> datos) {
		this.datos = datos;
	}

}
