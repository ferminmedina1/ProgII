package Juego;

import java.util.ArrayList;


import Estrategia.Estrategia;
import Estrategia.Timbero;

public class Jugador{
	
	private String nombre;
	private ArrayList<Carta>cartas;
	private Estrategia tipoJugador;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.cartas = new ArrayList<>();
		this.tipoJugador = new Timbero();
	}

	public Jugador(String nombre, Estrategia tipoJugador) {
		this.nombre = nombre;
		this.cartas = new ArrayList<>();
		this.tipoJugador = tipoJugador;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return nombre;
	}

	public ArrayList<Carta> getCartas() {
		return new ArrayList<>(cartas);
	}
	
	public int getCantidadCartas() {
		return this.cartas.size();
	}

	
	public void addCarta(Carta carta) {
		this.cartas.add(carta);
	}
	
	public void deleteCarta() {
		cartas.remove(0);
	}
	
	public void dejarUltimaCarta(Carta carta) {
		cartas.remove(0);
		cartas.add(carta);
	}
	
	public Carta getPrimerCarta() {
			return this.cartas.get(0);
	}
	
	public Atributo elegirAtributo(Carta carta) {
		Atributo a = tipoJugador.elegirAtributo(carta);
		if(a != null) {
		return a;
		}
		return null;
	}
	
	public Estrategia getTipoJugador() {
		return tipoJugador;
	}

	public void setTipoJugador(Estrategia tipoJugador) {
		this.tipoJugador = tipoJugador;
	}


}
