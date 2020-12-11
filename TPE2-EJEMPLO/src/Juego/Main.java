package Juego;

import java.util.ArrayList;

import Estrategia.Ambicioso;
import Estrategia.Estrategia;
import Estrategia.Obstinado;
import Estrategia.Timbero;
import Pocimas.FortalecedoraYReductora;
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
		Estrategia estrategia3 = new Obstinado();
		
		Jugador jugador1 = new Jugador("Fermin");
		Jugador jugador2 = new Jugador("Lucia", estrategia2);
		
		Pocima pocima1 = new FortalecedoraYReductora("FortalecedoraYReductora", 20);
		Pocima pocima2 = new FortalecedoraYReductora("FortalecedoraYReductora", 25);
		 
		Pocima pocima3 = new FortalecedoraYReductora("FortalecedoraYReductora PLUS", 50);
		Pocima pocima4 = new FortalecedoraYReductora("FortalecedoraYReductora PLUS 2", 70);
		
		Pocima pocima5 = new FortalecedoraYReductora("Kriptonita", -25);
		Pocima pocima6 = new FortalecedoraYReductora("Kriptonita 2", -30);
		
		Pocima pocima7 = new FortalecedoraYReductora("Reductor de plomo", -55);
		Pocima pocima8 = new FortalecedoraYReductora("Reductor de plomo 2", -70);
		
		Pocima pocima9 = new PocimaObstinada("Quiero vale cuatro", 4);
		Pocima pocima10 = new PocimaObstinada("Quiero retruco", 3);
		
		Pocima pocima11 = new PocimaObstinada("Número Mágico", 23);
		Pocima pocima12 = new PocimaObstinada("Número Mágico 2", 24);
				
		Pocima pocima13 = new PocimaSelectiva("Selectiva Fuerza", new Atributo("fuerza"),35);
		Pocima pocima14 = new PocimaSelectiva("Selectiva Fuerza 2", new Atributo("fuerza"),40);
		
		Pocima pocima15 = new PocimaSelectiva("Selectiva Peso", new Atributo("peso"),43);
		Pocima pocima16 = new PocimaSelectiva("Selectiva Peso 2", new Atributo("peso"),45);

		ArrayList<Pocima> arrayPocimasParaCocktail = new ArrayList<Pocima>();
		arrayPocimasParaCocktail.add(pocima3);
		arrayPocimasParaCocktail.add(pocima11);
		
		Pocima pocima17 = new PocimaConcatenadora("Cocktail", arrayPocimasParaCocktail);
		
		ArrayList<Pocima> arrayPocimasParaCocktail2 = new ArrayList<Pocima>();
		arrayPocimasParaCocktail2.add(pocima4);
		arrayPocimasParaCocktail2.add(pocima13);
		
		Pocima pocima18 = new PocimaConcatenadora("Cocktail 2", arrayPocimasParaCocktail2);
		
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

		System.out.println("ddsssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssddddd");
		
		juego.setRondasMax(50);
		juego.setMazo(mazo);
		juego.Jugar(jugador1, jugador2);
	}
}
