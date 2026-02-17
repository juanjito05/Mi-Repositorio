package view;

import javax.swing.*;

import java.awt.GridLayout;
import java.util.*;
public class Vista extends JFrame{
	
	private ArrayList<JPanel> paneles;
	private ArrayList<JLabel> etiquetas;
	private ArrayList<JRadioButton> botones;

	public Vista() {

		paneles = new ArrayList<>();
		etiquetas = new ArrayList<>();
		botones = new ArrayList<>();

		crearVentana();
		paneles = crearPaneles(paneles, 8);
	}
	
	private ArrayList<JPanel> crearPaneles(ArrayList<JPanel> paneles, int n) {

		for (int i = 0; i < n; i++) {
			JPanel panel = new JPanel(new GridLayout(6, 4));
			paneles.add(panel);
			this.add(panel);
		}
		return paneles;

	}

	private void crearVentana() {
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 4));
		
	}

}
