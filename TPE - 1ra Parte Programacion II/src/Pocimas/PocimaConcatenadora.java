package Pocimas;

import java.util.ArrayList;

import Juego.Atributo;

public class PocimaConcatenadora extends Pocima{

	private ArrayList<Pocima> pocimas;
	
	public PocimaConcatenadora(String nombre, ArrayList<Pocima> pocimas) {
		super(nombre);
		this.pocimas = new ArrayList<Pocima>(pocimas);
	}

	@Override
	public double efecto(Atributo a) {
		double valor = a.getValor();
		for (Pocima p : pocimas) {
			Atributo aux = new Atributo(a.getNombreAtributo(), valor);
			valor = p.efecto(aux);
		}
		return valor;
	}
	
}
