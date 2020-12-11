package Juego;

import java.util.ArrayList;

import Estrategia.Ambicioso;
import Estrategia.Estrategia;
import Estrategia.Obstinado;
import Estrategia.Timbero;
import Pocimas.PocimaPorcentaje;
import Pocimas.Pocima;
import Pocimas.PocimaConcatenadora;
import Pocimas.PocimaObstinada;
import Pocimas.PocimaSelectiva;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Juego juego = new Juego();
		
		Estrategia estrategia1 = new Timbero();
		Estrategia estrategia2 = new Ambicioso();
		Estrategia estrategia3 = new Obstinado("altura");
		
		Jugador jugador1 = new Jugador("Fermin");
		Jugador jugador2 = new Jugador("Lucia", estrategia2);
		
		Pocima pocima1 = new PocimaPorcentaje("Fortalecedora", 20);
		Pocima pocima2 = new PocimaPorcentaje("Fortalecedora 2", 25);
		 
		Pocima pocima3 = new PocimaPorcentaje("Fortalecedora PLUS", 50);
		Pocima pocima4 = new PocimaPorcentaje("Fortalecedora PLUS 2", 70);
		
		Pocima pocima5 = new PocimaPorcentaje("Kriptonita", -25);
		Pocima pocima6 = new PocimaPorcentaje("Kriptonita 2", -30);
		
		Pocima pocima7 = new PocimaPorcentaje("Reductor de plomo", -55);
		Pocima pocima8 = new PocimaPorcentaje("Reductor de plomo 2", -70);
		
		Pocima pocima9 = new PocimaObstinada("Quiero vale cuatro", 4);
		Pocima pocima10 = new PocimaObstinada("Quiero retruco", 3);
		
		Pocima pocima11 = new PocimaObstinada("Número Mágico", 23);
		Pocima pocima12 = new PocimaObstinada("Número Mágico 2", 24);
				
		Pocima pocima13 = new PocimaSelectiva("Selectiva Fuerza", "Fuerza",35);
		Pocima pocima14 = new PocimaSelectiva("Selectiva Fuerza 2", "Fuerza",40);
		
		Pocima pocima15 = new PocimaSelectiva("Selectiva Peso", "Peso",43);
		Pocima pocima16 = new PocimaSelectiva("Selectiva Peso 2", "Peso",45);

		ArrayList<Pocima> arrayPocimasParaCocktail = new ArrayList<Pocima>();
		arrayPocimasParaCocktail.add(pocima1);
		arrayPocimasParaCocktail.add(pocima3);

		
		Pocima pocima17 = new PocimaConcatenadora("Cocktail", arrayPocimasParaCocktail);
		
		ArrayList<Pocima> arrayPocimasParaCocktail2 = new ArrayList<Pocima>();
		arrayPocimasParaCocktail2.add(pocima4);
		arrayPocimasParaCocktail2.add(pocima17);
		
		Pocima pocima18 = new PocimaConcatenadora("Cocktail 2", arrayPocimasParaCocktail2); 
		/*tambien podria crear un metodo en cocktail que sirva para agregar pocimas dentro de el mismo. 
		 Pero me resulto mejor pasarle un arraylist asi siempre se usa de manera "correcta".
		*/
		Mazo mazo = new Mazo();
		
		juego.agregarPocima(pocima1);
		juego.agregarPocima(pocima2);
		juego.agregarPocima(pocima3);
		juego.agregarPocima(pocima4);
		juego.agregarPocima(pocima5);
		juego.agregarPocima(pocima6);
		juego.agregarPocima(pocima7);
		juego.agregarPocima(pocima8);
		juego.agregarPocima(pocima9);
		juego.agregarPocima(pocima10);
		juego.agregarPocima(pocima11);
		juego.agregarPocima(pocima12);
		juego.agregarPocima(pocima13);
		juego.agregarPocima(pocima14);
		juego.agregarPocima(pocima15);
		juego.agregarPocima(pocima16);
		juego.agregarPocima(pocima17);
		juego.agregarPocima(pocima18);


		juego.setRondasMax(50);
		juego.setMazo(mazo);
		juego.Jugar(jugador1, jugador2);
	}
}
