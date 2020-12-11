package SIC;

import java.util.ArrayList;

public class Automovil {

	private String marca;
	private int modelo;
	private ArrayList<String>caract;
	private ArrayList<String>facilidades;
	
	public Automovil(String marca, int modelo) {
		this.marca = marca.toUpperCase();
		this.modelo = modelo;
		this.caract = new ArrayList<>();
		this.facilidades = new ArrayList<>();
	}
	
	public void agregarFacilidad(String f) {
		facilidades.add(f.toUpperCase());
	}
	
	public void agregarCaract(String f) {
		caract.add(f.toUpperCase());
	}

	public String getMarca() {
		return marca;
	}

	public int getModelo() {
		return modelo;
	}

	public boolean tieneCaract(String c) {
		return this.caract.contains(c);
	}

	public boolean tieneFacilidad(String f) {
		return this.facilidades.contains(f);
	}
	
	public String toString() {
		return marca;
	}

	public Automovil getCopia() {
		Automovil copia = new Automovil(this.marca, this.modelo);
		
		for(String caract: caract) {
			copia.agregarCaract(caract);
		}
		for(String facilidad: facilidades) {
			copia.agregarFacilidad(facilidad);
		}
		
		return copia;
	}

	
}
