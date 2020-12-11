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
	
	public void getAtributosConValor() {
		System.out.println("----------------------------------------");
		System.out.println(this.nombre);
		for (Atributo atributo : atributos) {
			System.out.println(atributo);	
			System.out.println(atributo.getValor());
		}
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
			if(pocion != null) {				
				return a.getValorConPocima();
			}
			else 
				return a.getValor();
		}
		return 0;
	}
	
	public int getValorAtributoSinPocion(Atributo a) {
		if(atributos.contains(a)) {
				return a.getValor();
		}else {
			return 0;
		}
	}
	
	public void setPocion(Pocima pocion) {
		for (Atributo atributo : atributos) {			
			atributo = pocion.efecto(atributo);
		}
		this.pocion = pocion;
	}

	public Pocima getPocion() {
		return pocion;
	}

	public Atributo getAtributoConNombre(Atributo a) {
		for (Atributo atributo : atributos) {
			if(atributo.getNombreAtributo().equals(a.getNombreAtributo()))
				return atributo;
		}
		return null;
	}
}
