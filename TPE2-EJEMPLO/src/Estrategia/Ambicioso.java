package Estrategia;

import java.util.ArrayList;
import java.util.Collections;

import Juego.Atributo;
import Juego.Carta;

public class Ambicioso implements Estrategia{
	
	@Override
	public Atributo elegirAtributo(Carta carta) {
		ArrayList<Atributo> atributos = carta.getAtributos();
		Collections.sort(atributos,new ComparadorAtributosPorValor()); //ORGANIZA AL ARRAYLIST DE MAYOR VALOR A MENOR VALOR.
		Atributo mejor = atributos.get(0);
		return mejor;
	}

}
