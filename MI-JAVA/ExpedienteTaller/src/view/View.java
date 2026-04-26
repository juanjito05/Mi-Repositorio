package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

/*
 * @author Juan Jose Ortiz Jimenez
 * 16/04/2026
 */

public class View extends JFrame {

	private ArrayList<JPanel> panels;
	private ArrayList<JLabel> labels;
	private ArrayList<JTextField> fields;
	private ArrayList<JButton> buttons;
	private ArrayList<JComboBox> combos;
	private ArrayList<JTextArea> areas;

//  VISTA 1 : VENTANA PRINCIPAL
	public View() {
		panels = new ArrayList<>();
		buttons = new ArrayList<>();

		setWindow();
		createPanels(BorderLayout.NORTH);
		createPanels(BorderLayout.CENTER);
		createPanels(BorderLayout.SOUTH);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

//  VISTA 2 : INTRODUCIR CLIENTE
	public View(String text) {

		panels = new ArrayList<>();
		labels = new ArrayList<>();
		fields = new ArrayList<>();
		buttons = new ArrayList<>();

		setWindow();
		createPanels(BorderLayout.NORTH);
		createPanels(BorderLayout.CENTER);
		createPanels(BorderLayout.SOUTH);

		setTitle(text);

	}

//  VISTA 3 : INTRODUCIR EL PRODUCTO
	public View(int n) {

		panels = new ArrayList<>();
		labels = new ArrayList<>();
		fields = new ArrayList<>();
		buttons = new ArrayList<>();
		combos = new ArrayList<>();

		setWindow();
		createPanels(BorderLayout.NORTH);
		createPanels(BorderLayout.CENTER);
		createPanels(BorderLayout.SOUTH);

		setTitle("" + n);

	}

//  VISTA 4 : INTRODUCIR EL PARTE
	public View(String text, int n) {

		panels = new ArrayList<>();
		labels = new ArrayList<>();
		buttons = new ArrayList<>();
		combos = new ArrayList<>();
		areas = new ArrayList<>();

		setWindow();
		createPanels(BorderLayout.NORTH);
		createPanels(BorderLayout.CENTER);
		createPanels(BorderLayout.SOUTH);

		setTitle(text + n);

	}

	public void createCombos(int n) {

		JComboBox<String> combo = new JComboBox<>();
		combos.add(combo);
		panels.get(n).add(combo);
	}

	public void createButtons(int n, String text) {

		JButton button = new JButton(text);
		buttons.add(button);
		panels.get(n).add(button);

	}

	public void createPanels(String borderLayout) {

		JPanel panel = new JPanel();
		panels.add(panel);
		add(panel, borderLayout);
		panel.setPreferredSize(new Dimension(550, 100));

		revalidate();
		repaint();

	}

	public void makeVisible(boolean b) {
		setVisible(b);

	}

	public void createTexts(int n) {
		JTextField field = new JTextField(15);
		fields.add(field);
		panels.get(n).add(field);

	}

	public void createTextAreas(int n) {
		JTextArea area = new JTextArea(10, 15);
		areas.add(area);
		panels.get(n).add(area);

//		JScrollPane pScroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	}

	public void createLabels(int n, String text) {

		JLabel label = new JLabel(text);
		labels.add(label);
		panels.get(n).add(label);

	}

	private void setWindow() {

//		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		revalidate();
		repaint();

	}

	public ArrayList<JPanel> getPanels() {
		return panels;
	}

	public void setPanels(ArrayList<JPanel> panels) {
		this.panels = panels;
	}

	public ArrayList<JLabel> getLabels() {
		return labels;
	}

	public void setLabels(ArrayList<JLabel> labels) {
		this.labels = labels;
	}

	public ArrayList<JButton> getButtons() {
		return buttons;
	}

	public void setButtons(ArrayList<JButton> buttons) {
		this.buttons = buttons;
	}

	public ArrayList<JTextField> getFields() {
		return fields;
	}

	public void setFields(ArrayList<JTextField> fields) {
		this.fields = fields;
	}

	public ArrayList<JComboBox> getCombos() {
		return combos;
	}

	public void setCombos(ArrayList<JComboBox> combos) {
		this.combos = combos;
	}

	public ArrayList<JTextArea> getAreas() {
		return areas;
	}

	public void setAreas(ArrayList<JTextArea> areas) {
		this.areas = areas;
	}

}
