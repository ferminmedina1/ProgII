package PracticaNum4ejer4;

public abstract class Integrante {
	
	private String nombre;
	private String apellido;
	private int pasaporte;
	
	private int diaNacimiento;
	private int mesNacimiento;
	private int anioNacimiento;
	
	private boolean enPaisOrigen;
	private boolean concentrado;
	
 	public Integrante(String nombre, String apellido, int pasaporte, int diaNacimiento, int mesNacimiento, int anioNacimiento) {
 		this.nombre = nombre;
 		this.apellido = apellido;
 		this.pasaporte = pasaporte;
 		this.diaNacimiento = diaNacimiento;
 		this.mesNacimiento = mesNacimiento;
 		this.anioNacimiento = anioNacimiento;
 		
	}

 	public void imprimirEstado(boolean estado){
 		if(estado) {
 			System.out.println("El jugador " + nombre + " esta en estado para poner huevos en la cancha.");
 		}else {
 			System.out.println("El puto de " + nombre + " no esta disponible.");
 		}
 	}
 	
 	public boolean isEstado() {
 		if(enPaisOrigen && concentrado) {
 			return true;
 		}else {
 			return false;
 		}
 	}
 	
 	
 	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(int pasaporte) {
		this.pasaporte = pasaporte;
	}
	
	public int getDiaNacimiento() {
		return diaNacimiento;
	}
	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}
	public int getMesNacimiento() {
		return mesNacimiento;
	}
	public void setMesNacimiento(int mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	
	
	public boolean isEnPaisOrigen() {
		return enPaisOrigen;
	}
	public void setEnPaisOrigen(boolean enPaisOrigen) {
		this.enPaisOrigen = enPaisOrigen;
	}
	public boolean isConcentrado() {
		return concentrado;
	}
	public void setConcentrado(boolean concentrado) {
		this.concentrado = concentrado;
	}

	
}
