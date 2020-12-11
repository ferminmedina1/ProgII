package Pocimas;

import Juego.Atributo;

public class FortalecedoraYReductora extends Pocima{

	private int porcentaje;
	
	public FortalecedoraYReductora(String nombre, int porcentaje) {
		super(nombre);
		this.porcentaje = porcentaje;
	}
	
	@Override
	public Atributo efecto(Atributo a) {
		double valor = a.getValorConPocima();
		double valorExtra= valor / 100 * porcentaje;
		double nuevoValor = valor + valorExtra;
		a.setValorConPocima(nuevoValor);
		return a;
	}

}
