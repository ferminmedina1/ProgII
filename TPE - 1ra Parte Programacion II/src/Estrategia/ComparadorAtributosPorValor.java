package Estrategia;

import java.util.Comparator;

import Juego.Atributo;

public class ComparadorAtributosPorValor implements Comparator<Atributo>{

	@Override
	public int compare(Atributo a1, Atributo a2) {
		// TODO Auto-generated method stub
		return (int) (a2.getValor() - a1.getValor());
	}

}
