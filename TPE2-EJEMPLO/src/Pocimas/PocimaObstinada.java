package Pocimas;

import Juego.Atributo;

public class PocimaObstinada extends Pocima{

	private int num;
	
	public PocimaObstinada(String nombre,int num) {
		super(nombre);
		this.num = num;
	}

	@Override
	public Atributo efecto(Atributo a) {
		a.setValorConPocima(num);
		return a;
	}
}
