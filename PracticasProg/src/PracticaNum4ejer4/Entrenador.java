package PracticaNum4ejer4;

public class Entrenador extends Integrante {
	
	private String federacion;
	
	public Entrenador(String nombre, String apellido, int pasaporte, int diaNacimiento, int mesNacimiento,
			int anioNacimiento, String federacion) {
		super(nombre, apellido, pasaporte, diaNacimiento, mesNacimiento, anioNacimiento);
		
		this.federacion = federacion;
		
	}

	public String getFederacion() {
		return federacion;
	}

	public void setFederacion(String federacion) {
		this.federacion = federacion;
	}
	
}
