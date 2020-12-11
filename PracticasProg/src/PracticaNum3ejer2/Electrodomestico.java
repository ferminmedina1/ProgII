package PracticaNum3ejer2;

public class Electrodomestico {
	
	private String nombre;
	private int precio = 100;
	private String color = "Gris plata";
	private int consumoEnergetico = 10;
	private int peso = 2;
	private int balance;
	
	
	public Electrodomestico(String nombre, int precio, String color) {
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precioBase) {
		this.precio = precioBase;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(int consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public boolean bajoConsumo() {
		float MAXconsumo = 45;
		if(this.consumoEnergetico < MAXconsumo) {
			return true;
		}else {
			return false;
		}
		
	}

	public int balance() {
		balance = this.precio / this.peso;
		return balance;
	}

	public boolean altaGama() {
		float calidadAltaGama = 3;
		if(balance > calidadAltaGama) {
			return true;
		}else {
			return false;
		}
	}
}
