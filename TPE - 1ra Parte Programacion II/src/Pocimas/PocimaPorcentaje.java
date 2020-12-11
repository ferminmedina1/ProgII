package Pocimas;

import Juego.Atributo;

public class PocimaPorcentaje extends Pocima{

	private double porcentaje;
	
	public PocimaPorcentaje(String nombre, double porcentaje) {
		super(nombre);
		this.porcentaje = porcentaje;
	}
	
	@Override
	public double efecto(Atributo a) {
		return (a.getValor() * (100 + porcentaje) / 100);
	}

}
