package PracticaNum4ejer3;

public class EmpleadoPorHora extends Empleado {
	
	private int gananciasExtra;
	private int horasExtras;
	
	public EmpleadoPorHora(int horasExtras) {
		this.sueldo = super.getSueldo();
		gananciasExtra = getGananciasExtras(horasExtras, sueldo);
		this.sueldo = sueldo + gananciasExtra;
	}
	
	public int getGananciasExtras(int horasExtras, int sueldo) {
		gananciasExtra = 0;
		
		//$100 por hora.
		float porHorasExtras =  100;
		
		gananciasExtra = (int) (horasExtras * porHorasExtras);
		
		return gananciasExtra;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public String getGanancias() {
		return "El empleado de comision genero una ganancia extra de: $" + this.gananciasExtra; 
	}
}
