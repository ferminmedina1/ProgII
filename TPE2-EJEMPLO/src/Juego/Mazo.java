package Juego;

import java.util.ArrayList;

public class Mazo {
	
	private ArrayList<Atributo>atributos;
	private ArrayList<Carta>cartas = new ArrayList<Carta>();
	
	public Mazo() {
		this.atributos = new ArrayList<Atributo>();
	}

	public void addAtributo(Atributo a){

		if(!atributos.contains(a)) {
			this.atributos.add(a);
		}
	}

	public ArrayList<Atributo> getAtributos() {
		return new ArrayList<Atributo>(atributos);
	}
	
	public void addCarta(Carta c) {
		if(cartas.size() == 0) {
			this.cartas.add(c);
			this.atributos = c.getAtributos();
		}else {
			if(cumpleAtributos(c)) {
				this.cartas.add(c);
			}
		}
	}
	
	public ArrayList<Carta> getCartas() {
		return new ArrayList<Carta>(cartas);
	}
	
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public Carta getCartaEspecifica(int number) {
		return cartas.get(number);
	}

	
	public String toString() {
		return "Los atributos del mazo son: " + getAtributos() + "\nLas cartas que contiene el mazo son: " + getCartas();
	}

	public boolean mazoEnCondiciones() {
		for (int i = 0; i < cartas.size(); i++) {
			if(!cartas.get(i).getAtributos().equals(this.atributos)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean cumpleAtributos(Carta c) {
		if (c.getAtributos().equals(atributos)) {
			return true;
		}else {
			System.out.println("La carta: " + c + " no cumple con los atributos de este mazo");
			return false;
		}
	}


}

