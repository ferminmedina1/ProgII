package Juego;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

import Pocimas.Pocima;

public class Juego {
	
	private Jugador jugador1;
	private Jugador jugador2;
	private Mazo mazo;
	private int rondasMax;
	private ArrayList<Pocima> pocimas;
	
	public Juego() {
		pocimas = new ArrayList<Pocima>();
	}
	
	public void Jugar(Jugador j1, Jugador j2) {
		this.jugador1 = j1;
		this.jugador2 = j2;
		repartirCartas();
		empezarAjugar();
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public Jugador getJugador1() {
		return jugador1;
	}

	public Mazo getMazo() {
		return mazo;
	}
	
	public int getRondasMax() {
		return rondasMax;
	}

	public void setRondasMax(int rondasMax) {
		this.rondasMax = rondasMax;
	}

	private void repartirCartas() {
		ArrayList<Carta>cartas = mazo.getCartas();
		repartirPocimas(cartas);
		
		int cartasXpersona = Math.round(cartas.size() / 2);		
		for (int i = cartasXpersona; i < cartas.size(); i++) {
			jugador1.addCarta(cartas.get(i));
		}
		for (int i = 0; i < cartasXpersona; i++) {
			jugador2.addCarta(cartas.get(i));
		}
		
	}

	private void repartirPocimas(ArrayList<Carta> cartas) {
		while (pocimas.size() != 0) {
			Pocima pocima = pocimas.get(0);
			ArrayList<Integer>numerosQueTocaron = new ArrayList<Integer>();
			while(pocimas.size() != 0) {
				int cartaAelegir = (int) Math.floor(Math.random() * Math.floor(cartas.size()));
				boolean yaTiene = false;
					
				if(numerosQueTocaron.contains(cartaAelegir))
						yaTiene = true;
				
				else if(!yaTiene) {
					Carta carta = cartas.get(cartaAelegir);
					carta.setPocion(pocima);
					numerosQueTocaron.add(cartaAelegir);
					pocimas.remove(pocima);
					break;
				}
			}
			
		}
	}

	private void empezarAjugar() {
		int ronda = 1;
		int cartaAelegir = 0;
		
		Jugador ganador = jugador1;
		Jugador perdedor = jugador2;
			
		while(ronda <= rondasMax && ganador.getCartas().size() > 0 && perdedor.getCartas().size() > 0 ) {
			Imprimir("----------------------- Ronda " + ronda + " -----------------------");
			ArrayList<Carta> cartasGanador = ganador.getCartas();
			ArrayList<Carta> cartasPerdedor = perdedor.getCartas();
			
			Carta cartaCompetidora = cartasGanador.get(cartaAelegir);

			Atributo atributoRandom2 = ganador.elegirAtributo(cartaCompetidora);
			
			Imprimir("El jugador " + ganador + " selecciona competir con el atributo " + atributoRandom2);
			
			int valorCartaCompetidoraGanador = (int) cartaCompetidora.getValorAtributo(atributoRandom2);
			
			if(cartaCompetidora.getPocion() == null)
			Imprimir("La carta de " + ganador + " es "+ cartaCompetidora + " con " + atributoRandom2 + " " +cartaCompetidora.getValorAtributo(atributoRandom2));
			else {
				Imprimir("La carta de " + ganador + " es "+ cartaCompetidora + " con " + atributoRandom2 + " " + cartaCompetidora.getValorAtributoSinPocion(atributoRandom2) + ", "
				+ "se aplico pocima " + cartaCompetidora.getPocion() + " valor resultante " + cartaCompetidora.getValorAtributo(atributoRandom2) );
			}
			
			Carta cartaCompetidoraPerdedor = cartasPerdedor.get(cartaAelegir);
			Atributo atributoElegidoPorGanador = cartaCompetidoraPerdedor.getAtributoConNombre(atributoRandom2);

			int valorCartaCompetidoraPerdedor = (int) cartaCompetidoraPerdedor.getValorAtributo(atributoElegidoPorGanador);
			
			if(cartaCompetidoraPerdedor.getPocion() == null)
				Imprimir("La carta de " + perdedor + " es "+ cartaCompetidoraPerdedor + " con " + atributoElegidoPorGanador + " " +valorCartaCompetidoraPerdedor);
			else {
				Imprimir("La carta de " + perdedor + " es "+ cartaCompetidoraPerdedor + " con " + atributoElegidoPorGanador + " " + cartaCompetidoraPerdedor.getValorAtributoSinPocion(atributoElegidoPorGanador) + ", "
				+ "se aplico pocima " + cartaCompetidoraPerdedor.getPocion() + " valor resultante " + cartaCompetidoraPerdedor.getValorAtributo(atributoElegidoPorGanador) );
			}
			
			Jugador ganadorAUX = ganador;
			
			ganador = decidirGanador(valorCartaCompetidoraGanador,valorCartaCompetidoraPerdedor,ganador,perdedor);
			
			if(ganador != null) {
				perdedor = setPerdedor(ganador);
				
				ganador.dejarUltimaCarta(cartaCompetidora);
				ganador.addCarta(cartaCompetidoraPerdedor);
				perdedor.deleteCarta();
				
				Imprimir("Gana la ronda " + ganador);
				
				Imprimir(ganador + " posee ahora " + ganador.getCantidadCartas() + " cartas y " + perdedor + " posee ahora " + perdedor.getCantidadCartas() + " cartas");
			}else {
				Imprimir("EMPATE! las cartas vuelven a sus respectivos mazos");
				ganadorAUX.dejarUltimaCarta(cartaCompetidora);
				perdedor.dejarUltimaCarta(cartaCompetidoraPerdedor);
				
				ganador = ganadorAUX;
				Imprimir(ganador + " posee " + ganador.getCantidadCartas() + " cartas y " + perdedor + " posee " + perdedor.getCantidadCartas() + " cartas");
				
			}
			ronda++;
			}
		ganador = decidirGanadorFinal(ganador,perdedor);
		if(ganador != null) {
		System.out.println("Termino el juego! El ganador final es: " + ganador);
		}else {
			System.out.println("EMPATE! fue un gran juego de ambos!");
		}
			
	}
	
	public void Imprimir(String s) {
		System.out.println(s);
	}
	
	private Jugador decidirGanador(int j1, int j2,Jugador ganador,Jugador perdedor) {

		int comparable = j1-j2;
		
		if (comparable > 0) {
			return ganador;
		}if (comparable < 0) {
			return perdedor;
		}else {
			return null;
		}
		
	}
	
	private Jugador decidirGanadorFinal(Jugador j1,Jugador j2) {
		if(j1.getCantidadCartas() > j2.getCantidadCartas()) 
			return j1;
		else if(j2.getCantidadCartas() > j1.getCantidadCartas()) 
			return j2;
		
		else {
			return null;
		}
	}

	private Jugador setPerdedor(Jugador ganador) {
		if(ganador.getNombre() == jugador2.getNombre()) 
			return jugador1;
		else if(ganador.getNombre() == jugador1.getNombre()) 
			return jugador2;
		
		return null;
	}
	
	public void setMazo(Mazo mazo) {
	    //URL url = getClass().getResource(jsonFile);
        File jsonInputFile = new File("./json2/superheroes.json");
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            JsonReader reader = Json.createReader(is);
            JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
            for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) {
            	String nombreCarta = carta.getString("nombre").toUpperCase();
            	Carta c1 = new Carta(nombreCarta);
            	
                JsonObject atributos = (JsonObject) carta.getJsonObject("atributos");
                for (String nombreAtributo:atributos.keySet()) {
                	Atributo a1 = new Atributo(nombreAtributo.toUpperCase(),atributos.getInt(nombreAtributo));
                	c1.addAtributo(a1);
                }
                mazo.addCarta(c1);
               this.mazo = mazo;
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

	public void agregarPocima(Pocima p) {
		// TODO Auto-generated method stub
		pocimas.add(p);
	}
	
	public ArrayList<Pocima> getPocimas(){
		return new ArrayList<>(pocimas);
	}

}
