package TP9_4;

import java.util.ArrayList;

public class Persona extends ElementoSC implements Comparable<Persona>{
	
	private String nombre;
	private String apellido;
	private int legajo;
	private ArrayList<Mensaje> mensajes;
	
	public Persona(String nombre, String apellido, int legajo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		mensajes = new ArrayList<>();
	}
	
	public void enviarMensaje(Mensaje m, ArrayList<ElementoSC> e) {
		for (ElementoSC elem : e) {
			elem.recibirMensaje(m);			
		}
	}

	@Override
	public void recibirMensaje(Mensaje m) {
		if(!mensajes.contains(m))
			mensajes.add(m);
	}

	@Override
	public int getCantidadEmpleados() {
		return 1;
	}

	public ArrayList<Mensaje> getMensajes(){
		return new ArrayList<>(mensajes);
	}

	@Override
	public ArrayList<Persona> getEmpleados() {
		ArrayList<Persona> persona = new ArrayList<>();
		persona.add(this);
		return persona;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String toString() {
		return nombre + " " + apellido;
	}
	
	public boolean equals(Persona p) {
		return this.getNombre().equals(p.getNombre());
	}

	@Override
	public int compareTo(Persona p) {
		// TODO Auto-generated method stub
		return p.getMensajes().size() - this.getMensajes().size();
	}
}
