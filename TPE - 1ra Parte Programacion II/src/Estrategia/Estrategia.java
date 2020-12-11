package Estrategia;

import Juego.Atributo;
import Juego.Carta;

public interface Estrategia {

	public abstract Atributo elegirAtributo(Carta carta);
}
