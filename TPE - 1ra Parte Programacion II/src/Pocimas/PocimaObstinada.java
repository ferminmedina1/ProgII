package Pocimas;

import Juego.Atributo;

public class PocimaObstinada extends Pocima{

	private int num;
	
	public PocimaObstinada(String nombre,int num) {
		super(nombre);
		this.num = num;
	}

	@Override
	public double efecto(Atributo a) {
		return num;
	}
}
