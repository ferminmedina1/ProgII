package Estrategia;

import Juego.Atributo;
import Juego.Carta;

public class Obstinado implements Estrategia{
	
	@Override
	public Atributo elegirAtributo(Carta carta) {
		Atributo mismo = carta.getAtributos().get(0);
		return mismo;
	}

	
	
}
