package TP9_4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona fermin = new Persona("Fermin", "Medina", 1);
		Persona lula = new Persona("Lucia", "Lapena", 1);
		
		Mensaje m1 = new Mensaje(fermin, LocalDate.now());
		m1.addPalabra("Hola");
		m1.addPalabra("a");
		m1.addPalabra("todos");
		
		GrupoCompuesto g1 = new GrupoCompuesto();
		g1.AgregarElem(fermin);
		g1.AgregarElem(lula);
		
		ArrayList<ElementoSC> elem = new ArrayList<>();
		elem.add(g1);
		
		Criterio c1 = new CriterioContienePalabra("Hola");
		Criterio c2 = new CriterioAdmin(lula);
		//g1.setCriterio(c1);
		
		fermin.enviarMensaje(m1, elem);
		
		Persona Gonza = new Persona("gonza", "rod", 1);
		Mensaje m2 = new Mensaje(Gonza, LocalDate.now());
		m2.addPalabra("Hola");
		m2.addPalabra("crack");
		m2.addPalabra("animal");
		
		ArrayList<ElementoSC> elem2 = new ArrayList<>();
		elem2.add(fermin);
		
		Gonza.enviarMensaje(m2, elem2);
		
		GrupoCompuesto g3 = new GrupoCompuesto();
		g3.AgregarElem(Gonza);
		g3.AgregarElem(g1);
		
		System.out.println(g1.getCantidadEmpleados());
		System.out.println(fermin.getMensajes());
		System.out.println(lula.getMensajes());
		System.out.println(Gonza.getMensajes());
		
		System.out.println(g3.getEmpleados());
		
		
	}

}
