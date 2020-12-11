package Estrategia;

import Juego.Atributo;
import Juego.Carta;

public class Obstinado implements Estrategia{
	
	private String nombreAtributo;
	
	 public Obstinado(String nombre) {
		nombreAtributo = nombre.toUpperCase();
	}
	
	@Override
	public Atributo elegirAtributo(Carta carta) {
		for (Atributo atributo : carta.getAtributos()) {
			if(atributo.getNombreAtributo().equals(nombreAtributo)) {
				return atributo;
			}
		}
		return null;
	}

	
	
}
