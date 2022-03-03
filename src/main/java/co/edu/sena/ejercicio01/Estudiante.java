package co.edu.sena.ejercicio01;

public class Estudiante extends Persona{
	private int carnet;

	public Estudiante(int cedula, String nombres, String apellidos, String celular) {
		super(cedula, nombres, apellidos, celular);
		// TODO Auto-generated constructor stub
	}
	public int getCarnet() {
		return carnet;
	}

	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}
	
	
}
