package TP8Navidad;

import java.util.ArrayList;

public class ContenedorBuzon extends ElementoNavidad{

	private ArrayList<ElementoNavidad> elems;
	private String nombre;
	
	public ContenedorBuzon(String nombre) {
		this.nombre = nombre;
		elems = new ArrayList<ElementoNavidad>();
	}
	
	public void addElem(ElementoNavidad e) {
		elems.add(e);
	}
	
	public String toString() {
		return nombre;
	}

	@Override
	public int getCartasTotales() {
		int cartas = 0;
		for (ElementoNavidad elem : elems) {
			cartas += elem.getCartasTotales();
		}
		return cartas;
	}

	@Override
	public int getCartasCumplidoras(Condicion c) {
		int cartas = 0;
		for (ElementoNavidad elem : elems) {
			cartas += elem.getCartasCumplidoras(c);
		}
		return cartas;
	}
}
