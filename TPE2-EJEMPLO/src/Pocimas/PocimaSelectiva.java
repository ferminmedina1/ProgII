package Pocimas;

import Juego.Atributo;

public class PocimaSelectiva extends Pocima {

	private Atributo a1;
	private int porcentaje;
	
	public PocimaSelectiva(String nombre, Atributo a1,int porcentaje) {
		super(nombre);
		this.a1 = a1;
		this.porcentaje = porcentaje;
	}

	@Override
	public Atributo efecto(Atributo a) {
		if(a.equals(a1)) {
			Pocima p1 = new FortalecedoraYReductora("fortalecedora para pocima selectiva", porcentaje);
			p1.efecto(a);
		}
			
		return a;
	}

}
