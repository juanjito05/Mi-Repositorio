package view;

import java.awt.BorderLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Vista extends JFrame {

	private ArrayList<JPanel> paneles;
	private ArrayList<JComboBox> combos;
	private ArrayList<JTable> tablas;

	private ArrayList<String> columnas;
	private ArrayList<Object[]> datos;

	public Vista() {

		paneles = new ArrayList<>();
		combos = new ArrayList<>();

		crearVentana();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		crearPaneles();

	}

	public Vista(String table) {

		paneles = new ArrayList<>();
		tablas = new ArrayList<>();

		columnas = new ArrayList<>();
		datos = new ArrayList<>();

		crearVentana();
		this.setTitle(table);
		crearPaneles();
		crearTabla();
		
		this.setSize(1000, 500);

	}

	public void crearTabla() {

		DefaultTableModel modelo = new DefaultTableModel();

//		columnas.add("ID");
//		columnas.add("Nombre");
//
//		datos.add(new Object[] { "1", "Tabla_Usuarios" });
//		datos.add(new Object[] { "2", "Tabla_Ventas" });

		for (String nombreCol : columnas) {
			modelo.addColumn(nombreCol);
		}

		for (Object[] fila : datos) {
			modelo.addRow(fila);
		}

		JTable tabla = new JTable(modelo);
		JScrollPane scroll = new JScrollPane(tabla);

		tablas.add(tabla);

		paneles.get(0).setLayout(new BorderLayout());
		paneles.get(0).add(scroll, BorderLayout.CENTER);

	}

	public void hacerVisible(boolean b) {
		setVisible(b);

	}

	private void crearVentana() {

		setSize(400, 400);
		setLocationRelativeTo(null);
		// setLayout(new BorderLayout());
	}

	public void crearCombos() {

		JComboBox<String> combo = new JComboBox<>();
		combos.add(combo);
		paneles.get(0).add(combo);

	}

	private void crearPaneles() {

		JPanel panel1 = new JPanel();
		paneles.add(panel1);
		add(panel1);
	}

	public ArrayList<JTable> getTablas() {
		return tablas;
	}

	public void setTablas(ArrayList<JTable> tabla) {
		this.tablas = tabla;
	}

	public ArrayList<JPanel> getPaneles() {
		return paneles;
	}

	public void setPaneles(ArrayList<JPanel> paneles) {
		this.paneles = paneles;
	}

	public ArrayList<JComboBox> getCombos() {
		return combos;
	}

	public void setCombos(ArrayList<JComboBox> combos) {
		this.combos = combos;
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
