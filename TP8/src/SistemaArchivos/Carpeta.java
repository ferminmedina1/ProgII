package SistemaArchivos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Carpeta extends ElementoSA{
	
	private ArrayList<ElementoSA> elementos;
	
	public Carpeta(String nombre) {
		super(nombre);
		elementos = new ArrayList<ElementoSA>();
	}

	public void agregarElemento(ElementoSA elem) {
		elementos.add(elem);
	}
	
    public ArrayList<ElementoSA> getElementos() {
        return new ArrayList<>(elementos);
    }
    
	public ArrayList<ElementoSA> buscar(Filtro f){
		ArrayList<ElementoSA> elementosEncontrados = new ArrayList<ElementoSA>();
		for (ElementoSA elem : elementos) {
			elementosEncontrados.addAll(elem.buscar(f));
		}
		if(f.cumple(this))
			elementosEncontrados.add(this);
		
		return elementosEncontrados;
	}
	
	public ArrayList<ElementoSA> buscar(Filtro f, Comparator<ElementoSA> c){
		ArrayList<ElementoSA> elementosEncontrados = new ArrayList<ElementoSA>();
		for (ElementoSA elem : elementos) {
			elementosEncontrados.addAll(elem.buscar(f));
		}
		if(f.cumple(this))
			elementosEncontrados.add(this);
		
		Collections.sort(elementosEncontrados, c);
		
		return elementosEncontrados;
	}
	
	@Override
	public double getTamanio() {
		double tam = 0;
		for (ElementoSA elem : elementos) {
			tam += elem.getTamanio();
		}
		return tam;
	}
	
	public String toString() {
		return getNombre();
	}
}
