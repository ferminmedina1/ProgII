package SistemaArchivos;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<ElementoSA>{

	@Override
	public int compare(ElementoSA e1, ElementoSA e2) {
		// TODO Auto-generated method stub
		return e1.getNombre().compareTo(e2.getNombre());
	}

	
}
