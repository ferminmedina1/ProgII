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
	public Atributo efecto(Atributo a) {
		double valor = 0;
		for (Pocima p : pocimas) {
			Atributo a1 = p.efecto(a);
			valor = a1.getValorConPocima();
		}
		a.setValorConPocima(valor);
		return a;
	}
	
}
