package co.edu.sena.ejercicio01;

public class Persona {
	private int cedula;
	private String nombres;
	private String apellidos;
	private String celular;
	
	public Persona(int cedula, String nombres, String apellidos, String celular) {
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.celular = celular;
	}
	
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
	
}
