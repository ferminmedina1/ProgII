package SistemaArchivos;

import java.util.ArrayList;

public class Archivo extends ElementoSA{

	private double tamanio;
	
	
	public Archivo(String nombre, double tamanio) {
		super(nombre);
		this.tamanio = tamanio;
	}


	
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public double getTamanio() {
		return tamanio;
	}

	@Override
	public ArrayList<ElementoSA> buscar(Filtro f) {
		ArrayList<ElementoSA> elementosEncontrados = new ArrayList<ElementoSA>();
		if(f.cumple(this))
			elementosEncontrados.add(this);
		
		return elementosEncontrados;
	}
	
	public String toString() {
		return getNombre();
	}
}
