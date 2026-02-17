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
		
	}

	private void crearVentana() {
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 4));
		
	}

}
