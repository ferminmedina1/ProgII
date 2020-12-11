package PracticaNum5ejer1;

import java.util.ArrayList;

public class Coleccion {
	
	ArrayList<Object> pilaElementos = new ArrayList<Object>();
	
	public Coleccion() {
		
	}
	
	public Coleccion(ArrayList<Object> pilaElementos) {
		this.pilaElementos = pilaElementos;
	}
	
	public void push(Object elem) {
		pilaElementos.add(elem);
		System.out.println("Se agrego el elemento numero " + pilaElementos.size() + " y se llama: " + elem.toString());
		System.out.println("******************************");
	}
	
	public Object pop() {
		int ultimoElementoPos = pilaElementos.size() - 1;
		Object elemBorrado = pilaElementos.get(ultimoElementoPos);
		pilaElementos.remove(ultimoElementoPos);

		System.out.println("Se borro el elemento: " + (ultimoElementoPos + 1) + ". Que tenia el nombre: " + elemBorrado.toString());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		return elemBorrado;
	}
	
	public Object top() {
		int ultimoElementoPos = pilaElementos.size() - 1;
		Object ultimoElem = pilaElementos.get(ultimoElementoPos);

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("En el tope de la pila se encuentra el objeto: " + ultimoElem.toString());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		return ultimoElem;
	}
	
	public void imprimirColeccion(){
		System.out.println("-----------------------------");	
		for (int i = 0; i < pilaElementos.size(); i++) {
			System.out.println(pilaElementos.get(i));		
		}
		System.out.println("-----------------------------");	
	}
}
