package PracticaNum4ejer3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1 = new EmpleadoContratado();
		Empleado empleado2 = new EmpleadoComision(3);
		Empleado empleado3 = new EmpleadoPorHora(2);
		
		
		System.out.println("El sueldo del empleado 1 es: " + empleado1.getSueldo());
		
		System.out.println("El sueldo del empleado 2 es: " + empleado2.getSueldo());
		System.out.println("El sueldo del empleado 2 es: " + ((EmpleadoComision) empleado2).getGanancias());
		
		System.out.println("El sueldo del empleado 3 es: " + empleado3.getSueldo());
		System.out.println("El sueldo del empleado 3 es: " + ((EmpleadoPorHora) empleado3).getGanancias());

	}

}
