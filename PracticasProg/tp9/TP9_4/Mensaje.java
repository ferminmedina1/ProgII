package TP9_4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mensaje {

	private ArrayList<String> palabras;
	private Persona emisor;
	private LocalDate fechaEnvio;
	
	public Mensaje(Persona emisor, LocalDate fechaEnvio) {
		super();
		this.palabras = new ArrayList<>();
		this.emisor = emisor;
		this.fechaEnvio = fechaEnvio;
	}
	
	public void addPalabra(String p) {
		palabras.add(p);
	}
	
	public String toString() {
		String mensaje = "";
		
		for (String palabra : palabras) {
			mensaje += palabra + " ";
		}
		
		return mensaje;
	}

	public Persona getEmisor() {
		return emisor;
	}

	public boolean contienePalabra(String palabra) {
		return palabras.contains(palabra);
	}
	
	public int getPalabrasSize() {
		return palabras.size();
	}
	
}
