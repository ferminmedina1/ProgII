package Pocimas;

import Juego.Atributo;

public class PocimaSelectiva extends PocimaPorcentaje{

	private String a1;
	
	public PocimaSelectiva(String nombre, String a1,int porcentaje) {
		super(nombre,porcentaje);
		this.a1 = a1.toUpperCase();
	}

	@Override
	public double efecto(Atributo a) {
		double nuevoValor = a.getValor();
		if(a.getNombreAtributo().equals(a1)) {
			nuevoValor = super.efecto(a);
		}
		return nuevoValor;
	}

}
