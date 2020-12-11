package TP8Navidad;

import java.util.ArrayList;

public class Carta {

	private Ninio remitente;
	private ArrayList<String> regalos;
	
	public Carta(Ninio remitente) {
		super();
		this.remitente = remitente;
		regalos = new ArrayList<String>();
	}

	public Ninio getRemitente() {
		return remitente;
	}
	
	public void addRegalo(String s) {
		regalos.add(s.toLowerCase());
	}
	
	public void setRegaloNinioMalo() {
		regalos.clear();
		regalos.add("Trozo de carbón");
	}

	public ArrayList<String> getRegalos() {
		return new ArrayList<>(regalos);
	}
	
	public boolean contieneRegalo(String r) {
		return regalos.contains(r);
	}
}
