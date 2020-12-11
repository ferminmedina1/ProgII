package SistemaArchivos;

import java.util.ArrayList;

public class Link extends Archivo {
	
	private ElementoSA elemApuntado;
	
	public Link(String n,ElementoSA elem) {
		super(n, 0.1);
	}

    public ArrayList<ElementoSA> buscar(Filtro f) {
        ArrayList<ElementoSA> elemento = new ArrayList<ElementoSA>();
        if (f.cumple(this))
            elemento.add(this);
        return elemento;
    }
    
    public void setElementoAlQueAPunta(ElementoSA elementoAlQueAPunta) {
        this.elemApuntado = elementoAlQueAPunta;
    }
    
    public ElementoSA getElemApuntado() {
    	return elemApuntado;
    }
}
