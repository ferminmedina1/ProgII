package TP8Navidad;

import java.util.ArrayList;



public class Buzon extends ElementoNavidad{
	
	private ArrayList<Integer> niniosBuenos;
	private ArrayList<Carta> cartas;
	
	public Buzon() {
		niniosBuenos = new ArrayList<>();
		cartas = new ArrayList<>();
	}
	
	
	public void addCarta(Carta c) {
		if(niniosBuenos.contains(c.getRemitente().getDni())) {
			c.getRemitente().setNinioBueno(true);
			if(!yaIngresoCarta(c)) {
				cartas.add(c);
				System.out.println("El ninio: "+ c.getRemitente() +" pudo ingresar su carta");
			}else {
				System.out.println("El ninio: "+ c.getRemitente()+ " ya ingreso una carta");
			}
		}else {
			System.out.println("el ninio: " + c.getRemitente() + " no esta en la lista de los ninios buenos.");
			c.getRemitente().setNinioBueno(false);
			c.setRegaloNinioMalo();
			cartas.add(c);
		}
	}
	
	private boolean yaIngresoCarta(Carta cartaNinio) {
		for (Carta carta : cartas) {
			if(carta.getRemitente().getDni() == cartaNinio.getRemitente().getDni()){
				return true;
			}
		}
		return false;
	}

	public void addNinioBueno(int dni) {
		this.niniosBuenos.add(dni);
	}


	@Override
	public int getCartasTotales() {
		return cartas.size();
	}


	@Override
	public int getCartasCumplidoras(Condicion c) {
		ArrayList<Carta> cartasCumplidoras = new ArrayList<>();
		
		for (Carta carta : cartas) {
			if(c.cumple(carta)) {
				cartasCumplidoras.add(carta);
			}
		}
		
		return cartasCumplidoras.size();
	}
}
