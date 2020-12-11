package Juego;

import java.util.ArrayList;


import Pocimas.Pocima;

public class Carta {
	
	private String nombre;
	private ArrayList<Atributo> atributos= new ArrayList<Atributo>();
	private Pocima pocion;
	
	public Carta(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Atributo> getAtributos() {
		return new ArrayList<Atributo>(atributos);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return nombre;
	}
	
	public void addAtributo(Atributo atributo) {
		if(!atributos.contains(atributo)) {			
			this.atributos.add(atributo);
		}
	}
	
	public double getValorAtributo(Atributo a) {
		if(atributos.contains(a)) {
			return a.getValor();
		}
		return 0;
	}
	
	public double activarPocima(Atributo a) {	
		return pocion.efecto(a);
	}
	
	public void setPocion(Pocima pocion) {
		this.pocion = pocion;
	}

	public Pocima getPocion() {
		return pocion;
	}
	
	public boolean tienePocion() {
		return pocion != null;
	}

	public Atributo getAtributoConNombre(Atributo a) {
		for (Atributo atributo : atributos) {
			if(atributo.getNombreAtributo().equals(a.getNombreAtributo()))
				return atributo;
		}
		return null;
	}
}
