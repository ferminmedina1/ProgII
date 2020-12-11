package PracticaNum4ejer3;

public class EmpleadoComision extends Empleado {
	
	private int ventas;
	private int gananciasExtra;
	
	public EmpleadoComision(int ventas) {
		this.sueldo = super.getSueldo();
		this.setVentas(ventas);
		gananciasExtra = getGananciasExtras(ventas, sueldo);
		
		//System.out.println("Las ganancias extras fueron un total de: $" + gananciasExtra);
		this.sueldo = sueldo + gananciasExtra;
	}
	
	public int getGananciasExtras(int ventas, int sueldo) {
		gananciasExtra = 0;
		
		//10% del sueldo por ventas;
		float porVenta = sueldo * 0.10f;
		
		gananciasExtra = (int) (ventas * porVenta);
		return gananciasExtra;
	}
	
	public String getGanancias() {
		return "El empleado de comision genero una ganancia extra de: $" + this.gananciasExtra; 
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	
}
