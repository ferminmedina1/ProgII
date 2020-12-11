package PracticaNum4ejer3;

public class EmpleadoContratado extends Empleado {

	
	public EmpleadoContratado() {
		this.sueldo = super.getSueldo();
	}
	
	public int getSueldo() {
		return sueldo;
	}
}
