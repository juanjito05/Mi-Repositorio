package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Modelo;

public class Vista extends JFrame {

	private ArrayList<JPanel> paneles;
	private ArrayList<JTextField> cajas;
	private ArrayList<JLabel> etiquetas;
	
	Modelo model;

	public Vista() {

		paneles = new ArrayList<>();
		cajas = new ArrayList<>();
		etiquetas = new ArrayList<>();
		
		model = new Modelo();

		crearVentana();
		crearPaneles();
		crearCajas();
	}

	private void crearVentana() {
		
		setTitle(model.getDatos().get(0));
		setLocation(400, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	private void crearPaneles() {

		JPanel panelCaja = new JPanel(new GridLayout(2, 0));
		paneles.add(panelCaja);
		add(panelCaja);

	}

	private void crearCajas() {

		JPanel panelCaja = paneles.get(0);

		JTextField caja = new JTextField(30);
		cajas.add(caja);
		panelCaja.add(caja);
		
		this.pack();

	}


	private void hacerVisible(boolean b) {

		setVisible(b);

	}

	public static void main(String[] args) {

		Vista vista = new Vista();
		vista.hacerVisible(true);
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

	
}
