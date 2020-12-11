package Estrategia;

import Juego.Atributo;
import Juego.Carta;

public class Timbero implements Estrategia{
	
	@Override
	public Atributo elegirAtributo(Carta carta) {
		int rangoMax = carta.getAtributos().size() - 1;
		Atributo random = carta.getAtributos().get((int) Math.round(Math.random() * rangoMax));
		return random;
	}

}
