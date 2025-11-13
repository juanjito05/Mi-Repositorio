package model;

public class Clientes {

	private String codigo = "";
	private String cif = "";
	private String nombre = "";
	private String direccion = "";
	private int cp;
	private int antiguedad;

	public Clientes(int num) {
		if (num < 10) {
			codigo = "CLI-0";
		} else {
			codigo = "CLI-";
		}
		codigo += num;
	}

	public void creaDNI(int num) {
		String letras = "TRWAGMYFPDXNJZSQVHLCKE";
		int pos = num % 23;
		String numS = Integer.toString(num);
		cif = numS + letras.substring(pos - 1, pos);

	}

	public void creaNombre(String nombre) {
		this.nombre = nombre;
	}

	public void creaDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void creaCP(int cp) {
		this.cp = cp;
	}

	public void creaAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void mostrarCliente() {
		System.out.println(codigo + "\t" + cif + "\t" + nombre + "\t" + "\t" + direccion + "\t" + cp + "\t" + antiguedad
				+ " años");
	}

}
