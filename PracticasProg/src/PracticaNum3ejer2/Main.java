package PracticaNum3ejer2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico microondas = new Electrodomestico("Microondas Wave", 250, "Rojo");
		
		System.out.println("Balance: " + microondas.balance());
		System.out.println("Nombre: " + microondas.getNombre());
		System.out.println("Color: " + microondas.getColor());
		System.out.println("Precio: " + microondas.getPrecio());
		microondas.setNombre("Otro nombre qcy");
		System.out.println("Nuevo nombre: " + microondas.getNombre());
	}

}
