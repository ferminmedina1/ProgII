package PracticaNum4ejer4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integrante Barella = new Futbolista("Fermin","Medina", 9249, 22,01,2002,"delantero","derecho",23000);
		Barella.setEnPaisOrigen(true);
		Barella.setConcentrado(true);
		Barella.isEstado();
		
		Barella.imprimirEstado(Barella.isEstado());
		
		Integrante Morron = new Masajista("Manuel","Moauro", 9229, 2,05,2001,"Culopata", 4);

		Morron.setEnPaisOrigen(true);
		Morron.setConcentrado(true);
		Morron.isEstado();
		
		Morron.imprimirEstado(Morron.isEstado());
		
		Integrante Gordo = new Entrenador("Ignacio","Miguez", 9229, 1,8,2001,"federacion 1");

		Gordo.setEnPaisOrigen(true);
		Gordo.setConcentrado(false);
		Gordo.isEstado();
		
		Gordo.imprimirEstado(Gordo.isEstado());
		
		ArrayList<Integrante> seleccion = new ArrayList<Integrante>();
		seleccion.add(Barella);
		seleccion.add(Morron);
		seleccion.add(Gordo);
	}

}
